package com.fmy.config;


import com.fmy.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * @author ws47033
 * @date 2018/12/24 16:15
 */
@Configuration
@ComponentScan({"com.fmy.controller","com.fmy.service","com.fmy.dao"})
public class MyConfig7 {

//    @Primary
//    @Bean("userDao2")
    public UserDao userDao(){
        UserDao userDao = new UserDao();
        userDao.setLabel("2");
        return userDao;
    }

}
