package edu.icet.service;

import edu.icet.model.dto.CustomerDTO;

import java.net.Inet4Address;
import java.util.List;

public interface CustomerService {
    void addCustomer(CustomerDTO customerDTO);
    void updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(Integer id);
    CustomerDTO searchById(Integer id);
    List<CustomerDTO> getAllCustomers();
}
