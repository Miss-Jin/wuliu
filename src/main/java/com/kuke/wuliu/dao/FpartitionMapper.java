package com.kuke.wuliu.dao;

import com.kuke.wuliu.pojo.Fpartition;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FpartitionMapper {
    int deleteByPrimaryKey(Integer fpartitionId);

    int insert(Fpartition record);

    int insertSelective(Fpartition record);

    Fpartition selectByPrimaryKey(Integer fpartitionId);

    int updateByPrimaryKeySelective(Fpartition record);

    int updateByPrimaryKey(Fpartition record);
}