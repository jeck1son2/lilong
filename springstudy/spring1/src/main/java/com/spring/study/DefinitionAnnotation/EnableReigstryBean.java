package com.spring.study.DefinitionAnnotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/11/28.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportSelector.class)
public @interface EnableReigstryBean {
    Class[] beans();
}
