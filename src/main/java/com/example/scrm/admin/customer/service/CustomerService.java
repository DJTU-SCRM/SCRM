package com.example.scrm.admin.customer.service;

import com.example.scrm.admin.customer.entity.Customer;
import java.util.List;

public interface CustomerService {

    int deleteByPrimaryKey(String customType);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByCustomer(Customer customer);

    List<Customer> selectOnlineCustomerByPrimaryKey(Customer customer);

    Customer selectByPrimaryKey(String customerType);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}
