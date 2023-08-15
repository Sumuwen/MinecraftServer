package com.sumuwen.boot.utils;


import com.sumuwen.boot.pojo.RegisterUser;
import com.sumuwen.boot.pojo.User;

import java.util.Date;
import java.util.UUID;

/*
1.packageRegisterUser类用于将RegisterUser的pojo类包装成User类型的pojo类，其中包括了各种数据检测，验证包装的
数据是否合法。
*/
public class PackageRegisterUser {
    /* 检测UUID或用户名是否与数据库中的信息重复,返回true为重复（未完成） */
    public boolean checkUuid(String uuid){
        /* uuid即系统为新用户自动生成的昵称 */
        return false;
    }
    public boolean checkUsername(String username){
        return false;
    }

    /* 验证两次输入的密码是否一致，并且密码不为空 */
    public boolean checkTwicePassword(RegisterUser registerUser){
        if(registerUser.getPassword() != null && registerUser.getPassword() != "" &&
                registerUser.getPassword().equals(registerUser.getRwpassword())){
            return true;
        }
        return false;
    }

    /* 将RegisterUser的pojo类包装成User类型的pojo类 */
    public User packageToUser(RegisterUser registerUser){
        User user = new User();
        /* 获取当前注册账号的注册时间 */
        Date dateOfNow = new Date(System.currentTimeMillis());
        UUID randomUUID = UUID.randomUUID();

        user.setUsername(registerUser.getUsername());
        user.setPassword(registerUser.getPassword());
        user.setEmail(registerUser.getEmail());
        user.setPhoneNumber(registerUser.getPhoneNumber());
        /* 账号默认昵称为randomUUID */
        while (this.checkUuid(randomUUID.toString())){
            randomUUID = UUID.randomUUID();
        }
        user.setNickname(randomUUID.toString());
        /* 默认账号在注册时激活 */
        user.setActivated(1);
        /* 注册时间 */
        user.setCreateDate(dateOfNow);
        /* 默认注册的用户都是普通用户 */
        user.setGroup(0);
        return user;
    }

}
