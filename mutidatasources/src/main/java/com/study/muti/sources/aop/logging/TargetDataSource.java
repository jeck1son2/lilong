package com.study.muti.sources.aop.logging;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/12/19.
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String name();
}
