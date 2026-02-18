package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {
    private Integer id;
    private String f_name;
    private String l_name;
    private String address;
    private String phone;
}
