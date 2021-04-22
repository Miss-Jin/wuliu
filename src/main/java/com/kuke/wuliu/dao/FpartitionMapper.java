package com.kuke.wuliu.dao;

import com.kuke.wuliu.pojo.Fpartition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FpartitionMapper {
    int deleteByPrimaryKey(Integer fpartitionId);

    int insert(Fpartition record);

    int insertSelective(Fpartition record);

    Fpartition selectByPrimaryKey(Integer fpartitionId);

    List<Fpartition> selectByDepId(Integer depid);

    int updateByPrimaryKeySelective(Fpartition record);

    int updateByPrimaryKey(Fpartition record);
}