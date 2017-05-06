package com.training.javaconfig.config;

import com.training.javaconfig.bean.EmployeeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = "com.training.javaconfig")
//@ImportResource(locations = "classpath:spring-config.xml")
public class AppConfig {

    @Bean
    public EmployeeBean getEmployeeBean() {
        return new EmployeeBean("Assanai", "Manurat");
    }

}
