package com.arkcloud.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arkcloud.dao.BackupJobMapper;
import com.arkcloud.pojo.BackupJobWithBLOBs;
import com.arkcloud.service.BackupJobService;

/**
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
@Service
public class BackupJobServiceImpl implements BackupJobService {
	@Autowired
	private BackupJobMapper backupJobMapper;

	@Override
	public BackupJobWithBLOBs addBackupJob(BackupJobWithBLOBs backupJob) throws Exception {
		backupJob.setCreatedAt(new Date());
		backupJobMapper.insertSelective(backupJob);
		return backupJob;
	}

}
