package com.example.scrm.admin.user.controller;

import com.example.scrm.admin.user.entity.User;
import com.example.scrm.admin.user.service.UserService;
import com.example.scrm.admin.user.service.impl.UserServiceImp;
import com.example.scrm.util.CreateMD5;
import com.example.scrm.util.JwtUtils;
import com.example.scrm.util.response.AppResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author Steven
 * @version 1.0
 * @date 2021/10/3 16:20
 *
 *  @author 孙少聪
 *  @version 1.0
 *  @date 2021/10/5 15:18
 */
@RestController
@Slf4j
@RequestMapping("/backend/login")
@PreAuthorize("hasAuthority('admin')")
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
    @GetMapping(value="selectUsers")
    public AppResponse selectUsers(User user) {

        return selectAllCustomers(user);

    }

    /**
     *
     * 根据userAccount查询用户信息
     * @param userAccount
     * @author 孙少聪
     * @date  2021.10.05 18:07
     * @return com.example.scrm.util.response.AppResponse
     */
    @GetMapping(value="selectUserByUserAccount")
    public AppResponse selectOneCustomerByUserAccount(String userAccount) {

        User user = userServiceImp.selectByPrimaryKey(userAccount);
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
    @PostMapping(value="updateUser")
    public AppResponse updateOneUser(User user) throws UnsupportedEncodingException {
        if(user!=null){

            if(user.getUserPwd()!=null) {
                user.setUserPwd(CreateMD5.getMd5(user.getUserPwd()));
            }
            userServiceImp.updateByUserAccount(user);
            User userByUserAccount = userServiceImp.selectByPrimaryKey(user.getUserAccount());
            return AppResponse.success("userByUserAccount", userByUserAccount);
        }else{
            return AppResponse.notFound();
        }
    }

    /**
     *
     * 根据userUuid删除某条用户信息
     * @param userAccount
     * @author 孙少聪
     * @date  2021.10.05 19:23
     * @return com.example.scrm.util.response.AppResponse
     */
    @PostMapping(value="deleteUserByUserAccount")
    public AppResponse delectOneUserByUserUuid(String userAccount) {
        userServiceImp.deleteByPrimaryKey(userAccount);
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
    @PostMapping(value="insertUser")
    public AppResponse InsertUser(User user) throws UnsupportedEncodingException {

        if(userServiceImp.selectByPrimaryKey(user.getUserAccount()) == null) {
            userServiceImp.insertSelective(user);
            return selectAllCustomers(user);
        }else{
            return AppResponse.notFound("该用户已存在");
        }

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
    @Resource
    private UserService userService;
    /**
     * 测试SpringSecurity
     */
    @GetMapping("getData")
    public String getData() {
        return "date";
    }
    /**
     * 用户登录
     */
    @PostMapping("userLogin")
    public AppResponse userLogin(User user)throws UnsupportedEncodingException {
        String userAccount = user.getUserAccount();
        String userPwd = user.getUserPwd();
        //生成JWT令牌
        String jwt= JwtUtils.generateToken(user.getUserAccount(),user.getUserPwd());
        System.out.println("jwt-generateToken"+jwt);
        int resultInt = userService.userLogin(userAccount, userPwd);
        if (resultInt == 1) {
            PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
            String passwordAfterEncoder = passwordEncoder.encode(userPwd);
            log.info("passwordAfterEncoder",passwordAfterEncoder);
            System.out.println(userAccount + "---->>>" + passwordAfterEncoder);
            user.setTokenBackend(jwt);
//            redisTemplate.opsForValue().set(tokenBackend, sysUser1, 30, TimeUnit.MINUTES);
            if(user.getLoginIp()!=null || user.getLoginPlace()!=null || user.getLoginBrowser()!=null){
                userServiceImp.updateByUserAccount(user);
            }
            return AppResponse.success("登录成功", user);
        }
        return AppResponse.bizError("登录失败");
    }

}
