package com.study.muti.sources.aop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/19.
 */
@Aspect
@Order(-10) //保证该AOP在@Transactional之前执行
@Component
public class DatasourceAspect {

    @Before("@annotation(targetDataSource)")
    public void changeDataSource(JoinPoint point, TargetDataSource targetDataSource){
        String dsId = targetDataSource.name();
        if(DynamicDataSourceContextHolder.getDataSourceType() != null){
            System.out.println("==================非法使用================应该抛出异常");
        }
        if(!DynamicDataSourceContextHolder.containsDataSource(dsId)){
            System.err.println("========================数据源[{}]不存在，使用默认数据源 > {}"+targetDataSource.name()+point.getSignature());
        }else{
            System.out.println("========================Use DataSource : {} > {}"+targetDataSource.name()+point.getSignature());
            //找到的话，那么设置到动态数据源上下文中。
            DynamicDataSourceContextHolder.setDataSourceType(targetDataSource.name());
        }
    }

    @After("@annotation(targetDataSource)")
    public void restoreDataSource(JoinPoint point, TargetDataSource targetDataSource) {
        System.out.println("Revert DataSource : {} > {}"+targetDataSource.name()+point.getSignature());

        if(DynamicDataSourceContextHolder.getDataSourceType() == null){
            System.out.println("==================非法使用结束================应该抛出异常");
        }
        //方法执行完毕之后，销毁当前数据源信息，进行垃圾回收。
        DynamicDataSourceContextHolder.clearDataSourceType();
    }
}
