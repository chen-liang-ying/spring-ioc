package com.mobile263.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mobile263"})
@PropertySource(value = "classpath:jdbc.properties")
public class SpringConfig {
}
