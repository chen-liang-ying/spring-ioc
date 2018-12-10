package com.mobile263.dao.impl;

import com.mobile263.dao.CustomerDao;
import org.springframework.stereotype.Repository;

@Repository(value = "customerDao")
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void save() {
        System.out.println("把客户数据保存到mysql数据1111");
    }
}
