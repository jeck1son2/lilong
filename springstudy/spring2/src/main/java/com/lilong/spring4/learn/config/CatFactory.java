package com.lilong.spring4.learn.config;

import com.lilong.spring4.learn.domain.Cat;
import com.lilong.spring4.learn.domain.Dog;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.core.ResolvableType;

/**
 * Created by Administrator on 2017/11/16.
 */
public class CatFactory implements FactoryBean<Dog>{

    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
