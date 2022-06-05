package com.honorablecon.gestionOrganisationEffectifs.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cause {
    @Id
    private int idCause;
    private String libelleCause;

    /* debut relation Cause <-> Depart */
    @OneToMany(mappedBy = "cause", cascade = CascadeType.ALL)
    private List<Depart> departs = new ArrayList<>();
    public List<Depart> getDeparts() {
        return departs;
    }
    public void setDeparts(List<Depart> departs) {
        this.departs = departs;
    }
    /* fin relation Cause <-> Depart */

    public Cause(int idCause, String libelleCause, List<Depart> departs) {
        this.idCause = idCause;
        this.libelleCause = libelleCause;
        this.departs = departs;
    }

    public Cause() {}

    public int getIdCause() {
        return idCause;
    }

    public void setIdCause(int idCause) {
        this.idCause = idCause;
    }

    public String getLibelleCause() {
        return libelleCause;
    }

    public void setLibelleCause(String libelleCause) {
        this.libelleCause = libelleCause;
    }
}
