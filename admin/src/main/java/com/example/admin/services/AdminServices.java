package com.example.admin.services;

import com.example.admin.dtos.ConsultantDTO;
import com.example.admin.dtos.Manager1DTO;
import com.example.admin.dtos.UserDTO;
import com.example.admin.exceptions.ConsultanNotFoundException;
import com.example.admin.exceptions.MangerNotFoundException;

import java.util.List;
import java.util.Random;

public interface AdminServices {

     List<ConsultantDTO>ListConsultant();
     ConsultantDTO getConsultant(Long consultanId) throws ConsultanNotFoundException;
     ConsultantDTO updateConsultan(ConsultantDTO consultantDTO);
     void deleteConsultan(Long consultanId);

     List<ConsultantDTO> searchConsultant(String keyword);
     Manager1DTO saveManger(Manager1DTO manager1DTO);
     List<Manager1DTO>ListManger();
     Manager1DTO getManger(Long mangerId) throws MangerNotFoundException;
     Manager1DTO updateManger(Manager1DTO manager1DTO);
     void deleteManger(Long mangerId);
     List<Manager1DTO> searchManager(String keyword);

}
