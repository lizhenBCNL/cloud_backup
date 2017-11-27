package com.arkcloud.utils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.arkcloud.pojo.ResultData;

/**
 * 
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
public class CommonUtils {
	/**
	 * 
	 * @param strs
	 * @return
	 */
	public static boolean isValid(String... strs) {
		for (String str : strs) {
			if (str == null || str.trim().isEmpty())
				return false;
		}
		return true;
	}

	/**
	 * 拦截器返回通用函数
	 * 
	 * @param response
	 * @param mess
	 * @param result
	 * @return
	 * @throws Exception
	 */
	public static boolean responseMess(HttpServletResponse response, String mess, int result) throws Exception {
		ResultData rData = new ResultData();
		rData.setMessage(mess);
		rData.setResult(result);
		rData.setData(null);
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(JSON.toJSON(rData).toString());
		return false;
	}

	/**
	 * 判断字符串或对象非空
	 * 
	 * @author wxd
	 * @param o
	 * @return
	 * @date 2016-4-8下午4:24:38
	 */
	public static boolean isNotNull(Object o) {
		if (o == null) {
			return false;
		}
		if (org.apache.commons.lang.StringUtils.isBlank(o.toString())) {
			return false;
		}
		return true;
	}

	/**
	 * 去除右侧空格
	 * 
	 * @author wxd
	 * @param s
	 * @return
	 * @date 2016-4-8下午4:24:31
	 */
	public static String rightTrim(String s) {
		if ((s == null) || (s.trim().length() == 0))
			return null;
		if (s.trim().length() == s.length())
			return s;
		if (!s.startsWith(" ")) {
			return s.trim();
		}
		return s.substring(0, s.indexOf(s.trim().substring(0, 1)) + s.trim().length());
	}

	/**
	 * 去除左侧空格
	 * 
	 * @author wxd
	 * @param s
	 * @return
	 * @date 2016-4-8下午4:24:24
	 */
	public static String leftTrim(String s) {
		if ((s == null) || (s.trim().length() == 0))
			return null;
		if (s.trim().length() == s.length())
			return s;
		if (!s.startsWith(" ")) {
			return s;
		}
		return s.substring(s.indexOf(s.trim().substring(0, 1)));
	}

	/**
	 * 转义html特殊字符（<,>,空格，\）
	 * 
	 * @author wxd
	 * @param html
	 * @return
	 * @date 2016-4-8下午4:24:12
	 */
	public static String replaceHtmlToStr(String html) {
		if (org.apache.commons.lang.StringUtils.isBlank(html)) {
			return null;
		}
		return html.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&nbsp;", " ").replaceAll("&quot;",
				"\"");
	}

	/**
	 * 获取UUID
	 * 
	 * @author wxd
	 * @return
	 * @date 2016-4-8下午4:24:05
	 */
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

	/**
	 * 读取/config.properties的配置文件
	 * 
	 * @author wxd
	 * @return
	 * @date 2016-4-8下午4:23:52
	 */
	public static Properties getProperties() {
		// 使用InputStream得到一个资源文件
		InputStream inputstream = CommonUtils.class.getResourceAsStream("/config.properties");
		Properties properties = new Properties();
		try {
			// 加载配置文件
			properties.load(inputstream);
			return properties;
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				inputstream.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * 根据key获取对应的值
	 * 
	 * @author wxd
	 * @param key
	 * @return
	 * @date 2016-4-8下午4:23:43
	 */
	public static String getValueFromProperties(String key) {
		Properties p = getProperties();
		return p.getProperty(key);
	}

	/**
	 * 将长时间格式字符串转换为时间（ 默认 yyyy-MM-dd HH:mm:ss）
	 * 
	 * @author wxd
	 * @param strDate
	 * @param pattern
	 * @return
	 * @date 2016-4-8下午4:23:37
	 */
	public static Date strToDateLong(String strDate, String... pattern) {
		SimpleDateFormat formatter = null;
		if (pattern.length > 0 && pattern[0] != null) {
			formatter = new SimpleDateFormat(pattern[0]);
		} else {
			formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(strDate, pos);
		return strtodate;
	}

	/**
	 * 将长时间格式时间转换为字符串（ 默认 yyyy-MM-dd HH:mm:ss）
	 * 
	 * @author wxd
	 * @param dateDate
	 * @param pattern
	 * @return
	 * @date 2016-4-8下午4:23:28
	 */
	public static String dateToStrLong(Date dateDate, String... pattern) {
		SimpleDateFormat formatter = null;
		if (pattern.length > 0 && pattern[0] != null) {
			formatter = new SimpleDateFormat(pattern[0]);
		} else {
			formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
		String dateString = formatter.format(dateDate);
		return dateString;
	}

	/**
	 * 时间戳转化为如期格式，默认格式 yyyy-MM-dd HH:mm:ss
	 * 
	 * @author wxd
	 * @param timeStamp
	 * @param pattern
	 * @return
	 * @date 2016年6月6日上午9:23:29
	 */
	public static String dateFormatter(long timeStamp, String... pattern) {
		SimpleDateFormat formatter = null;
		if (pattern.length > 0 && pattern[0] != null) {
			formatter = new SimpleDateFormat(pattern[0]);
		} else {
			formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(timeStamp);
		return formatter.format(calendar.getTime());
	}

	/**
	 * 返回错误信息
	 * 
	 * @author wxd
	 * @param code
	 *            错误代码
	 * @param message
	 *            错误信息
	 * @return
	 * @date 2016-4-12下午3:37:34
	 */

	public static String outResult(Object object, String callback) {
		return callback + "(" + JSON.toJSONString(object) + ")";
	}

	/**
	 * 获取uid
	 * 
	 * @author wxd
	 * @return
	 * @date 2016-4-5上午10:37:24
	 */
	public static String getUid() {
		UUID uid = UUID.randomUUID();
		return uid.toString().replace("-", "");
	}

	/**
	 * 验证ip是否在合法的网段内
	 * 
	 * @author wxd
	 * @param ipSection
	 * @param ip
	 * @return
	 * @date 2016-4-28下午6:28:27
	 */
	public static boolean ipIsValid(String ipSection, String ip) {
		if (ipSection == null)
			throw new NullPointerException("IP段不能为空！");

		if (ip == null)
			throw new NullPointerException("IP不能为空！");

		ipSection = ipSection.trim();
		ip = ip.trim();

		final String REGX_IP = "((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)";
		final String REGX_IPB = REGX_IP + "\\-" + REGX_IP;

		if (!ipSection.matches(REGX_IPB) || !ip.matches(REGX_IP))
			return false;

		int idx = ipSection.indexOf('-');
		String[] sips = ipSection.substring(0, idx).split("\\.");
		String[] sipe = ipSection.substring(idx + 1).split("\\.");
		String[] sipt = ip.split("\\.");

		long ips = 0L, ipe = 0L, ipt = 0L;
		for (int i = 0; i < 4; ++i) {
			ips = ips << 8 | Integer.parseInt(sips[i]);
			ipe = ipe << 8 | Integer.parseInt(sipe[i]);
			ipt = ipt << 8 | Integer.parseInt(sipt[i]);
		}

		if (ips > ipe) {
			long t = ips;
			ips = ipe;
			ipe = t;
		}

		return ips <= ipt && ipt <= ipe;
	}

	/**
	 * 获取客户端IP地址.<br>
	 * 支持多级反向代理
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @return 客户端真实IP地址
	 */
	public static String getRemoteAddr(final HttpServletRequest request) {
		try {
			String remoteAddr = request.getHeader("X-Forwarded-For");
			// 如果通过多级反向代理，X-Forwarded-For的值不止一个，而是一串用逗号分隔的IP值，此时取X-Forwarded-For中第一个非unknown的有效IP字符串
			if (isEffective(remoteAddr) && (remoteAddr.indexOf(",") > -1)) {
				String[] array = remoteAddr.split(",");
				for (String element : array) {
					if (isEffective(element)) {
						remoteAddr = element;
						break;
					}
				}
			}
			if (!isEffective(remoteAddr)) {
				remoteAddr = request.getHeader("X-Real-IP");
			}
			if (!isEffective(remoteAddr)) {
				remoteAddr = request.getRemoteAddr();
			}
			return remoteAddr;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 获取客户端源端口
	 * 
	 * @param request
	 * @return
	 */
	public static String getRemotePort(final HttpServletRequest request) {
		try {
			String port = request.getHeader("remote-port");
			if (isNotNull(port)) {
				try {
					return port;
				} catch (NumberFormatException ex) {
					ex.printStackTrace();
					return "0l";
				}
			} else {
				return "0l";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "0l";
		}
	}

	/**
	 * 远程地址是否有效.
	 * 
	 * @param remoteAddr
	 *            远程地址
	 * @return true代表远程地址有效，false代表远程地址无效
	 */
	private static boolean isEffective(final String remoteAddr) {
		boolean isEffective = false;
		if ((null != remoteAddr) && (!"".equals(remoteAddr.trim()))
				&& (!"unknown".equalsIgnoreCase(remoteAddr.trim()))) {
			isEffective = true;
		}
		return isEffective;
	}

	/**
	 * 利用反射实现对象之间相同属性复制
	 * 
	 * @author wxd
	 * @param source
	 *            源对象
	 * @param target
	 *            目标对象
	 * @throws Exception
	 * @date 2016-5-6下午1:47:14
	 */
	public static void copyProperties(Object source, Object target) throws Exception {
		copyPropertiesExclude(source, target, null);
	}

	/**
	 * 复制对象属性
	 * 
	 * @author wxd
	 * @param from
	 * @param to
	 * @param excludsArray
	 *            排除属性列表
	 * @throws Exception
	 * @date 2016-5-6下午1:47:52
	 */
	public static void copyPropertiesExclude(Object from, Object to, String[] excludsArray) throws Exception {

		List<String> excludesList = null;

		if (excludsArray != null && excludsArray.length > 0) {
			// 构造列表对象
			excludesList = Arrays.asList(excludsArray);
		}

		Method[] fromMethods = from.getClass().getDeclaredMethods();
		Method[] toMethods = to.getClass().getDeclaredMethods();
		Method fromMethod = null, toMethod = null;
		String fromMethodName = null, toMethodName = null;

		for (int i = 0; i < fromMethods.length; i++) {

			fromMethod = fromMethods[i];
			fromMethodName = fromMethod.getName();

			if (!fromMethodName.contains("get"))
				continue;
			// 排除列表检测
			if (excludesList != null && excludesList.contains(fromMethodName.substring(3).toLowerCase())) {

				continue;
			}
			toMethodName = "set" + fromMethodName.substring(3);
			toMethod = findMethodByName(toMethods, toMethodName);

			if (toMethod == null)
				continue;
			Object value = fromMethod.invoke(from, new Object[0]);

			if (value == null)
				continue;
			// 集合类判空处理
			if (value instanceof Collection) {

				Collection<?> newValue = (Collection<?>) value;

				if (newValue.size() <= 0)
					continue;
			}

			toMethod.invoke(to, new Object[] { value });
		}
	}

	/**
	 * 对象属性值复制，仅复制指定名称的属性值
	 * 
	 * @author wxd
	 * @param from
	 * @param to
	 * @param includsArray
	 * @throws Exception
	 * @date 2016-5-6下午1:49:02
	 */
	public static void copyPropertiesInclude(Object from, Object to, String[] includsArray) throws Exception {

		List<String> includesList = null;

		if (includsArray != null && includsArray.length > 0) {

			includesList = Arrays.asList(includsArray);

		} else {

			return;
		}
		Method[] fromMethods = from.getClass().getDeclaredMethods();
		Method[] toMethods = to.getClass().getDeclaredMethods();
		Method fromMethod = null, toMethod = null;
		String fromMethodName = null, toMethodName = null;

		for (int i = 0; i < fromMethods.length; i++) {

			fromMethod = fromMethods[i];
			fromMethodName = fromMethod.getName();

			if (!fromMethodName.contains("get"))
				continue;

			// 排除列表检测
			String str = fromMethodName.substring(3);

			if (!includesList.contains(str.substring(0, 1).toLowerCase() + str.substring(1))) {
				continue;
			}

			toMethodName = "set" + fromMethodName.substring(3);
			toMethod = findMethodByName(toMethods, toMethodName);

			if (toMethod == null)
				continue;

			Object value = fromMethod.invoke(from, new Object[0]);

			if (value == null)
				continue;

			// 集合类判空处理
			if (value instanceof Collection) {

				Collection<?> newValue = (Collection<?>) value;

				if (newValue.size() <= 0)
					continue;
			}

			toMethod.invoke(to, new Object[] { value });
		}
	}

	/**
	 * 从方法数组中获取指定名称的方法
	 * 
	 * @author wxd
	 * @param methods
	 * @param name
	 * @return
	 * @date 2016-5-6下午1:49:19
	 */
	public static Method findMethodByName(Method[] methods, String name) {

		for (int j = 0; j < methods.length; j++) {

			if (methods[j].getName().equals(name)) {

				return methods[j];
			}

		}
		return null;
	}

	/**
	 * 获取时间戳
	 * 
	 * @author wxd
	 * @return
	 * @date 2016-5-13下午1:42:30
	 */
	public static long getTimeStamp() {
		return new Date().getTime();
	}
}
