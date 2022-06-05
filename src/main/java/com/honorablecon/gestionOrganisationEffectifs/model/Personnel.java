package com.honorablecon.gestionOrganisationEffectifs.model;

import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.*;

@Entity
public class Personnel {
    @Id
    private int idPersonnel;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String sexe;
    private String nationalite;
    private String email;
    private String telephone;
    private int nombreEnfant;
    private int nombreConjoint;
    private String situationMatrimoniale;

    /* Debut relation Personnel <-> Contrat */
        @OneToMany(mappedBy = "personnel", orphanRemoval = true)
        private Collection<Contrat> contrats = new ArrayList<>();
        public Collection<Contrat> getContrats () {
            return contrats;
        }
        public void setContrats (Collection < Contrat > contrats) {
            this.contrats = contrats;
        }
    /* Fin relation Personnel <-> Contrat */

    /* Debut relation Personnel <-> Filiere */
    @ManyToOne
    @JoinColumn(name = "idFiliereFk")
    private Filiere filiere;
    public Filiere getFiliere() {
        return filiere;
    }
    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    /* Fin relation Personnel <-> Filiere */

    /* Debut relation Personnel <-> Depart */
    @ManyToOne
    @JoinColumn(name = "idDepartFk")
    private Depart depart;
    public Depart getDepart() {
        return depart;
    }
    public void setDepart(Depart depart) {
        this.depart = depart;
    }
    /* Fin relation Personnel <-> Depart */

    /* Debut relation Personnel <-> PersonnelFonction */
    @OneToMany(mappedBy = "personnel", orphanRemoval = true)
    private List<PersonnelFonction> personnelFonctions = new ArrayList<>();
    public List<PersonnelFonction> getPersonnelFonctions() {
        return personnelFonctions;
    }
    public void setPersonnelFonctions(List<PersonnelFonction> personnelFonctions) {
        this.personnelFonctions = personnelFonctions;
    }
    /* Fin relation Personnel <-> PersonnelFonction */


    public Personnel(int idPersonnel, String nom, String prenom, Date dateNaissance, String sexe, String nationalite, String email, String telephone, int nombreEnfant, int nombreConjoint, String situationMatrimoniale) {
        this.idPersonnel = idPersonnel;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.nationalite = nationalite;
        this.email = email;
        this.telephone = telephone;
        this.nombreEnfant = nombreEnfant;
        this.nombreConjoint = nombreConjoint;
        this.situationMatrimoniale = situationMatrimoniale;
    }

    public Personnel(String nom, String prenom, Date dateNaissance, String sexe, String nationalite, String email, String telephone, int nombreEnfant, int nombreConjoint, String situationMatrimoniale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.nationalite = nationalite;
        this.email = email;
        this.telephone = telephone;
        this.nombreEnfant = nombreEnfant;
        this.nombreConjoint = nombreConjoint;
        this.situationMatrimoniale = situationMatrimoniale;
    }

    public Personnel() {}

    public int getIdPersonnel() {
        return idPersonnel;
    }

    public void setIdPersonnel(int idPersonnel) {
        this.idPersonnel = idPersonnel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getNombreEnfant() {
        return nombreEnfant;
    }

    public void setNombreEnfant(int nombreEnfant) {
        this.nombreEnfant = nombreEnfant;
    }

    public int getNombreConjoint() {
        return nombreConjoint;
    }

    public void setNombreConjoint(int nombreConjoint) {
        this.nombreConjoint = nombreConjoint;
    }

    public String getSituationMatrimoniale() {
        return situationMatrimoniale;
    }

    public void setSituationMatrimoniale(String situationMatrimoniale) {
        this.situationMatrimoniale = situationMatrimoniale;
    }
}
