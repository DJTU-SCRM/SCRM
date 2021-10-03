package com.example.scrm.organization.dao;

import com.example.scrm.organization.entity.organization;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface organizationDao {

    int deleteByPrimaryKey(String organizName);

    int insert(organization record);

    int insertSelective(organization record);

    organization selectByPrimaryKey(String organizName);

    int updateByPrimaryKeySelective(organization record);

    int updateByPrimaryKey(organization record);
}