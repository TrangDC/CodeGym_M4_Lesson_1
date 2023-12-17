package com.example.customer_list.controller;

import com.example.customer_list.model.Customer;
import com.example.customer_list.service.CustomerService;
import com.example.customer_list.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public String showList(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customer/list.jsp";
    }
//    @GetMapping("/customers/{id}")
//    public String viewCustomer( int id, Model model) {
//
//    }
}
