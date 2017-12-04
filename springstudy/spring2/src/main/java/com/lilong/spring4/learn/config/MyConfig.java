package com.lilong.spring4.learn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2017/11/23.
 */
@ConfigurationProperties(prefix = "my",ignoreUnknownFields = false)
public class MyConfig {
    private String myConfig;

    public String getMyConfig() {
        return myConfig;
    }

    public void setMyConfig(String myConfig) {
        this.myConfig = myConfig;
    }
}
