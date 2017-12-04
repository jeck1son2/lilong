package com.lilong.spring4.learn.config;

import com.lilong.spring4.learn.domain.Pig;

/**
 * Created by Administrator on 2017/11/16.
 */
public class PigFactory {
    public Pig createPig(){
        return new Pig();
    }
}
