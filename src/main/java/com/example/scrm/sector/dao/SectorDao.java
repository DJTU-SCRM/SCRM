package com.example.scrm.sector.dao;

import com.example.scrm.sector.entity.Sector;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Mapper
@Component(value = "SectorDao")
public interface SectorDao {
    //根据部门名称，删除部门
    int deleteByPrimaryKey(String sectorNo);

    //根据所属组织，删除部门
    int deleteByOrganization(String organizNo);

    //创建新部门
    int insert(Sector record);

    //查询某一组织下所有部门
    List<Sector> selectByOrganization(String organizNo);

    //根据部门号，查询
    Sector selectSector(String sectorNo);

    //获取所有部门信息
    List<Sector> selectAllSector();

    //更改部门信息
    int updateByPrimaryKey(Sector record);
}