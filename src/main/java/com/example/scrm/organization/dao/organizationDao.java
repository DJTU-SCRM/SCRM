package com.example.scrm.organization.dao;

import com.example.scrm.organization.entity.organization;
import com.example.scrm.organization.entity.organizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface organizationDao {
    int countByExample(organizationExample example);

    int deleteByExample(organizationExample example);

    int deleteByPrimaryKey(String organizName);

    int insert(organization record);

    int insertSelective(organization record);

    List<organization> selectByExample(organizationExample example);

    organization selectByPrimaryKey(String organizName);

    int updateByExampleSelective(@Param("record") organization record, @Param("example") organizationExample example);

    int updateByExample(@Param("record") organization record, @Param("example") organizationExample example);

    int updateByPrimaryKeySelective(organization record);

    int updateByPrimaryKey(organization record);
}