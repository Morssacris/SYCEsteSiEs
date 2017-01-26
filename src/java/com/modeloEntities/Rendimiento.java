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
@Table(name = "rendimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rendimiento.findAll", query = "SELECT r FROM Rendimiento r"),
    @NamedQuery(name = "Rendimiento.findByIdrendimiento", query = "SELECT r FROM Rendimiento r WHERE r.idrendimiento = :idrendimiento"),
    @NamedQuery(name = "Rendimiento.findByPuntaje", query = "SELECT r FROM Rendimiento r WHERE r.puntaje = :puntaje")})
public class Rendimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrendimiento")
    private Integer idrendimiento;
    @Column(name = "Puntaje")
    private Integer puntaje;

    public Rendimiento() {
    }

    public Rendimiento(Integer idrendimiento) {
        this.idrendimiento = idrendimiento;
    }

    public Integer getIdrendimiento() {
        return idrendimiento;
    }

    public void setIdrendimiento(Integer idrendimiento) {
        this.idrendimiento = idrendimiento;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrendimiento != null ? idrendimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rendimiento)) {
            return false;
        }
        Rendimiento other = (Rendimiento) object;
        if ((this.idrendimiento == null && other.idrendimiento != null) || (this.idrendimiento != null && !this.idrendimiento.equals(other.idrendimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Rendimiento[ idrendimiento=" + idrendimiento + " ]";
    }
    
}
