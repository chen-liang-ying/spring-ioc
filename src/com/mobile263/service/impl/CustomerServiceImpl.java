package com.mobile263.service.impl;

import com.mobile263.dao.CustomerDao;
import com.mobile263.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    @Override
    public void save() {
        customerDao.save();
    }
}
