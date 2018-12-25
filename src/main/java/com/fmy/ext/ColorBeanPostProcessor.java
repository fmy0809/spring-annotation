package com.fmy.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ws47033
 * @date 2018/12/25 9:39
 */

public class ColorBeanPostProcessor implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("color")){
            System.out.println("1.调用实现BeanPostProcessor接口的postProcessBeforeInitialization方法");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("color")){
            System.out.println("5.调用实现BeanPostProcessor接口的postProcessAfterInitialization");
        }
        return bean;
    }
}
