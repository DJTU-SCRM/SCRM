package com.example.scrm.admin.user.controller;

import com.example.scrm.admin.user.entity.User;
import com.example.scrm.admin.user.service.impl.UserServiceImp;
import com.example.scrm.util.CreateMD5;
import com.example.scrm.util.UUIDUtil;
import com.example.scrm.util.response.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * TODO
 *
 * @author Steven
 * @version 1.0
 * @date 2021/10/3 16:20
 *
 *  @author 孙少聪
 *  @version 1.0
 *  @date 2021/10/5 15:18
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    private User user;

    /**
     *
     * 查询所有用户信息返回一个用户列表
     * @param user
     * @author 孙少聪
     * @date  2021.10.05 15:25
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="/userManager/selectUsers")
    public AppResponse selectUsers(User user) {

        return selectAllCustomers(user);

    }
    
    /**
     *
     * 根据userAccount查询用户信息
     * @param userUuid
     * @author 孙少聪
     * @date  2021.10.05 18:07
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="/userManager/selectUserByUserUuid")
    public AppResponse selectOneCustomerByUserUuid(String userUuid) {

        User user = userServiceImp.selectByPrimaryKey(userUuid);
        if(user!=null){
            return AppResponse.success("user", user);
        }else{
            return AppResponse.notFound();
        }
    }

    /**
     *
     * 根据user对象更新用户信息
     * @param user
     * @author 孙少聪
     * @date  2021.10.05 18:12
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="/userManager/updateUser")
    public AppResponse updateOneUser(@RequestBody User user) throws UnsupportedEncodingException {
        if(user!=null){
            System.out.println(user.getUserAccount());
            System.out.println(CreateMD5.getMd5(user.getUserPwd()));
            user.setUserPwd(CreateMD5.getMd5(user.getUserPwd()));
            userServiceImp.updateByPrimaryKeySelective(user);
            User userByUserAccount = userServiceImp.selectByPrimaryKey(user.getUserUuid());
            return AppResponse.success("userByUserAccount", userByUserAccount);
        }else{
            return AppResponse.notFound();
        }
    }

    /**
     *
     * 根据userUuid删除某条用户信息
     * @param userUuid
     * @author 孙少聪
     * @date  2021.10.05 19:23
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="/userManager/deleteUserByUserUuid")
    public AppResponse delectOneUserByUserUuid(String userUuid) {
        userServiceImp.deleteByPrimaryKey(userUuid);
        return selectAllCustomers(user);
    }

    // 用户角色和权限的管理
    @RequestMapping(value="/userManager/UserPowerManager")
    public AppResponse CustomerPowerManager(String userUuid) {
        // Todo
        return selectAllCustomers(user);
    }

    /**
     *
     * 根据user来插入一条用户信息
     * @param user
     * @author 孙少聪
     * @date  2021.10.05 19:24
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="/userManager/insertUser")
    public AppResponse InsertCustomer(@RequestBody User user) throws UnsupportedEncodingException {

        user.setUserUuid(UUIDUtil.uuidStr());
        user.setUserPwd(CreateMD5.getMd5(user.getUserPwd()));
        userServiceImp.insertSelective(user);
        return selectAllCustomers(user);
    }

    /**
     *
     * 查看所有用户信息
     * @param user
     * @author 孙少聪
     * @date  2021.10.5 10:10
     * @return com.example.scrm.util.response.AppResponse
     */
    private AppResponse selectAllCustomers(User user){
        List<User> userList = userServiceImp.selectByUser(user);
        if(userList!=null){
            return AppResponse.success("userList", userList);
        }else{
            return AppResponse.notFound();
        }
    }
}
