package com.lilong.spring4.learn.config;

import com.lilong.spring4.learn.domain.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Administrator on 2017/11/16.
 */
@Configuration
public class BeanConfig {

    @Bean     //声明配置一个bean   自定义bean的name是cat
    //@Scope("prototype") //bean默认是单例的  如果不想容器中的bean是单子   添加这个注解
    public Cat cat(){
        return new Cat();
    }

    @Bean(name = "dog")
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public CatFactory createCat(){
        return new CatFactory();
    }

    @Bean
    public PigFactory createPigFactory(){
        return new PigFactory();
    }

    @Bean
    public Pig createPig(PigFactory pigFactory){
        return pigFactory.createPig();
    }

    @Bean
    public Book createBook(){
        return new Book();
    }

    @Bean
    public process createprocess(){
        return new process();
    }
}
