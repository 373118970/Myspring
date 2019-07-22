package com.wangshu.service.Impl;


import com.wangshu.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import com.wangshu.model.User;

@Service("userService")
public class UserServiceImpl {

    @Resource
    private UserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
