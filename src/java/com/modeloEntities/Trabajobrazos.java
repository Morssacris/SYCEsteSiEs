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
@Table(name = "trabajobrazos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabajobrazos.findAll", query = "SELECT t FROM Trabajobrazos t"),
    @NamedQuery(name = "Trabajobrazos.findByIdTrabajoBrazos", query = "SELECT t FROM Trabajobrazos t WHERE t.idTrabajoBrazos = :idTrabajoBrazos"),
    @NamedQuery(name = "Trabajobrazos.findByEjerciciosIdejercicios", query = "SELECT t FROM Trabajobrazos t WHERE t.ejerciciosIdejercicios = :ejerciciosIdejercicios")})
public class Trabajobrazos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTrabajoBrazos")
    private Integer idTrabajoBrazos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ejercicios_idejercicios")
    private int ejerciciosIdejercicios;

    public Trabajobrazos() {
    }

    public Trabajobrazos(Integer idTrabajoBrazos) {
        this.idTrabajoBrazos = idTrabajoBrazos;
    }

    public Trabajobrazos(Integer idTrabajoBrazos, int ejerciciosIdejercicios) {
        this.idTrabajoBrazos = idTrabajoBrazos;
        this.ejerciciosIdejercicios = ejerciciosIdejercicios;
    }

    public Integer getIdTrabajoBrazos() {
        return idTrabajoBrazos;
    }

    public void setIdTrabajoBrazos(Integer idTrabajoBrazos) {
        this.idTrabajoBrazos = idTrabajoBrazos;
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
        hash += (idTrabajoBrazos != null ? idTrabajoBrazos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajobrazos)) {
            return false;
        }
        Trabajobrazos other = (Trabajobrazos) object;
        if ((this.idTrabajoBrazos == null && other.idTrabajoBrazos != null) || (this.idTrabajoBrazos != null && !this.idTrabajoBrazos.equals(other.idTrabajoBrazos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Trabajobrazos[ idTrabajoBrazos=" + idTrabajoBrazos + " ]";
    }
    
}
