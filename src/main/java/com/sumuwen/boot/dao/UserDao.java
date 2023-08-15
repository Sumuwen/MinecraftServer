package com.sumuwen.boot.dao;

import com.sumuwen.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    /*查询所有用户*/
    public List<User> findAllUser();
    /*注册用户*/
    public Integer registerUser(@Param("User") User user);
    /* 检测UUID是否与数据库中的信息重复,返回true为重复 */
    public User checkUuid(@Param("uuid") String uuid);
    /* 检测用户名是否与数据库中的信息重复,返回true为重复 */
    public User checkUsername(@Param("username") String username);
}
