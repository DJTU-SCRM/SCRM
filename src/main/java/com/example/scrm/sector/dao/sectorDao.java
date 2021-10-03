package com.example.scrm.sector.dao;

import com.example.scrm.sector.entity.sector;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sectorDao {
    int deleteByPrimaryKey(String sectorName);

    int insert(sector record);

    int insertSelective(sector record);

    sector selectByPrimaryKey(String sectorName);

    int updateByPrimaryKeySelective(sector record);

    int updateByPrimaryKey(sector record);
}