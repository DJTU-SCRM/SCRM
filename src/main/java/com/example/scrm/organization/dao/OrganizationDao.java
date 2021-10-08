package com.example.scrm.organization.dao;

import com.example.scrm.organization.entity.Organization;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "OrganizationDao")
public interface OrganizationDao {


    //按照组织名删除组织
    int deleteByPrimaryKey(String organizName);

    //插入新组织
    int insert(Organization record);

    //查询所有组织
    List<Organization> selectAllOrganization();

    //根据组织名称查询组织号
    String selectOrganizNo(String organizName);

    //修改组织属性
    int updateByPrimaryKey(Organization record);
}