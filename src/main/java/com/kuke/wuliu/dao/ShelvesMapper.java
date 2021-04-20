package com.kuke.wuliu.dao;

import com.kuke.wuliu.pojo.Shelves;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShelvesMapper {
    int deleteByPrimaryKey(Integer shelvesId);

    int insert(Shelves record);

    int insertSelective(Shelves record);

    Shelves selectByPrimaryKey(Integer shelvesId);

    int updateByPrimaryKeySelective(Shelves record);

    int updateByPrimaryKey(Shelves record);
}