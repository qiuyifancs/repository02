package com.itheima.servlet;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import com.itheima.service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerService service=new CustomerServiceImpl();
        List<Customer> customers = service.findAllCustomers();
        request.getSession().setAttribute("customers",customers);
        response.sendRedirect(request.getContextPath()+"/listCustomer.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
