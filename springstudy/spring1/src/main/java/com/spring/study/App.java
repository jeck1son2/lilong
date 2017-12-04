package com.spring.study;

import com.spring.study.DefinitionAnnotation.EnableReigstryBean;
import com.spring.study.domain.Book;
import com.spring.study.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

/**
 * Created by Administrator on 2017/11/27.
 */
@SpringBootApplication
@EnableReigstryBean(beans = {People.class})
public class App {
    public static void main(String args[]){
        SpringApplication app = new SpringApplication(App.class);
        ConfigurableApplicationContext context = app.run(args);
        ConfigurableEnvironment env = context.getEnvironment();
        System.out.println("------------"+context.getBean(People.class));
        context.close();
    }
}
