package com.example.admin.repositories;

import com.example.admin.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation,Long> {
}
