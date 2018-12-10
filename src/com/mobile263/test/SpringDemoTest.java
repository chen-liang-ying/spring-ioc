package com.mobile263.test;

import com.mobile263.config.SpringConfig;
import com.mobile263.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoTest {

    @Test
    public void test1(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        CustomerService customerService = (CustomerService)ac.getBean("customerService");
        customerService.save();
    }
}
