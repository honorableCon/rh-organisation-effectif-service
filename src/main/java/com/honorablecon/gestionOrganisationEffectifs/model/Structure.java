package com.honorablecon.gestionOrganisationEffectifs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Structure {
    @Id
    private int idStructure;
    private String nomStructure;

     /* Debut relation Structure <-> Filiere */
    @OneToMany(mappedBy = "structure", orphanRemoval = true)
    private List<Filiere> filieres = new ArrayList<>();
    public List<Filiere> getFilieres() {
        return filieres;
    }
    public void setFilieres(List<Filiere> filieres) {
        this.filieres = filieres;
    }
    /* Fin relation Structure <-> Filiere */

    public Structure(int idStructure, String nomStructure) {
        this.idStructure = idStructure;
        this.nomStructure = nomStructure;
    }

    public Structure() {}

    public int getIdStructure() {
        return idStructure;
    }

    public void setIdStructure(int idStructure) {
        this.idStructure = idStructure;
    }

    public String getNomStructure() {
        return nomStructure;
    }

    public void setNomStructure(String nomStructure) {
        this.nomStructure = nomStructure;
    }
}
