package com.fmy.config;


import com.fmy.bean.Linux;
import com.fmy.bean.Person;
import com.fmy.bean.Windows;
import com.fmy.ext.LinuxConditional;
import com.fmy.ext.WindowsConditional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


/**
 * @author ws47033
 * @date 2018/12/24 16:15
 */
@Configuration
public class MyConfig5 {

    @Bean
    @Conditional({WindowsConditional.class})
    public Windows windows(){
        return new Windows();
    }

    @Bean
    @Conditional({LinuxConditional.class})
    public Linux linux(){
        return new Linux();
    }

    @Bean
    public Person person(){
        return new Person();
    }

}
