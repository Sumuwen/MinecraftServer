package com.sumuwen.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j
public class RegisterUser {
    private String username;
    private String password;
    private String rwpassword;
    private String email;
    private String phoneNumber;
}
