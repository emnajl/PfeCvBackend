package com.example.admin.repositories;

import com.example.admin.entities.Consultant;
import com.example.admin.entities.Manager1;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MangerRepository extends CrudRepository<Manager1,Long> {


    @Query("select m from Manager1 m where m.name like :kw")
    List<Manager1> searchManager(@Param("kw") String keyword);

    List<Manager1> findByNameLike(String name);

}
