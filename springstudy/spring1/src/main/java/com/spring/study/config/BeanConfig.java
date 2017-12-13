package com.spring.study.config;

import com.spring.study.domain.Book;
import com.spring.study.domain.Process;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/11/27.
 */
@Configuration
public class BeanConfig {
    @Value("${localpath.path:默认值}")
    private String path;

    @Bean
    public Book book(){
        Book book = new Book();
        book.setRemark(path);
        return book;
    }
}
