package com.itheima.dao;

import com.itheima.domain.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> findAllCustomers();

}
