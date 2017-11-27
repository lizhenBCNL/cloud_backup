/**
 * 
 */
package com.arkcloud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arkcloud.common.Constans;
import com.arkcloud.pojo.BackupJobWithBLOBs;
import com.arkcloud.pojo.ResultData;
import com.arkcloud.service.BackupJobService;

/**
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
@RestController
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestAction {
	@Autowired
	private ResultData resultData;
	@Autowired
	private BackupJobService backupJobService;

	@RequestMapping("/addBackupJob")
	public ResultData addBackupJob(BackupJobWithBLOBs backupJob, HttpServletRequest request) throws Exception {
		resultData.clear();
		BackupJobWithBLOBs tmp = backupJobService.addBackupJob(backupJob);
		resultData.setResult(200);
		resultData.setMessage(Constans.MESS_SUCCESS);
		resultData.setData(tmp);
		return resultData;
	}
}
