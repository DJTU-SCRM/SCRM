package com.example.scrm.admin.user.dao;

import com.example.scrm.admin.user.entity.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /**
     * 用户登录
     * @param userAccount
     * @param userPwd
     * @return
     */
    int userLogin(@Param("userAccount") String userAccount, @Param("userPwd") String userPwd);

    /**
     * 查找密码
     * @param userAccount
     * @return
     */
    String finduserPwd(@Param("userAccount") String userAccount);

    int deleteByPrimaryKey(String userAccount);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByUser(User user);

    User selectByPrimaryKey(String userAccount);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}