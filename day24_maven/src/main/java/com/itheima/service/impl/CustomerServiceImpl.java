package com.itheima.service.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.dao.impl.CustomerDaoImpl;
import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao dao=new CustomerDaoImpl();

    @Override
    public List<Customer> findAllCustomers() {
        return dao.findAllCustomers();
    }
}
