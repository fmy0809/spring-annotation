package com.fmy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


/**
 * @author ws47033
 * @date 2018/12/24 16:15
 */
@Configuration
@ComponentScan(value ={"com.fmy.*"},excludeFilters = {
        @Filter(type=FilterType.ANNOTATION,classes={Controller.class})})
//@ComponentScan(value ={"com.fmy.*"},includeFilters = {
//        @Filter(type = FilterType.ANNOTATION,classes = Controller.class),
////        @Filter(type = FilterType.ASSIGNABLE_TYPE,classes = BookDao.class),
//        @Filter(type = FilterType.CUSTOM,classes = MyComponentFilter.class)
//},useDefaultFilters = false)
public class MyConfig2 {



}
