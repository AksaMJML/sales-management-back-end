package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    public void addcustomer(@RequestBody CustomerDTO customerDTO){
        service.addCustomer(customerDTO);
    }

    @PutMapping("/update")
    public void updateCustomer(CustomerDTO customerDTO){
        service.updateCustomer(customerDTO);
    }
}
