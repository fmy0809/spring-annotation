package com.fmy.ext;

import com.fmy.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by Administrator on 2018/12/24 0024.
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * AnnotationMetadata：当前类的注解信息
     * BeanDefinitionRegistry:BeanDefinition注册类；
     * 		把所有需要添加到容器中的bean；调用
     * 		BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //指定Bean定义信息；（Bean的类型，Bean。。。）
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Person.class);
        //注册一个Bean，指定bean名
        registry.registerBeanDefinition("person", beanDefinition);

    }
}
