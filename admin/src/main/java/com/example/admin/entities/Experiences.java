package com.example.admin.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="experiences")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Experiences {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="societe")
    private String societe;
    @Column(name="poste")
    private String poste;
    @Column(name="dateDebut")
    private Date dateDebut;
    @Column(name="dateFin")
    private Date dateFin;
}


