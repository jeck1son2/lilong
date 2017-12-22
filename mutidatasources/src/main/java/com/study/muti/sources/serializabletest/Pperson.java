package com.study.muti.sources.serializabletest;

/**
 * Created by Administrator on 2017/12/21.
 */
public class Pperson {
    private String name;

    private String sex;

    public Pperson(String name,String sex){
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
        return "Pperson{" +
            "name='" + name + '\'' +
            ", sex='" + sex + '\'' +
            '}';
    }
}
