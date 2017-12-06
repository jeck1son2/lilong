package com.spring.study.spring3.domain;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Administrator on 2017/12/5.
 */
public class PencilFactoryBean implements FactoryBean<Pencil>{
    @Override
    public Pencil getObject() throws Exception {
        return new Pencil();
    }

    @Override
    public Class<?> getObjectType() {
        return Pencil.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
