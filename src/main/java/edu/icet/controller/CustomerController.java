package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
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
    public void updateCustomer(@RequestBody CustomerDTO customerDTO){
        service.updateCustomer(customerDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteCustomer(Integer id){
        service.deleteCustomer(id);
    }

    @GetMapping("/search-by-id/{id}")
    public CustomerDTO searchById(Integer id){
       return service.searchById(id);
    }
}
