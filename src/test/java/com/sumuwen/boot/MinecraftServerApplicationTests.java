package com.sumuwen.boot;

import com.sumuwen.boot.pojo.User;
import com.sumuwen.boot.service.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class MinecraftServerApplicationTests {
    @Autowired
    UserService userService;

    // 一切的开始
    @Test
    void contextLoads() {
    }
}
