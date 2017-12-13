package com.spring.study.spring4.domain;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/8.
 */
@Component
public class Book {

    public Book(Tree tree,Tree tree1){
        System.out.println("--------tree---------"+tree);
        System.out.println("--------tree1---------"+tree1);
    }
}
