/**
 * 
 */
package com.arkcloud.utils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.arkcloud.common.Constans;
import com.arkcloud.controller.exception.CustomException;

/**
 * 
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
public class UploadUtils {
	/**
	 * 
	 * @param client
	 * @param file
	 * @param request
	 * @param response
	 * @param serverPath
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public static String uploadToRemote(Client client, MultipartFile file, HttpServletRequest request,
			HttpServletResponse response, String serverPath, String filePath) throws Exception {
		// 文件名称生成策略（UUID uuid = UUID.randomUUID()）
		if (file != null) {
			String uuid = CommonUtils.getUUID();
			// 获取文件的扩展名
			String extension = FilenameUtils.getExtension(file.getOriginalFilename());
			// 文件名
			String fileName = uuid + "." + extension;
			// 相对路径
			String relaPath = filePath + fileName;

			String a = serverPath + filePath.substring(0, filePath.lastIndexOf("/"));
			File file2 = new File(a);
			if (!file2.exists()) {
				boolean mkdirs = file2.mkdirs();
				System.out.println(mkdirs);
			}

			// 另一台tomcat的URL（真实路径）
			String realPath = serverPath + relaPath;
			// 设置请求路径
			WebResource resource = client.resource(realPath);
			// 发送开始post get put（基于put提交）
			try {
				resource.put(String.class, file.getBytes());
				return fileName + ";" + relaPath + ";" + realPath;
			} catch (IOException e) {
				throw new CustomException(Constans.UPLOAD_FILE_FAIL + "-" + "306");
			}
		} else {
			throw new CustomException(Constans.UPLOAD_FILE_EMPTY + "-" + "305");
		}
	}

	/**
	 * 删除文件
	 * 
	 * @param filePath（文件完整地址：http://127.0.0.1:8090/upload/1234.jpg）
	 * @return
	 * @throws Exception
	 */
	public static String deleteFromRemote(String filePath) throws Exception {
		try {
			Client client = new Client();
			WebResource resource = client.resource(filePath);
			resource.delete();
			return "200";
		} catch (Exception e) {
			throw new CustomException(Constans.DELETE_ERR + "-" + "202");
		}
	}

	public String uploadToLocal(HttpServletRequest request, String localPath) throws Exception {
		String realPath = null;
		try {
			CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
					request.getSession().getServletContext());
			// 检查form中是否有enctype="multipart/form-data"
			if (multipartResolver.isMultipart(request)) {
				// 将request变成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				// 获取multiRequest 中所有的文件名
				Iterator<String> iter = multiRequest.getFileNames();

				while (iter.hasNext()) {
					// 一次遍历所有文件
					MultipartFile file = multiRequest.getFile(iter.next().toString());
					if (file != null) {
						realPath = localPath + file.getOriginalFilename();
						// 上传
						file.transferTo(new File(realPath));
					}
				}
			}
		} catch (Exception e) {
			throw new CustomException(Constans.UPLOAD_FILE_FAIL + "-" + "306");
		}
		return realPath;
	}
}
