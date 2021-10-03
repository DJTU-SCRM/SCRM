package com.example.scrm.admin.customer.dao;

import com.example.scrm.admin.customer.entity.Customer;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerDao {

    int deleteByPrimaryKey(Short customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Short customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}