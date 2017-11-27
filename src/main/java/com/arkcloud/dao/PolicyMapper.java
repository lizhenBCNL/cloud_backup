package com.arkcloud.dao;

import com.arkcloud.pojo.Policy;

public interface PolicyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Policy record);

    int insertSelective(Policy record);

    Policy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Policy record);

    int updateByPrimaryKey(Policy record);
}