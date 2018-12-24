package com.fmy.service;

import com.fmy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * Created by Administrator on 2018/12/24 0024.
 */
@Service
public class UserService {

//    @Qualifier("userDao")
    @Autowired
//    @Resource
//    @Inject
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
