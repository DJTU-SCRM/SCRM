package com.example.scrm.admin.customer.controller;

import com.example.scrm.admin.customer.entity.Customer;
import com.example.scrm.admin.customer.service.impl.CustomerServiceImp;
import com.example.scrm.util.UUIDUtil;
import com.example.scrm.util.response.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

/**
 * 客户信息管理
 *
 * @author Steven
 * @version 1.0
 * @date 2021/10/3 16:19
 *
 * @author 孙少聪
 * @version 2.0
 * @date 2021/10/4 13:49
 */

@RequestMapping("/backend/customerLogin")
@RestController
public class CustomerController {

    private Customer customer;

    @Autowired
    private CustomerServiceImp customerServiceImp;

    /**
     *
     * 查询所有客户的信息
     * @param customer
     * @author 孙少聪
     * @date  2021.10.04 17:57
     * @return java.lang.String
     */
    @RequestMapping(value="selectCustomers")
    public AppResponse selectCustomers(Customer customer) {

        return selectAllCustomers(customer);

    }

    /**
     *
     * 根据customerNo查询用户信息
     * @param customerNo
     * @author 孙少聪
     * @date  2021.10.04 18:10
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="selectCustomerByCustomerNo")
    public AppResponse selectOneCustomerByCustomerNo(String customerNo) {

        Customer customer = customerServiceImp.selectByPrimaryKey(customerNo);
        if(customer!=null){
            return AppResponse.success("customer", customer);
        }else{
            return AppResponse.notFound();
        }
    }

    /**
     *
     * 根据前端信息更新客户信息
     * @param customer
     * @author 孙少聪
     * @date  2021.10.04 19:50
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="updateCustomer")
    public AppResponse updateOneCustomer(@RequestBody Customer customer) {
        if(customer!=null){
            customerServiceImp.updateByPrimaryKeySelective(customer);
            Customer customerByCustomerNo = customerServiceImp.selectByPrimaryKey(customer.getCustomerNo());
            return AppResponse.success("customerByCustomerNo", customerByCustomerNo);
        }else{
            return AppResponse.notFound();
        }
    }

    /**
     *
     * 修改会员来源
     * @param customerNo
     * @param customerPlatformType
     * @author 孙少聪
     * @date  2021.10.06 15:28
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="updateOneCustomerPlatformType")
    public AppResponse updateOneCustomerPlatformType(String customerNo, String customerPlatformType) {

        Customer customer = new Customer();
        if(customerNo !=null && customerPlatformType!=null) {
            customer.setCustomerNo(customerNo);
            customer.setCustomerPlatformType(customerPlatformType);
            customerServiceImp.updateByPrimaryKeySelective(customer);
            Customer customerByCustomerNo = customerServiceImp.selectByPrimaryKey(customer.getCustomerNo());
            return AppResponse.success("customerByCustomerNo", customerByCustomerNo);

        }else {
            return AppResponse.notFound();
        }
    }

    /**
     *
     * 根据customerNo删除某条用户信息
     * @param customerNo
     * @author 孙少聪
     * @date  2021.10.05 10:06
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="deleteCustomerByCustomerNo")
    public AppResponse delectOneCustomerByCustomerNo(String customerNo) {
        customerServiceImp.deleteByPrimaryKey(customerNo);
        return selectAllCustomers(customer);
    }

    // 用户角色和权限的管理
    @RequestMapping(value="CustomerPowerManager")
    public AppResponse CustomerPowerManager(String customerNo) {
        // Todo
        return selectAllCustomers(customer);
    }

    /**
     *
     * 根据customer对象插入客户信息
     * @param customer
     * @author 孙少聪
     * @date  2021.10.05 15:12
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="insertCustomer")
    public AppResponse InsertCustomer(@RequestBody Customer customer) {

        customer.setCustomerNo(UUIDUtil.uuidStr());
        customerServiceImp.insertSelective(customer);
        return selectAllCustomers(customer);
    }

    /**
     *
     * 查看所有客户信息
     * @param customer
     * @author 孙少聪
     * @date  2021.10.5 10:10
     * @return com.example.scrm.util.response.AppResponse
     */
    private AppResponse selectAllCustomers(Customer customer){
        List<Customer> customerList = customerServiceImp.selectByCustomer(customer);
        if(customerList!=null){
            return AppResponse.success("customerList", customerList);
        }else{
            return AppResponse.notFound();
        }
    }


}
