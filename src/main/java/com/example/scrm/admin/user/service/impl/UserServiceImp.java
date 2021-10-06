package com.example.scrm.admin.user.service.impl;

import com.example.scrm.admin.user.dao.UserDao;
import com.example.scrm.admin.user.entity.User;
import com.example.scrm.admin.user.service.UserService;
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

    @Autowired
    private UserDao userDao;

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
