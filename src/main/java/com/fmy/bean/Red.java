package com.fmy.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author ws47033
 * @date 2018/12/25 11:25
 */


public class Red implements InitializingBean,DisposableBean{

    public Red(){
        System.out.println("Red....构造方法");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Red....afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Red....destroy");
    }
}
