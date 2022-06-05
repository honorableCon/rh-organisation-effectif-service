package com.honorablecon.gestionOrganisationEffectifs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TypeContrat {
    @Id
    private int idTypeContrat;
    private String libelleTypeContrat;
    private String slugTypeContrat;

    /* debut relation TypeContrat <-> Contrat */
    @OneToMany(mappedBy = "typeContrat", orphanRemoval = true)
    private List<Contrat> contrats = new ArrayList<>();
    public List<Contrat> getContrats() {
        return contrats;
    }
    public void setContrats(List<Contrat> contrats) {
        this.contrats = contrats;
    }
    /* fin relation TypeContrat <-> Contrat */

    public TypeContrat(int idTypeContrat, String libelleTypeContrat, String slugTypeContrat, List<Contrat> contrats) {
        this.idTypeContrat = idTypeContrat;
        this.libelleTypeContrat = libelleTypeContrat;
        this.slugTypeContrat = slugTypeContrat;
        this.contrats = contrats;
    }

    public TypeContrat() {
    }

    @Override
    public String toString() {
        return "TypeContrat{" +
                "idTypeContrat=" + idTypeContrat +
                ", libelleTypeContrat='" + libelleTypeContrat + '\'' +
                ", slugTypeContrat='" + slugTypeContrat + '\'' +
                ", contrats=" + contrats +
                '}';
    }

    public int getIdTypeContrat() {
        return idTypeContrat;
    }

    public void setIdTypeContrat(int idTypeContrat) {
        this.idTypeContrat = idTypeContrat;
    }

    public String getLibelleTypeContrat() {
        return libelleTypeContrat;
    }

    public void setLibelleTypeContrat(String libelleTypeContrat) {
        this.libelleTypeContrat = libelleTypeContrat;
    }

    public String getSlugTypeContrat() {
        return slugTypeContrat;
    }

    public void setSlugTypeContrat(String slugTypeContrat) {
        this.slugTypeContrat = slugTypeContrat;
    }
}
