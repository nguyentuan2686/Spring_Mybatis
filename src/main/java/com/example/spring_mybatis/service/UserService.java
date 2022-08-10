package com.example.spring_mybatis.service;

import com.example.spring_mybatis.entity.User;
import com.example.spring_mybatis.repo.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author TuanNA
 * @Date 10/08/2022 9:34 PM
 * @Version 1.0
 */
@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }
}
