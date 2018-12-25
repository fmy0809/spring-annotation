package com.fmy.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ws47033
 * @date 2018/12/25 11:30
 */


public class YellowBeanPostProcessor implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("yellow")){
            System.out.println("Yellow......postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("yellow")){
            System.out.println("Yellow......postProcessAfterInitialization");
        }
        return bean;
    }
}
