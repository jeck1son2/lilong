package com.spring.study.spring3;

import com.spring.study.spring3.domain.ApplePen;
import com.spring.study.spring3.domain.Pen;
import com.spring.study.spring3.domain.Pencil;
import com.spring.study.spring3.domain.PencilFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/12/5.
 */
public class Spring3App {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.study.spring3");
        ApplePen applePen = context.getBean(ApplePen.class);
        System.out.println("------------"+context.getBean(Pen.class));
        System.out.println("------------"+context.getBean("&pencilFactoryBean"));
        applePen.show();
        context.close();
    }
}
