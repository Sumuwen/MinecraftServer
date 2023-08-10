package com.sumuwen.boot.service.user;

import com.sumuwen.boot.pojo.User;

import java.util.List;

public interface UserService {
    /*查询所有用户*/
    public List<User> findAllUser();
    /* 注册用户 */
    public Integer registerUser(User user);
}
