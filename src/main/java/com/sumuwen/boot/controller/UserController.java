package com.sumuwen.boot.controller;

import com.sumuwen.boot.pojo.RegisterUser;
import com.sumuwen.boot.pojo.User;
import com.sumuwen.boot.service.user.UserService;
import com.sumuwen.boot.utils.PackageRegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    /* 注册用户（未完成） */
    @PostMapping("/registerUser")
    public String registerUser(RegisterUser registerUser, Model model) throws InterruptedException {
        PackageRegisterUser packageRegisterUser = new PackageRegisterUser();
        /* flag代表为1代表registerUser()方法已执行 */
        model.addAttribute("flag",1);
        /* 检测注册数据是否合法 */
        boolean checkUuidAndUsername =
                packageRegisterUser.checkUsername(registerUser.getUsername());
        boolean checkTwicePassword = packageRegisterUser.checkTwicePassword(registerUser);
        if(checkTwicePassword && !checkUuidAndUsername){
            /* 注册成功 */
            User user = packageRegisterUser.packageToUser(registerUser);
            userService.registerUser(user);
            model.addAttribute("registerResult","注册成功!");
            return "site/register";
        }
        /* 注册失败 */
        model.addAttribute("registerResult","注册失败！");
        return "site/register";
    }
}
