package com.sumuwen.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j
public class User {
    /* 用户id */
    private Integer uid;
    /* 用户名（用于登录账号） */
    private String username;
    /* 密码 */
    private String password;
    /* 昵称（站内名称） */
    private String nickname;
    /* 电子邮箱 */
    private String email;
    /* 电话号码 */
    private String phoneNumber;
    /* 账号创建日期 */
    private Date createDate;
    /* 账号是否激活 */
    private Boolean activated;
    /* 属于管理员组还是普通用户组，1为管理员组，0为普通用户组 */
    private Boolean group;
}
