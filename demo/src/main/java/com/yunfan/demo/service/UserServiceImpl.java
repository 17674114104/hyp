package com.yunfan.demo.service;

import com.yunfan.demo.dao.UserMapper;
import com.yunfan.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务实现类
 */
@Service("userService")
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserMapper userMapper;


    public User login(String uName, String uPwd){
        return  userMapper.login(uName,uPwd);
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }
}
