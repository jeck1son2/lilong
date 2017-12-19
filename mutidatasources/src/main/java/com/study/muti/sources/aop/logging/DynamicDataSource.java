package com.study.muti.sources.aop.logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/19.
 */

/**
 *  * 动态数据源.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    protected Object determineCurrentLookupKey() {
        if(DynamicDataSourceContextHolder.getDataSourceType() == null){
            return "dataSource";
        }
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
