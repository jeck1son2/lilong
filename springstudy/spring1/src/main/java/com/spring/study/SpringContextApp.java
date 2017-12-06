package com.spring.study;

import com.spring.study.domain.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/12/5.
 */
public class SpringContextApp {
    public static void main (String args[]){
        //获取springcontext容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.study");
        System.out.println("------------"+context.getBean(Book.class));
    }
}
