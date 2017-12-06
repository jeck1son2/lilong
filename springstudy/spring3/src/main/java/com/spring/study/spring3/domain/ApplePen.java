package com.spring.study.spring3.domain;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/5.
 */
@Component
public class ApplePen {
    private Pen pen;
    public ApplePen(Pen pen){
        this.pen = pen;
    }
    public void show(){
        System.out.println("---------applePen------------"+this.pen);
    }
}
