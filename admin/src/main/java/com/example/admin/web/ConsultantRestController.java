package com.example.admin.web;

import com.example.admin.dtos.ConsultantDTO;
import com.example.admin.dtos.UserDTO;
import com.example.admin.exceptions.ConsultanNotFoundException;
import com.example.admin.services.AdminServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class ConsultantRestController {
    public AdminServices adminServices;
    @GetMapping("/consultants")
    public List<ConsultantDTO> consultants(){
        return adminServices.ListConsultant();
    }
    @GetMapping("/consultants/search")
    public List<ConsultantDTO> searchConsultant(@RequestParam(name = "keyword",defaultValue = "") String keyword){
        return adminServices.searchConsultant("%"+keyword+"%");
    }
    @GetMapping("/consultant/{id}")
    public ConsultantDTO getConsultant(@PathVariable(name = "id") Long consultanId) throws ConsultanNotFoundException {
        return adminServices.getConsultant(consultanId);
    }

    @PutMapping("/consultants/{consultanId}")
    public ConsultantDTO updateConsultant(@PathVariable Long consultanId, @RequestBody ConsultantDTO consultantDTO){
        consultantDTO.setId(consultanId);
        return adminServices.updateConsultan(consultantDTO);
    }
    @DeleteMapping("/consultants/{id}")
    public void deleteConsultant(@PathVariable Long id){
        adminServices.deleteConsultan(id);
    }

}
