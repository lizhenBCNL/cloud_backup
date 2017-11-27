package com.arkcloud.dao;

import com.arkcloud.pojo.BackupTask;

public interface BackupTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BackupTask record);

    int insertSelective(BackupTask record);

    BackupTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BackupTask record);

    int updateByPrimaryKeyWithBLOBs(BackupTask record);

    int updateByPrimaryKey(BackupTask record);
}