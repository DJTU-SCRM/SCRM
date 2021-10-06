package com.example.scrm.admin.user.controller;

import com.example.scrm.admin.user.entity.User;
import com.example.scrm.admin.user.service.UserService;
import com.example.scrm.util.JwtUtils;
import com.example.scrm.util.response.AppResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Steven
 * @version 1.0
 * @date 2021/10/3 16:20
 */
@RestController
@Slf4j
@RequestMapping("/backend/login")
@PreAuthorize("hasAuthority('admin')")
public class UserController {
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
            return AppResponse.success("登录成功", user);
        }
        return AppResponse.bizError("登录失败");
    }
}
