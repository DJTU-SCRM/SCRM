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
    public int deleteByPrimaryKey(String customNo) {
        if (customNo!=null) {
            customerDao.deleteByPrimaryKey(customNo);
            return 1;
        }else{
            return 2;
        }
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
    public List<Customer> selectOnlineCustomerByPrimaryKey(Customer customer) {
        return customerDao.selectOnlineCustomerByPrimaryKey(customer);
    }

    @Override
    public Customer selectByPrimaryKey(String customNo) {
        return customerDao.selectByPrimaryKey(customNo);
    }

    @Override
    //1正常 2 CustomerNo为空
    public int updateByPrimaryKeySelective(Customer record) {
        if (record.getCustomerNo()!=null) {
            customerDao.updateByPrimaryKeySelective(record);
            return 1;
        }else {
            return 2;
        }
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        if (record.getCustomerNo()!=null) {
            customerDao.updateByPrimaryKey(record);
            return 1;
        }else{
            return 2;
        }
    }
}
