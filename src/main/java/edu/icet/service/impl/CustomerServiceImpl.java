package edu.icet.service.impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repositery.Customerrepositery;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        repositery.save(mapper.map(customerDTO , CustomerEntity.class));
    }

    @Override
    public void deleteCustomer(Integer id) {
        repositery.deleteById(id);
    }

    @Override
    public CustomerDTO searchById(Integer id) {
        CustomerEntity customerEntity = repositery.findById(id).get();
        CustomerDTO customerDTO = mapper.map(customerEntity, CustomerDTO.class);
        return customerDTO;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<CustomerEntity> customerEntities = repositery.findAll();
        ArrayList<CustomerDTO> customerDTOArrayList = new ArrayList<>();
        customerEntities.forEach(customerEntity -> {
            CustomerDTO customerDTO = mapper.map(customerEntity, CustomerDTO.class);
            customerDTOArrayList.add(customerDTO);
        });
        return customerDTOArrayList;
    }
}
