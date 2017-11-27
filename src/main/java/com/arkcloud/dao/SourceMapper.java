package com.arkcloud.dao;

import com.arkcloud.pojo.Source;

public interface SourceMapper {
    int insert(Source record);

    int insertSelective(Source record);
}