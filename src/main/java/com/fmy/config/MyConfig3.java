package com.fmy.config;


import com.fmy.bean.MyImportBean;
import com.fmy.ext.MyImportBeanDefinitionRegistrar;
import com.fmy.ext.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;



/**
 * @author ws47033
 * @date 2018/12/24 16:15
 */
@Configuration
@Import({MyImportBean.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MyConfig3 {



}
