/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "velocidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Velocidad.findAll", query = "SELECT v FROM Velocidad v"),
    @NamedQuery(name = "Velocidad.findByIdVelocidad", query = "SELECT v FROM Velocidad v WHERE v.idVelocidad = :idVelocidad"),
    @NamedQuery(name = "Velocidad.findByTipo", query = "SELECT v FROM Velocidad v WHERE v.tipo = :tipo"),
    @NamedQuery(name = "Velocidad.findByEjecicioVelocidadidEjecicioVelocidad", query = "SELECT v FROM Velocidad v WHERE v.ejecicioVelocidadidEjecicioVelocidad = :ejecicioVelocidadidEjecicioVelocidad")})
public class Velocidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVelocidad")
    private Integer idVelocidad;
    @Size(max = 45)
    @Column(name = "Tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EjecicioVelocidad_idEjecicioVelocidad")
    private int ejecicioVelocidadidEjecicioVelocidad;
    @ManyToMany(mappedBy = "velocidadList")
    private List<Entrenamientos> entrenamientosList;

    public Velocidad() {
    }

    public Velocidad(Integer idVelocidad) {
        this.idVelocidad = idVelocidad;
    }

    public Velocidad(Integer idVelocidad, int ejecicioVelocidadidEjecicioVelocidad) {
        this.idVelocidad = idVelocidad;
        this.ejecicioVelocidadidEjecicioVelocidad = ejecicioVelocidadidEjecicioVelocidad;
    }

    public Integer getIdVelocidad() {
        return idVelocidad;
    }

    public void setIdVelocidad(Integer idVelocidad) {
        this.idVelocidad = idVelocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEjecicioVelocidadidEjecicioVelocidad() {
        return ejecicioVelocidadidEjecicioVelocidad;
    }

    public void setEjecicioVelocidadidEjecicioVelocidad(int ejecicioVelocidadidEjecicioVelocidad) {
        this.ejecicioVelocidadidEjecicioVelocidad = ejecicioVelocidadidEjecicioVelocidad;
    }

    @XmlTransient
    public List<Entrenamientos> getEntrenamientosList() {
        return entrenamientosList;
    }

    public void setEntrenamientosList(List<Entrenamientos> entrenamientosList) {
        this.entrenamientosList = entrenamientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVelocidad != null ? idVelocidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Velocidad)) {
            return false;
        }
        Velocidad other = (Velocidad) object;
        if ((this.idVelocidad == null && other.idVelocidad != null) || (this.idVelocidad != null && !this.idVelocidad.equals(other.idVelocidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Velocidad[ idVelocidad=" + idVelocidad + " ]";
    }
    
}
