package com.sumuwen.boot.service.user.impl;

import com.sumuwen.boot.dao.UserDao;
import com.sumuwen.boot.pojo.User;
import com.sumuwen.boot.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public Integer registerUser(User user) {
        return userDao.registerUser(user);
    }
}
