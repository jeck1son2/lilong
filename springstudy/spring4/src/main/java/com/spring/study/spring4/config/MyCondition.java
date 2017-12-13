package com.spring.study.spring4.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.security.Key;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/8.
 */
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> valumap =  metadata.getAnnotationAttributes(ConditonOnClass1.class.getName());
        String[] nameString = (String[]) valumap.get("name");
        if(context.getBeanFactory().getBean("tree") != null){
            return true;
        }
        return false;
    }
}
