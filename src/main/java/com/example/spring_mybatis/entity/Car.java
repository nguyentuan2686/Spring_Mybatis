package com.example.spring_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author TuanNA
 * @Date 10/08/2022 11:31 PM
 * @Version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Integer id;
    private String name;
    private String color;
}
