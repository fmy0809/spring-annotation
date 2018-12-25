package com.fmy.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ws47033
 * @date 2018/12/25 11:26
 */


public class Black {


    public Black(){
        System.out.println("Black....构造方法");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Black....postConstruct()");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Black....preDestroy()");

    }
}
