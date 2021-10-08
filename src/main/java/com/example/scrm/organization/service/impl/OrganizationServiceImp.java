package com.example.scrm.organization.service.impl;

import com.example.scrm.organization.dao.OrganizationDao;
import com.example.scrm.organization.entity.Organization;
import com.example.scrm.organization.service.OrganizationService;
import com.example.scrm.sector.dao.SectorDao;
import com.example.scrm.sector.entity.Sector;
import com.example.scrm.sector.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TODO
 *
 * @author zty
 * @version 1.0
 * @date 2021/10/4 10:00
 */
@Service
public class OrganizationServiceImp implements OrganizationService {

    @Autowired
    private OrganizationDao organizationDao;
    @Autowired
    private SectorDao sectorDao;
    @Override
    public List<Organization> selectAllOrganization(){
        return organizationDao.selectAllOrganization();
    }

    public int deleteByPrimaryKey(String organizaName){
        //根据组织名称查询组织号
        String organizNo=organizationDao.selectOrganizNo(organizaName);
        //删除该组织下所有部门
        sectorDao.deleteByOrganization(organizNo);
        return organizationDao.deleteByPrimaryKey(organizaName);
    }



    public int insert(Organization record){ return organizationDao.insert(record); }


    public int updateByPrimaryKey(Organization record){
        return organizationDao.updateByPrimaryKey(record);
    }


    }
