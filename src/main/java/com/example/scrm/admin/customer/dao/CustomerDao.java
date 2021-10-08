package com.example.scrm.admin.customer.dao;

import com.example.scrm.admin.customer.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "CustomerDao")
public interface CustomerDao {

    int deleteByPrimaryKey(String customType);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByCustomer(Customer customer);

    //通过loginIp查询用户信息并返回列表
    List<Customer> selectOnlineCustomerByPrimaryKey(Customer customer);

    Customer selectByPrimaryKey(String customerType);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}