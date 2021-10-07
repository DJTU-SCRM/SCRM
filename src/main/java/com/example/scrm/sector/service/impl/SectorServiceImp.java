package com.example.scrm.sector.service.impl;

import com.example.scrm.organization.dao.OrganizationDao;
import com.example.scrm.sector.dao.SectorDao;
import com.example.scrm.sector.entity.Sector;
import com.example.scrm.sector.service.SectorService;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TODO
 *
 * @author zty
 * @version 1.0
 * @date 2021/10/4 16:22
 */
@Service
public class SectorServiceImp implements SectorService {
    @Autowired
    private SectorDao sectorDao;
    @Autowired
    private OrganizationDao organizationDao;
    @Override
    public List<Sector> selectAllSector(){
        return sectorDao.selectAllSector();
    }

    public int deleteByPrimaryKey(String sectorNo){
        return sectorDao.deleteByPrimaryKey(sectorNo);
    }

    public int insert(Sector record,String organizName){
        //根据组织名称查询组织号
        String organizNo=organizationDao.selectOrganizNo(organizName);
        System.out.println(organizNo);
        record.setOrganizNo(organizNo);
        System.out.println(record.toString());
        return sectorDao.insert(record);
    }

    public Sector selectSector(String sectorNo){
        return sectorDao.selectSector(sectorNo);
    }

    public int updateByPrimaryKey(Sector record){
        return sectorDao.updateByPrimaryKey(record);
    }

    public List<Sector> selectByOrganization(String organizType){ return sectorDao.selectByOrganization(organizType);}
}
