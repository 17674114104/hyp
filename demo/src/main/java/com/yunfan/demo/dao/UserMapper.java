package com.yunfan.demo.dao;

import com.yunfan.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

public User login(@Param("name") String name, @Param("password") String password);

}
