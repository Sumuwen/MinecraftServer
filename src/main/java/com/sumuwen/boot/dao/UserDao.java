package com.sumuwen.boot.dao;

import com.sumuwen.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    /*查询所有用户*/
    public List<User> findAllUser();
    /*注册用户*/
    public Integer registerUser(User user);
}
