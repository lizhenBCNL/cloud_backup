/**
 * 
 */
package com.arkcloud.service;

import com.arkcloud.pojo.BackupJobWithBLOBs;

/**
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
public interface BackupJobService {
	public BackupJobWithBLOBs addBackupJob(BackupJobWithBLOBs backupJob) throws Exception;
}
