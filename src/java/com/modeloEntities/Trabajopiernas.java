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
@Table(name = "trabajopiernas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabajopiernas.findAll", query = "SELECT t FROM Trabajopiernas t"),
    @NamedQuery(name = "Trabajopiernas.findByIdTrabajoPiernas", query = "SELECT t FROM Trabajopiernas t WHERE t.idTrabajoPiernas = :idTrabajoPiernas"),
    @NamedQuery(name = "Trabajopiernas.findByEjerciciosIdejercicios", query = "SELECT t FROM Trabajopiernas t WHERE t.ejerciciosIdejercicios = :ejerciciosIdejercicios")})
public class Trabajopiernas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTrabajoPiernas")
    private Integer idTrabajoPiernas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ejercicios_idejercicios")
    private int ejerciciosIdejercicios;

    public Trabajopiernas() {
    }

    public Trabajopiernas(Integer idTrabajoPiernas) {
        this.idTrabajoPiernas = idTrabajoPiernas;
    }

    public Trabajopiernas(Integer idTrabajoPiernas, int ejerciciosIdejercicios) {
        this.idTrabajoPiernas = idTrabajoPiernas;
        this.ejerciciosIdejercicios = ejerciciosIdejercicios;
    }

    public Integer getIdTrabajoPiernas() {
        return idTrabajoPiernas;
    }

    public void setIdTrabajoPiernas(Integer idTrabajoPiernas) {
        this.idTrabajoPiernas = idTrabajoPiernas;
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
        hash += (idTrabajoPiernas != null ? idTrabajoPiernas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajopiernas)) {
            return false;
        }
        Trabajopiernas other = (Trabajopiernas) object;
        if ((this.idTrabajoPiernas == null && other.idTrabajoPiernas != null) || (this.idTrabajoPiernas != null && !this.idTrabajoPiernas.equals(other.idTrabajoPiernas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Trabajopiernas[ idTrabajoPiernas=" + idTrabajoPiernas + " ]";
    }
    
}
