package com.spring.study.spring4.config;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/12/8.
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(MyCondition.class)
public @interface ConditonOnClass1 {
    String[] name() default {};
}
