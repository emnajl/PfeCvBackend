package com.example.admin.repositories;

import com.example.admin.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<AppRole,Long> {

   AppRole findByRole(String role);

}
