package com.arkcloud.dao;

import com.arkcloud.pojo.BackupJob;
import com.arkcloud.pojo.BackupJobWithBLOBs;

public interface BackupJobMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BackupJobWithBLOBs record);

    int insertSelective(BackupJobWithBLOBs record);

    BackupJobWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BackupJobWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BackupJobWithBLOBs record);

    int updateByPrimaryKey(BackupJob record);
}