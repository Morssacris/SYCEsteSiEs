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
@Table(name = "ejeciciovelocidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejeciciovelocidad.findAll", query = "SELECT e FROM Ejeciciovelocidad e"),
    @NamedQuery(name = "Ejeciciovelocidad.findByIdEjecicioVelocidad", query = "SELECT e FROM Ejeciciovelocidad e WHERE e.idEjecicioVelocidad = :idEjecicioVelocidad"),
    @NamedQuery(name = "Ejeciciovelocidad.findByTecnica", query = "SELECT e FROM Ejeciciovelocidad e WHERE e.tecnica = :tecnica")})
public class Ejeciciovelocidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEjecicioVelocidad")
    private Integer idEjecicioVelocidad;
    @Size(max = 20)
    @Column(name = "Tecnica")
    private String tecnica;

    public Ejeciciovelocidad() {
    }

    public Ejeciciovelocidad(Integer idEjecicioVelocidad) {
        this.idEjecicioVelocidad = idEjecicioVelocidad;
    }

    public Integer getIdEjecicioVelocidad() {
        return idEjecicioVelocidad;
    }

    public void setIdEjecicioVelocidad(Integer idEjecicioVelocidad) {
        this.idEjecicioVelocidad = idEjecicioVelocidad;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEjecicioVelocidad != null ? idEjecicioVelocidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejeciciovelocidad)) {
            return false;
        }
        Ejeciciovelocidad other = (Ejeciciovelocidad) object;
        if ((this.idEjecicioVelocidad == null && other.idEjecicioVelocidad != null) || (this.idEjecicioVelocidad != null && !this.idEjecicioVelocidad.equals(other.idEjecicioVelocidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Ejeciciovelocidad[ idEjecicioVelocidad=" + idEjecicioVelocidad + " ]";
    }
    
}
