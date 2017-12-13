package com.spring.study.spring4.mylistener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2017/12/7.
 */
public class MyApplicationEvent extends ApplicationEvent{

    public MyApplicationEvent(Object source) {
        super(source);
    }

}
