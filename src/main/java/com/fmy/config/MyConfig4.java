package com.fmy.config;

import com.fmy.bean.PersonFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author ws47033
 * @date 2018/12/24 16:15
 */
@Configuration
public class MyConfig4 {

    @Bean
    public PersonFactoryBean personFactoryBean(){
        return new PersonFactoryBean();
    }

}
