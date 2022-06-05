package com.honorablecon.gestionOrganisationEffectifs.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Contrat {
    @Id
    @Column(nullable = false)
    private int idContrat;
    private Date dateDebutContrat;
    private Date dateFinContrat;

    /* debut relation Personnel <-> contrat */
    @ManyToOne
    @JoinColumn(name = "idPersonnelFk")
    private Personnel personnel;
    public Personnel getPersonnel() {
        return personnel;
    }
    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }
    /* fin relation Personnel <-> contrat */

   /* debut relation Contrat <-> Statut */
    @ManyToOne
    @JoinColumn(name = "idStatut")
    private Statut statut;
    public Statut getStatut() {
        return statut;
    }
    public void setStatut(Statut statut) {
        this.statut = statut;
    }
    /* Fin relation Contrat <-> Statut */

    /* debut relation Contrat <-> Type de contrat */
    @ManyToOne
    @JoinColumn(name = "idTypeContratFk")
    private TypeContrat typeContrat;
    public TypeContrat getTypeContrat() {
        return typeContrat;
    }
    public void setTypeContrat(TypeContrat typeContrat) {
        this.typeContrat = typeContrat;
    }
    /* debut relation Contrat <-> Type de contrat */

    public Contrat(int idContrat, Date dateDebutContrat, Date dateFinContrat) {
        this.idContrat = idContrat;
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
    }

    public Contrat() {}

    public Contrat(Date dateDebutContrat, Date dateFinContrat) {
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }
}