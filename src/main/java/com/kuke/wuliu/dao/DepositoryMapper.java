package com.kuke.wuliu.dao;

import com.kuke.wuliu.pojo.Depository;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepositoryMapper {
    int deleteByPrimaryKey(Integer depositoryId);

    int insert(Depository record);

    int insertSelective(Depository record);

    Depository selectByPrimaryKey(Integer depositoryId);

    int updateByPrimaryKeySelective(Depository record);

    int updateByPrimaryKey(Depository record);
}