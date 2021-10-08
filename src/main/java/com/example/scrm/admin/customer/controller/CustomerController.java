package com.example.scrm.admin.customer.controller;

import com.example.scrm.admin.customer.entity.Customer;
import com.example.scrm.admin.customer.service.impl.CustomerServiceImp;
import com.example.scrm.util.UUIDUtil;
import com.example.scrm.util.response.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
     * 查询所有客户的信息
     *
     * @param customer
     * @return java.lang.String
     * @author 孙少聪
     * @date 2021.10.04 17:57
     */
    @GetMapping(value = "selectCustomers")
    public AppResponse selectCustomers(Customer customer) {

        return selectAllCustomers(customer);

    }

    /**
     * 根据customerNo查询用户信息
     *
     * @param customerNo
     * @return com.example.scrm.util.response.AppResponse
     * @author 孙少聪
     * @date 2021.10.04 18:10
     */
    @GetMapping(value = "selectCustomerByCustomerNo")
    public AppResponse selectOneCustomerByCustomerNo(String customerNo) {

        Customer customer = customerServiceImp.selectByPrimaryKey(customerNo);
        if (customer != null) {
            return AppResponse.success("customer", customer);
        } else {
            return AppResponse.notFound();
        }
    }

    /**
     * 根据前端信息更新客户信息
     *
     * @param customer
     * @return com.example.scrm.util.response.AppResponse
     * @author 孙少聪
     * @date 2021.10.04 19:50
     */
    @PostMapping(value = "updateCustomer")
    public AppResponse updateOneCustomer(Customer customer) {
        if (customer != null) {
            customerServiceImp.updateByPrimaryKeySelective(customer);
            Customer customerByCustomerNo = customerServiceImp.selectByPrimaryKey(customer.getCustomerNo());
            return AppResponse.success("customerByCustomerNo", customerByCustomerNo);
        } else {
            return AppResponse.notFound();
        }
    }

    /**
     * 修改会员来源
     *
     * @param customerNo
     * @param customerPlatformType
     * @return com.example.scrm.util.response.AppResponse
     * @author 孙少聪
     * @date 2021.10.06 15:28
     */
    @PostMapping(value = "updateOneCustomerPlatformType")
    public AppResponse updateOneCustomerPlatformType(String customerNo, String customerPlatformType) {

        Customer customer = new Customer();
        if (customerNo != null && customerPlatformType != null) {
            customer.setCustomerNo(customerNo);
            customer.setCustomerPlatformType(customerPlatformType);
            customerServiceImp.updateByPrimaryKeySelective(customer);
            Customer customerByCustomerNo = customerServiceImp.selectByPrimaryKey(customer.getCustomerNo());
            return AppResponse.success("customerByCustomerNo", customerByCustomerNo);

        } else {
            return AppResponse.notFound();
        }
    }

    /**
     * 根据customerNo删除某条用户信息
     *
     * @param customerNo
     * @return com.example.scrm.util.response.AppResponse
     * @author 孙少聪
     * @date 2021.10.05 10:06
     */
    @PostMapping(value = "deleteCustomerByCustomerNo")
    public AppResponse delectOneCustomerByCustomerNo(String customerNo) {
        customerServiceImp.deleteByPrimaryKey(customerNo);
        return selectAllCustomers(customer);
    }

    // 用户角色和权限的管理
    @PostMapping(value = "CustomerPowerManager")
    public AppResponse CustomerPowerManager(String customerNo) {
        // Todo
        return selectAllCustomers(customer);
    }

    /**
     * 根据customer对象插入客户信息
     *
     * @param customer
     * @return com.example.scrm.util.response.AppResponse
     * @author 孙少聪
     * @date 2021.10.05 15:12
     */
    @PostMapping(value = "insertCustomer")
    public AppResponse InsertCustomer(Customer customer) {

        customer.setCustomerNo(UUIDUtil.uuidStr());
        customerServiceImp.insertSelective(customer);
        return selectAllCustomers(customer);
    }

    //查看在线会员的人员信息
    @GetMapping(value = "onlineCustomerList")
    public AppResponse onlineCustomerList(Customer customer) {

        List<Customer> onlineCustomerList = customerServiceImp.selectOnlineCustomerByPrimaryKey(customer);
        if (onlineCustomerList != null) {
            return AppResponse.success("onlineCustomerList", onlineCustomerList);
        } else {
            return AppResponse.notFound("无在线用户");
        }

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
