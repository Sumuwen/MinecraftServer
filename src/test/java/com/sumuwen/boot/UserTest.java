package com.sumuwen.boot;

import com.sumuwen.boot.pojo.User;
import com.sumuwen.boot.service.user.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
@DisplayName("用户测试类")
public class UserTest {
    @Autowired
    UserService userService;

    @Test
    @DisplayName("查询所有用户")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @Test
    @DisplayName("注册用户")
    public Integer registerUser(){
        Date date = new Date(System.currentTimeMillis());
        User user = new User(1,"lpnzs123","123456","苏沐问",
                "xxxx@qq.com","xxxx",date,1,1);
        return userService.registerUser(user);
    }
}
