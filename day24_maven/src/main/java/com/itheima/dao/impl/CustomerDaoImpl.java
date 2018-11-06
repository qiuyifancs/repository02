package com.itheima.dao.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;
import com.itheima.utils.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    @Override
    public List<Customer> findAllCustomers() {
        return template.query("select * from customer",new BeanPropertyRowMapper<Customer>(Customer.class));
    }
}
