package edu.icet.service.impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repositery.Customerrepositery;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    final Customerrepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        repositery.save(mapper.map(customerDTO , CustomerEntity.class));
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
