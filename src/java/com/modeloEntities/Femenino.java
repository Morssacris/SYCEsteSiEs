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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "femenino")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Femenino.findAll", query = "SELECT f FROM Femenino f"),
    @NamedQuery(name = "Femenino.findByIdMasculinoEstadoBueno", query = "SELECT f FROM Femenino f WHERE f.idMasculinoEstadoBueno = :idMasculinoEstadoBueno"),
    @NamedQuery(name = "Femenino.findByPrueba", query = "SELECT f FROM Femenino f WHERE f.prueba = :prueba"),
    @NamedQuery(name = "Femenino.findByPuntajeMuyBueno", query = "SELECT f FROM Femenino f WHERE f.puntajeMuyBueno = :puntajeMuyBueno"),
    @NamedQuery(name = "Femenino.findByPuntajeBueno", query = "SELECT f FROM Femenino f WHERE f.puntajeBueno = :puntajeBueno"),
    @NamedQuery(name = "Femenino.findByPuntajeRegular", query = "SELECT f FROM Femenino f WHERE f.puntajeRegular = :puntajeRegular"),
    @NamedQuery(name = "Femenino.findByDesdeEdad", query = "SELECT f FROM Femenino f WHERE f.desdeEdad = :desdeEdad")})
public class Femenino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMasculinoEstadoBueno")
    private Integer idMasculinoEstadoBueno;
    @Column(name = "prueba")
    private Integer prueba;
    @Column(name = "puntajeMuyBueno")
    private Integer puntajeMuyBueno;
    @Column(name = "puntajeBueno")
    private Integer puntajeBueno;
    @Column(name = "PuntajeRegular")
    private Integer puntajeRegular;
    @Column(name = "DesdeEdad")
    private Integer desdeEdad;

    public Femenino() {
    }

    public Femenino(Integer idMasculinoEstadoBueno) {
        this.idMasculinoEstadoBueno = idMasculinoEstadoBueno;
    }

    public Integer getIdMasculinoEstadoBueno() {
        return idMasculinoEstadoBueno;
    }

    public void setIdMasculinoEstadoBueno(Integer idMasculinoEstadoBueno) {
        this.idMasculinoEstadoBueno = idMasculinoEstadoBueno;
    }

    public Integer getPrueba() {
        return prueba;
    }

    public void setPrueba(Integer prueba) {
        this.prueba = prueba;
    }

    public Integer getPuntajeMuyBueno() {
        return puntajeMuyBueno;
    }

    public void setPuntajeMuyBueno(Integer puntajeMuyBueno) {
        this.puntajeMuyBueno = puntajeMuyBueno;
    }

    public Integer getPuntajeBueno() {
        return puntajeBueno;
    }

    public void setPuntajeBueno(Integer puntajeBueno) {
        this.puntajeBueno = puntajeBueno;
    }

    public Integer getPuntajeRegular() {
        return puntajeRegular;
    }

    public void setPuntajeRegular(Integer puntajeRegular) {
        this.puntajeRegular = puntajeRegular;
    }

    public Integer getDesdeEdad() {
        return desdeEdad;
    }

    public void setDesdeEdad(Integer desdeEdad) {
        this.desdeEdad = desdeEdad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMasculinoEstadoBueno != null ? idMasculinoEstadoBueno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Femenino)) {
            return false;
        }
        Femenino other = (Femenino) object;
        if ((this.idMasculinoEstadoBueno == null && other.idMasculinoEstadoBueno != null) || (this.idMasculinoEstadoBueno != null && !this.idMasculinoEstadoBueno.equals(other.idMasculinoEstadoBueno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Femenino[ idMasculinoEstadoBueno=" + idMasculinoEstadoBueno + " ]";
    }
    
}
