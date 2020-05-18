package com.greedystar.nacosconfig.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Author GreedyStar
 * Date   2020-5-18
 */
@Configuration
public class DruidConfig {
    @Autowired
    private DruidProperty druidProperty;

    @RefreshScope
    @Bean
    @Primary
    public DataSource druidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(druidProperty.getDriverClassName());
        dataSource.setUrl(druidProperty.getUrl());
        dataSource.setUsername(druidProperty.getUsername());
        dataSource.setPassword(druidProperty.getPassword());
        return dataSource;
    }
}
