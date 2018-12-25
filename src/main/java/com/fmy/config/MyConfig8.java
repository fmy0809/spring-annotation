package com.fmy.config;

import com.fmy.bean.*;
import com.fmy.ext.ColorBeanPostProcessor;
import com.fmy.ext.YellowBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ws47033
 * @date 2018/12/25 9:40
 */

@Configuration
@Import({ColorBeanPostProcessor.class})

//@Import({YellowBeanPostProcessor.class})
public class MyConfig8 {

    @Bean(initMethod = "init",destroyMethod = "over")
    public Color color(){
        return new Color();
    }


//        @Bean(initMethod = "init",destroyMethod = "destroy")
//        public Blue blue() {
//            return new Blue();
//        }
//
//        @Bean
//        public Red red(){
//            return new Red();
//        }
//
//        @Bean
//        public Black black(){
//            return new Black();
//        }
//
//
//        @Bean
//        public Yellow yellow(){
//            return new Yellow();
//        }

}
