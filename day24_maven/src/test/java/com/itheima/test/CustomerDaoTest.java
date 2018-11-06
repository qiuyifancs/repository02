package com.itheima.test;

import com.itheima.dao.CustomerDao;
import com.itheima.dao.impl.CustomerDaoImpl;
import com.itheima.domain.Customer;
import org.junit.Test;

import java.util.List;

public class CustomerDaoTest {
    private CustomerDao dao=new CustomerDaoImpl();

    @Test
    public void testFindAllCustomers(){
        List<Customer> customers = dao.findAllCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
