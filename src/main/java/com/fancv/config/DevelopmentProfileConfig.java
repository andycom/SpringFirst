package com.fancv.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author hamish-wu
 */
@Configuration
@Profile("dev")
@PropertySource("classpath:/application.properties")
public class DevelopmentProfileConfig {

    @Value("${db.driver}")
    private String user;
}
