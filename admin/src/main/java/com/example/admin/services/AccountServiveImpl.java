package com.example.admin.services;


import com.example.admin.entities.AppRole;
import com.example.admin.entities.AppUser;
import com.example.admin.repositories.RoleRepository;
import com.example.admin.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class AccountServiveImpl implements AccountService{
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    @Override
    public AppUser addNewUser(String username, String password, String email, String confirmPassword) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser != null) {
            throw new RuntimeException("This user already exists");
        }
        if (!password.equals(confirmPassword)) {
            throw new RuntimeException("Passwords do not match");
        }
        // Le mot de passe correspond, vous pouvez maintenant créer un nouvel utilisateur
        appUser = AppUser.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .email(email)
                .build();
        AppUser savedUser = userRepository.save(appUser);
        return savedUser;
    }


    @Override
    public AppRole addNewRole(String role) {
        //AppRole appRole=roleRepository.findById((role)).orElse(null);
        AppRole appRole=  roleRepository.findByRole(role);
        if (appRole!=null) throw new RuntimeException("this role already exist");
        appRole= AppRole.builder()
                .role(role)
                .build();
        return roleRepository.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String role) {
        AppUser appUser=userRepository.findByUsername(username);
        AppRole appRole=roleRepository.findByRole(role);
        appUser.getRoles().add(appRole);
        //userRepository.save(user);

    }

    @Override
    public void removeRoleToUser(String username, String role) {
        AppUser appUser=userRepository.findByUsername(username);
        AppRole appRole=  roleRepository.findByRole(role);

        appUser.getRoles().remove(appRole);

    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
