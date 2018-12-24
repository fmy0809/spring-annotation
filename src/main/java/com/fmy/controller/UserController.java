package com.fmy.controller;

import com.fmy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2018/12/24 0024.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @Override
    public String toString() {
        return "UserController{" +
                "userService=" + userService +
                '}';
    }
}
