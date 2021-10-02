package com.example.scrm.sector.dao;

import com.example.scrm.sector.entity.sector;
import com.example.scrm.sector.entity.sectorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sectorDao {
    int countByExample(sectorExample example);

    int deleteByExample(sectorExample example);

    int deleteByPrimaryKey(String sectorName);

    int insert(sector record);

    int insertSelective(sector record);

    List<sector> selectByExample(sectorExample example);

    sector selectByPrimaryKey(String sectorName);

    int updateByExampleSelective(@Param("record") sector record, @Param("example") sectorExample example);

    int updateByExample(@Param("record") sector record, @Param("example") sectorExample example);

    int updateByPrimaryKeySelective(sector record);

    int updateByPrimaryKey(sector record);
}