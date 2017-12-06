package com.spring.study.spring3.config;

import com.spring.study.spring3.domain.ApplePen;
import com.spring.study.spring3.domain.Pen;
import com.spring.study.spring3.domain.Pencil;
import com.spring.study.spring3.domain.PencilFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/12/5.
 */
@Configuration
public class ConfigrationDetificate {
    @Bean
    public Pen pen(){
        return new Pen();
    }

    @Bean
    public PencilFactoryBean pencilFactoryBean(){
        return new PencilFactoryBean();
    }
}
