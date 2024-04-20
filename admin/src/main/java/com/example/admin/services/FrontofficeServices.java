package com.example.admin.services;

import com.example.admin.entities.Experiences;

import java.util.List;

public interface FrontofficeServices {
  List<Experiences> getAllExpriences();
  Experiences save(Experiences e);
     Experiences update(Experiences c);
    void delete(Experiences e);



}
