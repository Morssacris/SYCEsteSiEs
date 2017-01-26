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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "entrenamientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrenamientos.findAll", query = "SELECT e FROM Entrenamientos e"),
    @NamedQuery(name = "Entrenamientos.findByIdEntrenamientos", query = "SELECT e FROM Entrenamientos e WHERE e.idEntrenamientos = :idEntrenamientos"),
    @NamedQuery(name = "Entrenamientos.findByFinalidad", query = "SELECT e FROM Entrenamientos e WHERE e.finalidad = :finalidad")})
public class Entrenamientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEntrenamientos")
    private Integer idEntrenamientos;
    @Size(max = 45)
    @Column(name = "Finalidad")
    private String finalidad;
    @JoinTable(name = "entrenamientos_has_fuerza", joinColumns = {
        @JoinColumn(name = "Entrenamientos_idEntrenamientos", referencedColumnName = "idEntrenamientos")}, inverseJoinColumns = {
        @JoinColumn(name = "Fuerza_idFuerza", referencedColumnName = "idFuerza")})
    @ManyToMany
    private List<Fuerza> fuerzaList;
    @ManyToMany(mappedBy = "entrenamientosList")
    private List<Deportista> deportistaList;
    @JoinTable(name = "entrenamientos_has_velocidad", joinColumns = {
        @JoinColumn(name = "Entrenamientos_idEntrenamientos", referencedColumnName = "idEntrenamientos")}, inverseJoinColumns = {
        @JoinColumn(name = "Velocidad_idVelocidad", referencedColumnName = "idVelocidad")})
    @ManyToMany
    private List<Velocidad> velocidadList;
    @JoinTable(name = "entrenamientos_has_resistencia", joinColumns = {
        @JoinColumn(name = "Entrenamientos_idEntrenamientos", referencedColumnName = "idEntrenamientos")}, inverseJoinColumns = {
        @JoinColumn(name = "Resistencia_idResistencia", referencedColumnName = "idResistencia")})
    @ManyToMany
    private List<Resistencia> resistenciaList;

    public Entrenamientos() {
    }

    public Entrenamientos(Integer idEntrenamientos) {
        this.idEntrenamientos = idEntrenamientos;
    }

    public Integer getIdEntrenamientos() {
        return idEntrenamientos;
    }

    public void setIdEntrenamientos(Integer idEntrenamientos) {
        this.idEntrenamientos = idEntrenamientos;
    }

    public String getFinalidad() {
        return finalidad;
    }

    public void setFinalidad(String finalidad) {
        this.finalidad = finalidad;
    }

    @XmlTransient
    public List<Fuerza> getFuerzaList() {
        return fuerzaList;
    }

    public void setFuerzaList(List<Fuerza> fuerzaList) {
        this.fuerzaList = fuerzaList;
    }

    @XmlTransient
    public List<Deportista> getDeportistaList() {
        return deportistaList;
    }

    public void setDeportistaList(List<Deportista> deportistaList) {
        this.deportistaList = deportistaList;
    }

    @XmlTransient
    public List<Velocidad> getVelocidadList() {
        return velocidadList;
    }

    public void setVelocidadList(List<Velocidad> velocidadList) {
        this.velocidadList = velocidadList;
    }

    @XmlTransient
    public List<Resistencia> getResistenciaList() {
        return resistenciaList;
    }

    public void setResistenciaList(List<Resistencia> resistenciaList) {
        this.resistenciaList = resistenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntrenamientos != null ? idEntrenamientos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrenamientos)) {
            return false;
        }
        Entrenamientos other = (Entrenamientos) object;
        if ((this.idEntrenamientos == null && other.idEntrenamientos != null) || (this.idEntrenamientos != null && !this.idEntrenamientos.equals(other.idEntrenamientos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Entrenamientos[ idEntrenamientos=" + idEntrenamientos + " ]";
    }
    
}
