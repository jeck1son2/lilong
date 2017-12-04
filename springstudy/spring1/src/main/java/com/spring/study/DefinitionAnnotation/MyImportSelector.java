package com.spring.study.DefinitionAnnotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/28.
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String, Object> ann = annotationMetadata.getAnnotationAttributes(EnableReigstryBean.class.getName());
        Class[] beans = (Class[]) ann.get("beans");
        StringBuffer beanstr = new StringBuffer();
        for(Class a : beans){
            if(beanstr.length() == 0){
                beanstr.append(a.getName());
            }else{
                beanstr.append(";").append(a.getName());
            }
        }
        return beanstr.toString().split(";");
    }
}
