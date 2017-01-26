/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "trabajoabdominales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabajoabdominales.findAll", query = "SELECT t FROM Trabajoabdominales t"),
    @NamedQuery(name = "Trabajoabdominales.findByIdTrabajoAbdominales", query = "SELECT t FROM Trabajoabdominales t WHERE t.idTrabajoAbdominales = :idTrabajoAbdominales"),
    @NamedQuery(name = "Trabajoabdominales.findByEjerciciosIdejercicios", query = "SELECT t FROM Trabajoabdominales t WHERE t.ejerciciosIdejercicios = :ejerciciosIdejercicios")})
public class Trabajoabdominales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTrabajoAbdominales")
    private Integer idTrabajoAbdominales;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ejercicios_idejercicios")
    private int ejerciciosIdejercicios;

    public Trabajoabdominales() {
    }

    public Trabajoabdominales(Integer idTrabajoAbdominales) {
        this.idTrabajoAbdominales = idTrabajoAbdominales;
    }

    public Trabajoabdominales(Integer idTrabajoAbdominales, int ejerciciosIdejercicios) {
        this.idTrabajoAbdominales = idTrabajoAbdominales;
        this.ejerciciosIdejercicios = ejerciciosIdejercicios;
    }

    public Integer getIdTrabajoAbdominales() {
        return idTrabajoAbdominales;
    }

    public void setIdTrabajoAbdominales(Integer idTrabajoAbdominales) {
        this.idTrabajoAbdominales = idTrabajoAbdominales;
    }

    public int getEjerciciosIdejercicios() {
        return ejerciciosIdejercicios;
    }

    public void setEjerciciosIdejercicios(int ejerciciosIdejercicios) {
        this.ejerciciosIdejercicios = ejerciciosIdejercicios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrabajoAbdominales != null ? idTrabajoAbdominales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajoabdominales)) {
            return false;
        }
        Trabajoabdominales other = (Trabajoabdominales) object;
        if ((this.idTrabajoAbdominales == null && other.idTrabajoAbdominales != null) || (this.idTrabajoAbdominales != null && !this.idTrabajoAbdominales.equals(other.idTrabajoAbdominales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Trabajoabdominales[ idTrabajoAbdominales=" + idTrabajoAbdominales + " ]";
    }
    
}
