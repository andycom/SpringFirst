package com.fancv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * 生产环境应该使用mysql 配置
 *
 * @author hamish-wu
 */
@Configuration
@Profile("prd")
public class PrdProfileConfig {

    /**
     * TODO 改写成mysql  配置
     **/
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setName("devTest").setType(EmbeddedDatabaseType.DERBY).build();

    }
}
