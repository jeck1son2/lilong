package com.spring.study.spring4.treeservice;

import com.spring.study.spring4.domain.Tree;
import com.spring.study.spring4.mylistener.MyApplicationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/7.
 */
@Service
public class PlatTreeService {
    @Autowired
    private Tree tree;

    @Autowired
    private ApplicationContext context;

    public void platTree(){
        MyApplicationEvent event = new MyApplicationEvent(tree);
        context.publishEvent(event);
    }
}
