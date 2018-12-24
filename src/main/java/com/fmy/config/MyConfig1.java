package com.fmy.config;

import com.fmy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ws47033
 * @date 2018/12/24 16:15
 */

@Configuration
public class MyConfig1 {

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("小刘");
        person.setAge(30);
        return person;
    }


}
