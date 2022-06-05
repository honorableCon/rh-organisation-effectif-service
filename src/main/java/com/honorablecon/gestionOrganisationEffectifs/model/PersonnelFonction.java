package com.honorablecon.gestionOrganisationEffectifs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class PersonnelFonction {
    @Id
    private int idPersonnelFonction;
    private Date dateDebutPersonnelFonction;
    private Date dateFinPersonnelFonction;

    public PersonnelFonction(int idPersonnelFonction, Date dateDebutPersonnelFonction, Date dateFinPersonnelFonction) {
        this.idPersonnelFonction = idPersonnelFonction;
        this.dateDebutPersonnelFonction = dateDebutPersonnelFonction;
        this.dateFinPersonnelFonction = dateFinPersonnelFonction;
    }

    public PersonnelFonction() {}

    public int getIdPersonnelFonction() {
        return idPersonnelFonction;
    }

    public void setIdPersonnelFonction(int idPersonnelFonction) {
        this.idPersonnelFonction = idPersonnelFonction;
    }

    public Date getDateDebutPersonnelFonction() {
        return dateDebutPersonnelFonction;
    }

    public void setDateDebutPersonnelFonction(Date dateDebutPersonnelFonction) {
        this.dateDebutPersonnelFonction = dateDebutPersonnelFonction;
    }

    public Date getDateFinPersonnelFonction() {
        return dateFinPersonnelFonction;
    }

    public void setDateFinPersonnelFonction(Date dateFinPersonnelFonction) {
        this.dateFinPersonnelFonction = dateFinPersonnelFonction;
    }

    /* Debut relation PersonnelFonction <-> Personnel */
    @ManyToOne
    @JoinColumn(name = "idPersonnelFk")
    private Personnel personnel;
    public Personnel getPersonnel() {
        return personnel;
    }
    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }
    /* Fin relation PersonnelFonction <-> Personnel */

    /* Debut relation PersonnelFonction <-> Fonction */
    @ManyToOne
    @JoinColumn(name = "idFonctionFk")
    private Fonction fonction;
    public Fonction getFonction() {
        return fonction;
    }
    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }
   /* Fin relation PersonnelFonction <-> Fonction */

}
