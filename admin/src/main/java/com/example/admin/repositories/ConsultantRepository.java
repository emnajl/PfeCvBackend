package com.example.admin.repositories;

import com.example.admin.entities.Consultant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConsultantRepository extends CrudRepository<Consultant,Long> {
    @Query("select c from Consultant c where c.name like :kw")
    List<Consultant> searchConsultan(@Param("kw") String keyword);
}
