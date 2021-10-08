package com.example.scrm.admin.user.service.impl;

import com.example.scrm.admin.user.dao.UserDao;
import com.example.scrm.admin.user.dao.UserDao;
import com.example.scrm.admin.user.entity.User;
import com.example.scrm.admin.user.service.UserService;
import com.example.scrm.util.CreateMD5;
import com.example.scrm.util.StringLengthEmptyUndefind;
import com.example.scrm.util.UUIDUtil;
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

    int version = 0;

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
    //1正常删除  2 userUuid为空
    public int deleteByPrimaryKey(String userUuid) {
        if (userUuid!=null) {
            userDao.deleteByPrimaryKey(userUuid);
            return 1;
        }else {
            return 2;
        }
    }

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    // 1 成功  2 账户密码未获取到 3.用户Uuid为空
    public int insertSelective(User record) {

        // Todo
        record.setUserUuid(UUIDUtil.uuidStr());

        record.setCreatedBy("System");
        record.setIsDeleted(0);
        record.setSortNo(0);
        record.setLastModifiedBy("System");
        record.setVersion(1);

        if(record!=null){
            if(record.getUserAccount()!=null && record.getUserPwd()!=null) {

                try {
                    record.setUserPwd(CreateMD5.getMd5(record.getUserPwd()));
                }catch (Exception e){
                    e.printStackTrace();
                }
                userDao.insertSelective(record);
                return 1;
            }else {
                return 3;
            }
        }else{
            return 2;
        }

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
    // 1 成功  2 用户未获取到 3.用户Uuid为空
    public int updateByPrimaryKeySelective(User record) {
        if(record!=null){
            if(record.getUserUuid()!=null) {
                userDao.updateByPrimaryKeySelective(record);
                return 1;
            }else {
                return 3;
            }
        }else{
            return 2;
        }

    }

    @Override
    // 1 成功  2 用户未获取到 3.用户账号为空
    public int updateByUserAccount(User record) {
        if(record!=null){

            if(record.getUserAccount()!=null) {
//                record.setVersion(record.getVersion() + 1);
                userDao.updateByUserAccount(record);
                return 1;
            }else {
                return 3;
            }
        }else{
            return 2;
        }
    }

    @Override
    // 1 成功  2 用户未获取到 3.用户Uuid为空
    // 注意他会将用户信息全部修改，慎用
    public int updateByPrimaryKey(User record) {
        if(record!=null){
            if(record.getUserUuid()!=null) {
//                record.setVersion(record.getVersion() + 1);
                userDao.updateByPrimaryKey(record);
                return 1;
            }else {
                return 3;
            }
        }else{
            return 2;
        }
    }
}
