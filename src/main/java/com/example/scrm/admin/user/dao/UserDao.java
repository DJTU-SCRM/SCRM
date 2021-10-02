package com.example.scrm.admin.user.dao;

import com.example.scrm.admin.user.entity.User;
import com.example.scrm.admin.user.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userAccount);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userAccount);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}