package com.fmy.config;


import com.fmy.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * @author ws47033
 * @date 2018/12/24 16:15
 */
@Configuration
@PropertySource(value = {"classpath:config.properties"},encoding="utf-8")
public class MyConfig6 {

    @Bean
    public Car car(){
        return new Car();
    }


}
