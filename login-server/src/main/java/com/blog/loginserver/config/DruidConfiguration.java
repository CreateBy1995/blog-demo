package com.blog.loginserver.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.xa.DruidXADataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DruidConfiguration {
    /**
     * 获取application配置文件参数
     */
    @Autowired
    private Environment environment ;

    /**
     * 配置Druid数据源
     * @return
     */
    @Bean
    @Primary
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource() ;
        druidDataSource.setUrl(environment.getProperty("spring.datasource.url"));
        druidDataSource.setUsername(environment.getProperty("spring.datasource.username"));
        druidDataSource.setPassword(environment.getProperty("spring.datasource.password"));
        druidDataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
        try {
            druidDataSource.setFilters(environment.getProperty("spring.datasource.filters"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return druidDataSource;
    }

}
