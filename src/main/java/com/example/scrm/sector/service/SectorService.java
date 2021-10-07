package com.example.scrm.sector.service;

import com.example.scrm.sector.entity.Sector;

import java.util.List;

public interface SectorService {
    //根据部门名称，删除部门
    int deleteByPrimaryKey(String sectorNo);


    List<Sector> selectByOrganization(String organizType);

    //创建新部门
    int insert(Sector record,String organizName);

    //查询某个组织下的某个部门
    Sector selectSector(String sectorNo);


    //获取所有部门信息
    List<Sector> selectAllSector();

    //更改部门信息
    int updateByPrimaryKey(Sector record);
}
