package com.kuke.wuliu.dao;

import com.kuke.wuliu.pojo.Spartition;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpartitionMapper {
    int deleteByPrimaryKey(Integer spartitionId);

    int insert(Spartition record);

    int insertSelective(Spartition record);

    Spartition selectByPrimaryKey(Integer spartitionId);

    int updateByPrimaryKeySelective(Spartition record);

    int updateByPrimaryKey(Spartition record);
}