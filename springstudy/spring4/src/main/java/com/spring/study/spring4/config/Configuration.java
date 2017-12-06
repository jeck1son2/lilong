package com.spring.study.spring4.config;

import com.spring.study.spring4.domain.Tree;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2017/12/6.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Tree tree(){
        return new Tree();
    }
}
