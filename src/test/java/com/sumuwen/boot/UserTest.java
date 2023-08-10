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

    /*
    1.@Test 注解的测试方法应该返回 void 类型,测试方法不应该返回数据，而是应该进行断言以验证代码行为是否
    符合预期
    */
    @Test
    @DisplayName("查询所有用户")
    public void findAllUser(){
        System.out.println(userService.findAllUser());
    }

    @Test
    @DisplayName("注册用户")
    public void registerUser(){
        Date date = new Date(System.currentTimeMillis());
        User user = new User(null,"sekiro","123456","苏沐问",
                "xxxx@qq.com","xxxx",date,1,1);
        Integer result = userService.registerUser(user);
        if(result == 1){
            System.out.println("注册成功！");
        }
    }
}
