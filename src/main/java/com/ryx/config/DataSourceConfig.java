package com.ryx.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name = "qds")
    @ConfigurationProperties("spring.datasource.druid.qds")
    public DataSource dataSourceOne() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "ryx")
    @ConfigurationProperties("spring.datasource.druid.ryx")
    public DataSource dataSourceTwo() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "qdsJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(
            @Qualifier("qds") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "ryxJdbcTemplate")
    public JdbcTemplate secondaryJdbcTemplate(
            @Qualifier("ryx") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
