package com.example.admin.services;

import com.example.admin.entities.Experiences;
import com.example.admin.repositories.ExperiencesRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class FrontofficeServiceImpl implements FrontofficeServices {
    private ExperiencesRepository experiencesRepository;
    @Override
    public List<Experiences> getAllExpriences() {
        return  experiencesRepository.findAll();
    }

    @Override
    public Experiences save(Experiences e) {
        return experiencesRepository.save(e);
    }

    @Override
    public Experiences update(Experiences c) {
        return experiencesRepository.saveAndFlush(c);

    }

    @Override
    public void delete(Experiences e) {
        experiencesRepository.delete(e);

    }
}
