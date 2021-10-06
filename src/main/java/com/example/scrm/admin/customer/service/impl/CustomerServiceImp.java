package com.example.scrm.admin.customer.service.impl;

import com.example.scrm.admin.customer.dao.CustomerDao;
import com.example.scrm.admin.customer.entity.Customer;
import com.example.scrm.admin.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author Steven
 * @version 1.0
 * @date 2021/10/3 16:20
 *
 * @author 孙少聪
 * @version 2.0
 * @date 2021/10/3 19:59
 */

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public int deleteByPrimaryKey(String customType) {
        return customerDao.deleteByPrimaryKey(customType);
    }

    @Override
    public int insert(Customer record) {
        return customerDao.insert(record);
    }

    @Override
    public int insertSelective(Customer record) {
        return customerDao.insertSelective(record);
    }

    @Override
    public List<Customer> selectByCustomer(Customer customer) {
        return customerDao.selectByCustomer(customer);
    }

    @Override
    public Customer selectByPrimaryKey(String userAccount) {
        return customerDao.selectByPrimaryKey(userAccount);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return customerDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return customerDao.updateByPrimaryKey(record);
    }
}
