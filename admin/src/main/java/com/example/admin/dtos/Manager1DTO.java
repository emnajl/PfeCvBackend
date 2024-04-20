package com.example.admin.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager1DTO {
    private Long id;
    private String name;
    private String email;
    private String username;
    private String password;
}
