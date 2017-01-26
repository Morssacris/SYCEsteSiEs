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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "fuerzamaxima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fuerzamaxima.findAll", query = "SELECT f FROM Fuerzamaxima f"),
    @NamedQuery(name = "Fuerzamaxima.findByIdFuerzaMaxima", query = "SELECT f FROM Fuerzamaxima f WHERE f.idFuerzaMaxima = :idFuerzaMaxima"),
    @NamedQuery(name = "Fuerzamaxima.findByVelocidadMovimiento", query = "SELECT f FROM Fuerzamaxima f WHERE f.velocidadMovimiento = :velocidadMovimiento"),
    @NamedQuery(name = "Fuerzamaxima.findByFuerzaidFuerza", query = "SELECT f FROM Fuerzamaxima f WHERE f.fuerzaidFuerza = :fuerzaidFuerza")})
public class Fuerzamaxima implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFuerzaMaxima")
    private Integer idFuerzaMaxima;
    @Size(max = 10)
    @Column(name = "Velocidad_Movimiento")
    private String velocidadMovimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fuerza_idFuerza")
    private int fuerzaidFuerza;

    public Fuerzamaxima() {
    }

    public Fuerzamaxima(Integer idFuerzaMaxima) {
        this.idFuerzaMaxima = idFuerzaMaxima;
    }

    public Fuerzamaxima(Integer idFuerzaMaxima, int fuerzaidFuerza) {
        this.idFuerzaMaxima = idFuerzaMaxima;
        this.fuerzaidFuerza = fuerzaidFuerza;
    }

    public Integer getIdFuerzaMaxima() {
        return idFuerzaMaxima;
    }

    public void setIdFuerzaMaxima(Integer idFuerzaMaxima) {
        this.idFuerzaMaxima = idFuerzaMaxima;
    }

    public String getVelocidadMovimiento() {
        return velocidadMovimiento;
    }

    public void setVelocidadMovimiento(String velocidadMovimiento) {
        this.velocidadMovimiento = velocidadMovimiento;
    }

    public int getFuerzaidFuerza() {
        return fuerzaidFuerza;
    }

    public void setFuerzaidFuerza(int fuerzaidFuerza) {
        this.fuerzaidFuerza = fuerzaidFuerza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFuerzaMaxima != null ? idFuerzaMaxima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fuerzamaxima)) {
            return false;
        }
        Fuerzamaxima other = (Fuerzamaxima) object;
        if ((this.idFuerzaMaxima == null && other.idFuerzaMaxima != null) || (this.idFuerzaMaxima != null && !this.idFuerzaMaxima.equals(other.idFuerzaMaxima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Fuerzamaxima[ idFuerzaMaxima=" + idFuerzaMaxima + " ]";
    }
    
}
