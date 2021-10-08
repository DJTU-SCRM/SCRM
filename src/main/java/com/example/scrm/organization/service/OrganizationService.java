package com.example.scrm.organization.service;

import com.example.scrm.organization.entity.Organization;

import java.util.List;

public interface OrganizationService {
    //查询所有组织信息
    List<Organization> selectAllOrganization();
    //按组织名删除组织信息，(并删除组织下所有部门)
    int deleteByPrimaryKey(String organizaName);
    //创建新的组织
    int insert(Organization record);
    //更新组织信息
    int updateByPrimaryKey(Organization record);

}
