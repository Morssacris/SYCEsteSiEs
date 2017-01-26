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
@Table(name = "fuerzaresistencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fuerzaresistencia.findAll", query = "SELECT f FROM Fuerzaresistencia f"),
    @NamedQuery(name = "Fuerzaresistencia.findByIdFuerzaResistencia", query = "SELECT f FROM Fuerzaresistencia f WHERE f.idFuerzaResistencia = :idFuerzaResistencia"),
    @NamedQuery(name = "Fuerzaresistencia.findByCircuito", query = "SELECT f FROM Fuerzaresistencia f WHERE f.circuito = :circuito"),
    @NamedQuery(name = "Fuerzaresistencia.findByTecnica", query = "SELECT f FROM Fuerzaresistencia f WHERE f.tecnica = :tecnica"),
    @NamedQuery(name = "Fuerzaresistencia.findByFuerzaidFuerza", query = "SELECT f FROM Fuerzaresistencia f WHERE f.fuerzaidFuerza = :fuerzaidFuerza")})
public class Fuerzaresistencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFuerzaResistencia")
    private Integer idFuerzaResistencia;
    @Size(max = 45)
    @Column(name = "Circuito")
    private String circuito;
    @Size(max = 45)
    @Column(name = "Tecnica")
    private String tecnica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fuerza_idFuerza")
    private int fuerzaidFuerza;

    public Fuerzaresistencia() {
    }

    public Fuerzaresistencia(Integer idFuerzaResistencia) {
        this.idFuerzaResistencia = idFuerzaResistencia;
    }

    public Fuerzaresistencia(Integer idFuerzaResistencia, int fuerzaidFuerza) {
        this.idFuerzaResistencia = idFuerzaResistencia;
        this.fuerzaidFuerza = fuerzaidFuerza;
    }

    public Integer getIdFuerzaResistencia() {
        return idFuerzaResistencia;
    }

    public void setIdFuerzaResistencia(Integer idFuerzaResistencia) {
        this.idFuerzaResistencia = idFuerzaResistencia;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
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
        hash += (idFuerzaResistencia != null ? idFuerzaResistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fuerzaresistencia)) {
            return false;
        }
        Fuerzaresistencia other = (Fuerzaresistencia) object;
        if ((this.idFuerzaResistencia == null && other.idFuerzaResistencia != null) || (this.idFuerzaResistencia != null && !this.idFuerzaResistencia.equals(other.idFuerzaResistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Fuerzaresistencia[ idFuerzaResistencia=" + idFuerzaResistencia + " ]";
    }
    
}
