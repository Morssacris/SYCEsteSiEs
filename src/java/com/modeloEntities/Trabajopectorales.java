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
@Table(name = "trabajopectorales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabajopectorales.findAll", query = "SELECT t FROM Trabajopectorales t"),
    @NamedQuery(name = "Trabajopectorales.findByIdTrabajoPectorales", query = "SELECT t FROM Trabajopectorales t WHERE t.idTrabajoPectorales = :idTrabajoPectorales"),
    @NamedQuery(name = "Trabajopectorales.findByEjerciciosIdejercicios", query = "SELECT t FROM Trabajopectorales t WHERE t.ejerciciosIdejercicios = :ejerciciosIdejercicios")})
public class Trabajopectorales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTrabajoPectorales")
    private Integer idTrabajoPectorales;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ejercicios_idejercicios")
    private int ejerciciosIdejercicios;

    public Trabajopectorales() {
    }

    public Trabajopectorales(Integer idTrabajoPectorales) {
        this.idTrabajoPectorales = idTrabajoPectorales;
    }

    public Trabajopectorales(Integer idTrabajoPectorales, int ejerciciosIdejercicios) {
        this.idTrabajoPectorales = idTrabajoPectorales;
        this.ejerciciosIdejercicios = ejerciciosIdejercicios;
    }

    public Integer getIdTrabajoPectorales() {
        return idTrabajoPectorales;
    }

    public void setIdTrabajoPectorales(Integer idTrabajoPectorales) {
        this.idTrabajoPectorales = idTrabajoPectorales;
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
        hash += (idTrabajoPectorales != null ? idTrabajoPectorales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajopectorales)) {
            return false;
        }
        Trabajopectorales other = (Trabajopectorales) object;
        if ((this.idTrabajoPectorales == null && other.idTrabajoPectorales != null) || (this.idTrabajoPectorales != null && !this.idTrabajoPectorales.equals(other.idTrabajoPectorales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Trabajopectorales[ idTrabajoPectorales=" + idTrabajoPectorales + " ]";
    }
    
}
