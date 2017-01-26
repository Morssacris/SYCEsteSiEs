/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "fuerza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fuerza.findAll", query = "SELECT f FROM Fuerza f"),
    @NamedQuery(name = "Fuerza.findByIdFuerza", query = "SELECT f FROM Fuerza f WHERE f.idFuerza = :idFuerza"),
    @NamedQuery(name = "Fuerza.findByFuerzacol", query = "SELECT f FROM Fuerza f WHERE f.fuerzacol = :fuerzacol")})
public class Fuerza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFuerza")
    private Integer idFuerza;
    @Size(max = 45)
    @Column(name = "fuerzacol")
    private String fuerzacol;
    @ManyToMany(mappedBy = "fuerzaList")
    private List<Entrenamientos> entrenamientosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fuerza")
    private List<Ejercicios> ejerciciosList;

    public Fuerza() {
    }

    public Fuerza(Integer idFuerza) {
        this.idFuerza = idFuerza;
    }

    public Integer getIdFuerza() {
        return idFuerza;
    }

    public void setIdFuerza(Integer idFuerza) {
        this.idFuerza = idFuerza;
    }

    public String getFuerzacol() {
        return fuerzacol;
    }

    public void setFuerzacol(String fuerzacol) {
        this.fuerzacol = fuerzacol;
    }

    @XmlTransient
    public List<Entrenamientos> getEntrenamientosList() {
        return entrenamientosList;
    }

    public void setEntrenamientosList(List<Entrenamientos> entrenamientosList) {
        this.entrenamientosList = entrenamientosList;
    }

    @XmlTransient
    public List<Ejercicios> getEjerciciosList() {
        return ejerciciosList;
    }

    public void setEjerciciosList(List<Ejercicios> ejerciciosList) {
        this.ejerciciosList = ejerciciosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFuerza != null ? idFuerza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fuerza)) {
            return false;
        }
        Fuerza other = (Fuerza) object;
        if ((this.idFuerza == null && other.idFuerza != null) || (this.idFuerza != null && !this.idFuerza.equals(other.idFuerza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Fuerza[ idFuerza=" + idFuerza + " ]";
    }
    
}
