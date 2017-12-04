package com.spring.study.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2017/11/28.
 */
public class Process implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(o instanceof Book){
            ((Book) o).setRemark("靠你大爷");
            System.out.println(o.toString());
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if(o instanceof Book){
            ((Book) o).setRemark("靠你大爷1");
            System.out.println(o.toString());
        }
        return o;
    }
}
