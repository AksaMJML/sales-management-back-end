package edu.icet.service.impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {


    @Override
    public void addCustomer(CustomerDTO customerDTO) {

    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(Integer id) {

    }

    @Override
    public void searchById(Integer id) {

    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return List.of();
    }
}
