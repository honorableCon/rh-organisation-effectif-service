package com.honorablecon.gestionOrganisationEffectifs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Statut {
    @Id
    private int idStatut;
    private String libelleStatut;

    /* Debut relation Statut <-> Contrat */
    @OneToMany(mappedBy = "statut", orphanRemoval = true)
    private List<Contrat> contrats = new ArrayList<>();
    public List<Contrat> getContrats() {
        return contrats;
    }
    public void setContrats(List<Contrat> contrats) {
        this.contrats = contrats;
    }
    /* Fin relation Statut <-> Contrat */

    public Statut(int idStatut, String libelleStatut, List<Contrat> contrats) {
        this.idStatut = idStatut;
        this.libelleStatut = libelleStatut;
        this.contrats = contrats;
    }

    public Statut() {}

    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    public String getLibelleStatut() {
        return libelleStatut;
    }

    public void setLibelleStatut(String libelleStatut) {
        this.libelleStatut = libelleStatut;
    }
}
