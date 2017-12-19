package com.spring.study.spring6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * SpringBoot Web 实战
 * Created by Administrator on 2017/12/5.
 */
@SpringBootApplication
public class Spring6App {
    public static void main(String args[]){
        SpringApplication springApplication = new SpringApplication(Spring6App.class);
        ConfigurableApplicationContext context =springApplication.run(args);
    }
}
