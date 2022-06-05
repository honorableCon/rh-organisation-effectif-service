package com.honorablecon.gestionOrganisationEffectifs.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Filiere {
    @Id
    private int idFiliere;
    private String nomFiliere;
    private Date dateIntegrationFiliere;
    private Date dateFinIntegrationFiliere;

    /* Debut relation Filiere <-> Personnel */
    @OneToMany(mappedBy = "filiere", orphanRemoval = true)
    private List<Personnel> personnels = new ArrayList<>();
    public List<Personnel> getPersonnels() {
        return personnels;
    }
    public void setPersonnels(List<Personnel> personnels) {
        this.personnels = personnels;
    }
    /* Fin relation Filiere <-> Personnel */

    /* Debut relation Filiere <-> Structure */
    @ManyToOne
    @JoinColumn(name = "idStructureFk")
    private Structure structure;
    public Structure getStructure() {
        return structure;
    }
    public void setStructure(Structure structure) {
        this.structure = structure;
    }
    /* Fin relation Filiere <-> Structure */

    public Filiere(int idFiliere, String nomFiliere, Date dateIntegrationFiliere, Date dateFinIntegrationFiliere) {
        this.idFiliere = idFiliere;
        this.nomFiliere = nomFiliere;
        this.dateIntegrationFiliere = dateIntegrationFiliere;
        this.dateFinIntegrationFiliere = dateFinIntegrationFiliere;
    }

    public Filiere() {}

    /* getters and setters */

    public int getIdFiliere() {
        return idFiliere;
    }

    public void setIdFiliere(int idFiliere) {
        this.idFiliere = idFiliere;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    public Date getDateIntegrationFiliere() {
        return dateIntegrationFiliere;
    }

    public void setDateIntegrationFiliere(Date dateIntegrationFiliere) {
        this.dateIntegrationFiliere = dateIntegrationFiliere;
    }

    public Date getDateFinIntegrationFiliere() {
        return dateFinIntegrationFiliere;
    }

    public void setDateFinIntegrationFiliere(Date dateFinIntegrationFiliere) {
        this.dateFinIntegrationFiliere = dateFinIntegrationFiliere;
    }
}
