package com.lilong.spring4.learn;

import com.lilong.spring4.learn.config.BeanConfig;
import com.lilong.spring4.learn.config.CatFactory;
import com.lilong.spring4.learn.config.MyConfig;
import com.lilong.spring4.learn.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.Optional;

/**
 * Created by Administrator on 2017/11/16.
 */
@ComponentScan
@EnableAutoConfiguration
@SpringBootConfiguration
@EnableConfigurationProperties(MyConfig.class)
public class App {
    public static void main(String args[]){
        ConfigurableApplicationContext context = SpringApplication.run(App.class,args);
        MyConfig myConfig = context.getBean(MyConfig.class);
        System.out.println("PORT:"+myConfig.getMyConfig());

    }
}
