package com.example.admin.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Consultant extends AppUser  implements Serializable {
    private String name;
    @ManyToMany(mappedBy="consultants",fetch = FetchType.EAGER )
    private Collection<Module>modules=new ArrayList<>();
    @OneToMany
    private List<Experiences> experiences;
    @OneToMany
    private List<Formation> formations;
    @OneToMany
    private List<Langues> langues;

}
