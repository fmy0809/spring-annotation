package com.fmy.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ws47033
 * @date 2018/12/24 23:46
 */


public class Color implements InitializingBean,DisposableBean{

    public void init (){
        System.out.println("4.调用@Bean initMethod方法");
    }

    public void over (){
        System.out.println("3.调用@Bean destroyMethod方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("2.调用实现DisposableBean接口的destroy方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("3.调用实现InitializingBean接口的afterPropertiesSet方法");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("2.调用@PostConstruct注解标注的方法");
    }


    @PreDestroy
    public void preDestroy(){
        System.out.println("1.调用@PreDestroy注解标注的方法");
    }
}
