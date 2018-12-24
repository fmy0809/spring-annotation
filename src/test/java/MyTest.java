import com.fmy.config.*;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ws47033
 * @date 2018/12/24 11:57
 */


public class MyTest {


    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(applicationContext.getBean("person"));
    }

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig1.class);
        System.out.println(applicationContext.getBean("person"));
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println("beanName:"+name);
        }
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig2.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println("beanName:"+name);
        }
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig3.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println("beanName:"+name);
        }
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig4.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println("beanName:"+name);
        }

        System.out.println(applicationContext.getBean("personFactoryBean"));
        System.out.println(applicationContext.getBean("&personFactoryBean"));
    }

    @Test
    public void test5(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig5.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println("beanName:"+name);
        }
    }
}
