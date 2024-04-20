package com.example.admin.web;


import com.example.admin.entities.Experiences;
import com.example.admin.services.FrontofficeServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
@RequestMapping("/experiences")
public class ExperiencesControlleur {

    public FrontofficeServices frontofficeServices;



    @GetMapping
    public List<Experiences> getAllExperiences(){
        return frontofficeServices.getAllExpriences();
    }
    @PostMapping
    public Experiences save(@RequestBody Experiences e) {
        return frontofficeServices.save(e);
    }
    @PutMapping
    @RequestMapping("/{id}")
    public Experiences update(@RequestBody Experiences e, @PathVariable Long id){
        e.setId(id);
        return frontofficeServices.update(e);
    }
    @DeleteMapping
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        Experiences e =new Experiences();
        e.setId(id);
        frontofficeServices.delete(e);
    }




}