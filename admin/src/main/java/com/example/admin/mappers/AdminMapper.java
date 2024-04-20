package com.example.admin.mappers;

import com.example.admin.dtos.ConsultantDTO;
import com.example.admin.dtos.Manager1DTO;
import com.example.admin.entities.Consultant;
import com.example.admin.entities.Manager1;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AdminMapper {
    public ConsultantDTO fromConsultant(Consultant consultant){
        ConsultantDTO consultantDTO=new ConsultantDTO();
        BeanUtils.copyProperties(consultant,consultantDTO);
        return  consultantDTO;
    }
    public Consultant fromConsultantDTO(ConsultantDTO consultantDTO){
        Consultant consultant=new Consultant();
        BeanUtils.copyProperties(consultantDTO,consultant);
        return  consultant;
    }
    public Manager1DTO fromManger(Manager1 manager1){
        Manager1DTO manager1DTO=new Manager1DTO();
        BeanUtils.copyProperties(manager1,manager1DTO);
        return  manager1DTO;
    }
    public Manager1 fromMangerDTO(Manager1DTO manager1DTO){
        Manager1 manager1=new Manager1();
        BeanUtils.copyProperties(manager1DTO,manager1);
        return  manager1;
    }
    public String generateRandomPassword() {
        // Génération d'un mot de passe aléatoire
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        Random rnd = new Random();
        while (password.length() < 8) { // Longueur du mot de passe
            int index = (int) (rnd.nextFloat() * chars.length());
            password.append(chars.charAt(index));
        }
        return password.toString();
    }

    }
