package com.sumuwen.boot.service.user;

import com.sumuwen.boot.pojo.User;

import java.util.List;

public interface UserService {
    /*查询所有用户*/
    public List<User> findAllUser();
    /* 注册用户 */
    public Integer registerUser(User user);
    /* 检测UUID或用户名是否与数据库中的信息重复,返回true为重复 */
    public boolean checkUuid(String uuid);
    public boolean checkUsername(String username);
}
