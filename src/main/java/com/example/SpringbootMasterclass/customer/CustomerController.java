package com.example.SpringbootMasterclass.customer;


import com.example.SpringbootMasterclass.SpringbootMasterclassApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Rest Layer
@RestController
public class CustomerController {


    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;

    }

    @GetMapping("api/v1/customers")
    List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

}
