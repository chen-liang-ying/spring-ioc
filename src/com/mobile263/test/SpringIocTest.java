package com.mobile263.test;

import com.mobile263.config.SpringConfig;
import com.mobile263.dao.CustomerDao;
import com.mobile263.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class SpringIocTest {

    @Resource(name="customerDao")
    private CustomerDao customerDao;

    @Resource(name="customerService")
    private CustomerService customerService;

    @Value("${jdbcUrl}")
    private String url;

    @Test
    public void test1(){
        System.out.println(customerDao);
    }

    @Test
    public void test2(){
        customerService.save();
    }

    @Test
    public void test3(){
        System.out.println(url);
    }
}
