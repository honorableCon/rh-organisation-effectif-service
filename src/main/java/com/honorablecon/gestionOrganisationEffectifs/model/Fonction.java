package com.honorablecon.gestionOrganisationEffectifs.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Fonction {
    @Id
    private int idFonction;
    private String nomFonction;

    public Fonction(int idFonction, String nomFonction) {
        this.idFonction = idFonction;
        this.nomFonction = nomFonction;
    }

    public Fonction() {}

    /* Debut relation Fonction <-> PersonnelFonction */
    @OneToMany(mappedBy = "fonction", orphanRemoval = true)
    private List<PersonnelFonction> personnelFonctions = new ArrayList<>();
    public List<PersonnelFonction> getPersonnelFonctions() {
        return personnelFonctions;
    }
    public void setPersonnelFonctions(List<PersonnelFonction> personnelFonctions) {
        this.personnelFonctions = personnelFonctions;
    }

    /* getter setter*/

    public int getIdFonction() {
        return idFonction;
    }

    public void setIdFonction(int idFonction) {
        this.idFonction = idFonction;
    }

    public String getNomFonction() {
        return nomFonction;
    }

    public void setNomFonction(String nomFonction) {
        this.nomFonction = nomFonction;
    }
}
