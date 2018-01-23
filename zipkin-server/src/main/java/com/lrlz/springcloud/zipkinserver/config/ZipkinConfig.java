package com.lrlz.springcloud.zipkinserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipkin.storage.mysql.MySQLStorage;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * ZipkinConfig
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/13
 */
@Configuration
public class ZipkinConfig {
    @Resource
    DataSource dataSource;

    @Bean
    public MySQLStorage mySQLStorage() {
        return MySQLStorage.builder().datasource(dataSource).executor(Runnable::run).build();
    }

}
