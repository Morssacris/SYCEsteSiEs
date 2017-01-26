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
@Table(name = "fuerzaexplosiva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fuerzaexplosiva.findAll", query = "SELECT f FROM Fuerzaexplosiva f"),
    @NamedQuery(name = "Fuerzaexplosiva.findByIdFuerzaExplosiva", query = "SELECT f FROM Fuerzaexplosiva f WHERE f.idFuerzaExplosiva = :idFuerzaExplosiva"),
    @NamedQuery(name = "Fuerzaexplosiva.findByImplemento", query = "SELECT f FROM Fuerzaexplosiva f WHERE f.implemento = :implemento"),
    @NamedQuery(name = "Fuerzaexplosiva.findByFuerzaidFuerza", query = "SELECT f FROM Fuerzaexplosiva f WHERE f.fuerzaidFuerza = :fuerzaidFuerza")})
public class Fuerzaexplosiva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFuerzaExplosiva")
    private Integer idFuerzaExplosiva;
    @Size(max = 45)
    @Column(name = "Implemento")
    private String implemento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fuerza_idFuerza")
    private int fuerzaidFuerza;

    public Fuerzaexplosiva() {
    }

    public Fuerzaexplosiva(Integer idFuerzaExplosiva) {
        this.idFuerzaExplosiva = idFuerzaExplosiva;
    }

    public Fuerzaexplosiva(Integer idFuerzaExplosiva, int fuerzaidFuerza) {
        this.idFuerzaExplosiva = idFuerzaExplosiva;
        this.fuerzaidFuerza = fuerzaidFuerza;
    }

    public Integer getIdFuerzaExplosiva() {
        return idFuerzaExplosiva;
    }

    public void setIdFuerzaExplosiva(Integer idFuerzaExplosiva) {
        this.idFuerzaExplosiva = idFuerzaExplosiva;
    }

    public String getImplemento() {
        return implemento;
    }

    public void setImplemento(String implemento) {
        this.implemento = implemento;
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
        hash += (idFuerzaExplosiva != null ? idFuerzaExplosiva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fuerzaexplosiva)) {
            return false;
        }
        Fuerzaexplosiva other = (Fuerzaexplosiva) object;
        if ((this.idFuerzaExplosiva == null && other.idFuerzaExplosiva != null) || (this.idFuerzaExplosiva != null && !this.idFuerzaExplosiva.equals(other.idFuerzaExplosiva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Fuerzaexplosiva[ idFuerzaExplosiva=" + idFuerzaExplosiva + " ]";
    }
    
}
