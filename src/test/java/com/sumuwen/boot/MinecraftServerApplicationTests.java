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
        Date date = new Date(System.currentTimeMillis());
        User user = new User(1,"lpnzs123","123456","苏沐问",
                "xxxx@qq.com","xxxx",date,1,1);
        Integer integer = userService.registerUser(user);
        List<User> allUser = userService.findAllUser();
        System.out.println(allUser);
        if(integer == 1){
            System.out.println("插入成功！");
        }
    }
}
