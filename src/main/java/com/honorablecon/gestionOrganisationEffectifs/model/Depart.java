package com.honorablecon.gestionOrganisationEffectifs.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Depart {
    @Id
    private int idDepart;
    private Date dateDepart;

    /* Debut relation Depart <-> Cause */
    @ManyToOne
    @JoinColumn(name = "idCauseFk")
    private Cause cause;
    public Cause getCause() {
        return cause;
    }
    public void setCause(Cause cause) {
        this.cause = cause;
    }
    /* Fin relation Depart <-> Cause */


    /* Debut relation Depart <-> Personnel */
    @OneToMany(mappedBy = "depart", orphanRemoval = true)
    private List<Personnel> personnels = new ArrayList<>();
    public List<Personnel> getPersonnels() {
        return personnels;
    }
    public void setPersonnels(List<Personnel> personnels) {
        this.personnels = personnels;
    }
    /* Fin relation Depart <-> Personnel */

    public Depart(int idDepart, Date dateDepart, Cause cause) {
        this.idDepart = idDepart;
        this.dateDepart = dateDepart;
        this.cause = cause;
    }

    public Depart() {}

    public int getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(int idDepart) {
        this.idDepart = idDepart;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }
}
