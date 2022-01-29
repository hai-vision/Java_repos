package com.xxxx.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

/**
 * @author hai
 * @date 2022/1/29
 * version 1.0
 * 连接池的工厂
 */
@SuppressWarnings({"all"})
public class MyDruidDataSourceFactory extends PooledDataSourceFactory {

    public MyDruidDataSourceFactory () {
        this.dataSource = new DruidDataSource();    // 更换数据源
    }
}
