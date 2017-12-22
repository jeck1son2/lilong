package com.study.muti.sources.serializabletest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/21.
 */
public class Person implements Serializable{

    private static final long serialVersionUID = 12L;

    private String name;

    private String sex;

    public Person(String name,String sex){
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", sex='" + sex + '\'' +
            '}';
    }
}
