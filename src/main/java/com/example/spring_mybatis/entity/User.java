package com.example.spring_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author TuanNA
 * @Date 10/08/2022 9:23 PM
 * @Version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String fullName;
    private String userName;
    private String password;
    private String phone;
}
