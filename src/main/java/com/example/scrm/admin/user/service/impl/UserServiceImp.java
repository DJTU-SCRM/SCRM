package com.example.scrm.admin.user.service.impl;

import com.example.scrm.admin.user.dao.UserDao;
import com.example.scrm.admin.user.dao.UserDao;
import com.example.scrm.admin.user.entity.User;
import com.example.scrm.admin.user.service.UserService;
import com.example.scrm.util.StringLengthEmptyUndefind;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author Steven
 * @version 1.0
 * @date 2021/10/3 16:21
 *
 * @author 孙少聪
 * @version 1.0
 * @date 2021.10.03 19:29
 */
@Service
public class UserServiceImp implements UserService {
    @Resource
    UserDao userDao;
    @Resource
    StringLengthEmptyUndefind stringLengthEmptyUndefind;
    @Override

    //-3:服务器被攻击，-2:用户名或密码不符合要求,0:登录失败，1:登录成功,ther：未知
    public int userLogin(String userAccount, String userPwd) throws UnsupportedEncodingException {
        System.out.print("\nservice:" + userAccount + " pwd:" + userPwd + " ");
        if (!stringLengthEmptyUndefind.pd(new String[]{userAccount, userPwd}, 1, true)) {
            return -2;
        }
        System.out.println("service00:" + userAccount + " pwd:" + userPwd + " ");
        userAccount = userAccount.trim();//去除字符串的头尾空格
//        userPwd = CreateMD5.getMd5(CreateMD5.getMd5(userPwd.trim()));
        System.out.println("userAccount:" + userAccount + " userPwd:" + userPwd);
        int res = userDao.userLogin(userAccount, userPwd);
        System.out.println("res:" + res);
        if (res == 1) {
            if (userPwd.equals(userDao.finduserPwd(userAccount))) {
                return 1;
            }
            return -3;
        }
        return res;
    }

    @Override
    public int deleteByPrimaryKey(String userAccount) {
        return userDao.deleteByPrimaryKey(userAccount);
    }

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    @Override
    public List<User> selectByUser(User user) {
        return userDao.selectByUser(user);
    }

    @Override
    public User selectByPrimaryKey(String userAccount) {
        return userDao.selectByPrimaryKey(userAccount);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userDao.updateByPrimaryKey(record);
    }
}
