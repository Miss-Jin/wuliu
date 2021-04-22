package com.kuke.wuliu.dao;

import com.kuke.wuliu.pojo.Depository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepositoryMapper {
    int deleteByPrimaryKey(Integer depositoryId);

    int insert(Depository record);

    int insertSelective(Depository record);

    Depository selectByPrimaryKey(Integer depositoryId);

    List<Depository> selectAll();

    int updateByPrimaryKeySelective(Depository record);

    int updateByPrimaryKey(Depository record);
}