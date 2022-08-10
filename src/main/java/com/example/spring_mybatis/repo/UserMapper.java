package com.example.spring_mybatis.repo;

import com.example.spring_mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author TuanNA
 * @Date 10/08/2022 9:27 PM
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    List<User> getAllUser();

//    @Select("select * from user where id = #{id}")
    User getUserById(@Param(value = "id") Integer id);

    User getUserByColumn(@Param(value = "column") String column, @Param(value = "value") String value);
}
