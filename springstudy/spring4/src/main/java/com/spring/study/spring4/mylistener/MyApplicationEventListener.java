package com.spring.study.spring4.mylistener;

import com.spring.study.spring4.domain.Tree;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/7.
 */
public class MyApplicationEventListener implements ApplicationListener{

    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        Object o = applicationEvent.getSource();
        if(o instanceof Tree){
            Tree tree = (Tree) o;
            tree.setPlateTreeNo(tree.getPlateTreeNo()+1);
            System.out.println("---------platTreeCount-----------"+tree.getPlateTreeNo());
        }
    }
}
