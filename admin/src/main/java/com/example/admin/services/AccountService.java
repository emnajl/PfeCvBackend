package com.example.admin.services;

import com.example.admin.entities.AppRole;
import com.example.admin.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username, String password, String email, String confirmPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username,String role);
    void  removeRoleToUser(String username,String role);
    AppUser loadUserByUsername(String username);
}
