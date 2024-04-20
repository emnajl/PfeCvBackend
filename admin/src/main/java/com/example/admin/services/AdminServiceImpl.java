package com.example.admin.services;


import com.example.admin.dtos.ConsultantDTO;
import com.example.admin.dtos.Manager1DTO;
import com.example.admin.entities.Consultant;
import com.example.admin.entities.Manager1;
import com.example.admin.exceptions.ConsultanNotFoundException;
import com.example.admin.exceptions.MangerNotFoundException;
import com.example.admin.mappers.AdminMapper;
import com.example.admin.repositories.ConsultantRepository;
import com.example.admin.repositories.MangerRepository;
import com.example.admin.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class

AdminServiceImpl implements AdminServices {


    private UserRepository userRepository;
    private MangerRepository mangerRepository;
    private ConsultantRepository consultantRepository;
    private AdminMapper dtoMapper;
    //private EmailService emailService;








    @Override
    public List<ConsultantDTO> ListConsultant() {
        List<Consultant> consultants = (List<Consultant>) consultantRepository.findAll();
        List<ConsultantDTO> consultantDTOS = consultants.stream()
                .map(consultant -> dtoMapper.fromConsultant(consultant))
                .collect(Collectors.toList());
        return consultantDTOS;
    }

    @Override
    public ConsultantDTO getConsultant(Long consultanId) throws ConsultanNotFoundException {
        Consultant consultant = consultantRepository.findById(consultanId)
                .orElseThrow(() -> new ConsultanNotFoundException("Consultant Not found"));
        return dtoMapper.fromConsultant(consultant);
    }

    @Override
    public ConsultantDTO updateConsultan(ConsultantDTO consultantDTO) {
        log.info("Saving new Consultant");
        Consultant consultant = dtoMapper.fromConsultantDTO(consultantDTO);
        Consultant savedConsultant = consultantRepository.save(consultant);
        return dtoMapper.fromConsultant(savedConsultant);
    }

    @Override
    public void deleteConsultan(Long consultanId) {
        consultantRepository.deleteById(consultanId);

    }

    @Override
    public List<ConsultantDTO> searchConsultant(String keyword) {
        List<Consultant> consultants = consultantRepository.searchConsultan(keyword);
        List<ConsultantDTO> consultantDTOS = consultants.stream().map(cust -> dtoMapper.fromConsultant(cust)).collect(Collectors.toList());
        return consultantDTOS;
    }

    @Override
    public Manager1DTO saveManger(Manager1DTO manager1DTO) {
        log.info("Saving new Manager");
        String password =dtoMapper.generateRandomPassword();
        Manager1 manager1 = dtoMapper.fromMangerDTO(manager1DTO);
        manager1.setPassword(password);
        Manager1 savedManger = mangerRepository.save(manager1);
        return dtoMapper.fromManger(savedManger);

    }


    @Override
    public List<Manager1DTO> ListManger() {
        List<Manager1> manager1s = (List<Manager1>) mangerRepository.findAll();
        List<Manager1DTO> manager1DTOS = manager1s.stream()
                .map(manager1 -> dtoMapper.fromManger(manager1))
                .collect(Collectors.toList());
        return manager1DTOS;
    }

    @Override
    public Manager1DTO getManger(Long mangerId) throws MangerNotFoundException {
        Manager1 manager1 = mangerRepository.findById(mangerId)
                .orElseThrow(() -> new MangerNotFoundException("Manager Not found"));
        return dtoMapper.fromManger(manager1);
    }

    @Override
    public Manager1DTO updateManger(Manager1DTO manager1DTO) {
        log.info("Saving new Manager");
        Manager1 manager1 = dtoMapper.fromMangerDTO(manager1DTO);
        Manager1 savedManager = mangerRepository.save(manager1);
        return dtoMapper.fromManger(savedManager);

    }

    @Override
    public void deleteManger(Long mangerId) {
        mangerRepository.deleteById(mangerId);

    }

    @Override
    public List<Manager1DTO> searchManager(String keyword) {
        List<Manager1> manager1s = mangerRepository.searchManager(keyword);
        List<Manager1DTO> manager1DTOS = manager1s.stream().map(mang -> dtoMapper.fromManger(mang)).collect(Collectors.toList());
        return manager1DTOS;
    }

}
