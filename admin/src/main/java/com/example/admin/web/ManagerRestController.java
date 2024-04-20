package com.example.admin.web;

import com.example.admin.dtos.ConsultantDTO;
import com.example.admin.dtos.Manager1DTO;
import com.example.admin.dtos.UserDTO;
import com.example.admin.exceptions.ConsultanNotFoundException;
import com.example.admin.exceptions.MangerNotFoundException;
import com.example.admin.services.AdminServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class ManagerRestController {
    public AdminServices adminServices;
    @GetMapping("/managers")
    public List<Manager1DTO> managers(){
        return adminServices.ListManger();
    }
    @GetMapping("/managers/search")
    public List<Manager1DTO> searchManager(@RequestParam(name = "keyword",defaultValue = "") String keyword){
        return adminServices.searchManager("%"+keyword+"%");
    }

    @GetMapping("/managers/{id}")
    public Manager1DTO getManger(@PathVariable(name = "id") Long mangerId) throws MangerNotFoundException {
        return adminServices.getManger(mangerId);
    }
    @PostMapping("/managers")
    public Manager1DTO saveManger(@RequestBody Manager1DTO manager1DTO){
        return adminServices.saveManger(manager1DTO);
    }
    @PutMapping("/managers/{mangerId}")
    public Manager1DTO updateManger(@PathVariable Long mangerId, @RequestBody Manager1DTO manager1DTO){
        manager1DTO.setId(mangerId);
        return adminServices.updateManger(manager1DTO);
    }
    @DeleteMapping("/managers/{id}")
    public void deleteManger(@PathVariable Long id){
        adminServices.deleteManger(id);
    }

}
