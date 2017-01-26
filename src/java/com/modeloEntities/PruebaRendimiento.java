/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "prueba_rendimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PruebaRendimiento.findAll", query = "SELECT p FROM PruebaRendimiento p"),
    @NamedQuery(name = "PruebaRendimiento.findById", query = "SELECT p FROM PruebaRendimiento p WHERE p.id = :id"),
    @NamedQuery(name = "PruebaRendimiento.findByCantidadIZAP", query = "SELECT p FROM PruebaRendimiento p WHERE p.cantidadIZAP = :cantidadIZAP"),
    @NamedQuery(name = "PruebaRendimiento.findByCantidadDEAP", query = "SELECT p FROM PruebaRendimiento p WHERE p.cantidadDEAP = :cantidadDEAP"),
    @NamedQuery(name = "PruebaRendimiento.findByCantidadIZbandal", query = "SELECT p FROM PruebaRendimiento p WHERE p.cantidadIZbandal = :cantidadIZbandal"),
    @NamedQuery(name = "PruebaRendimiento.findByCantidadDEbandal", query = "SELECT p FROM PruebaRendimiento p WHERE p.cantidadDEbandal = :cantidadDEbandal"),
    @NamedQuery(name = "PruebaRendimiento.findByCantidadDEdoblebandal", query = "SELECT p FROM PruebaRendimiento p WHERE p.cantidadDEdoblebandal = :cantidadDEdoblebandal"),
    @NamedQuery(name = "PruebaRendimiento.findByCantidadDespNerio", query = "SELECT p FROM PruebaRendimiento p WHERE p.cantidadDespNerio = :cantidadDespNerio"),
    @NamedQuery(name = "PruebaRendimiento.findByCantidadDesFuryo", query = "SELECT p FROM PruebaRendimiento p WHERE p.cantidadDesFuryo = :cantidadDesFuryo"),
    @NamedQuery(name = "PruebaRendimiento.findByCantidadDesDolio", query = "SELECT p FROM PruebaRendimiento p WHERE p.cantidadDesDolio = :cantidadDesDolio"),
    @NamedQuery(name = "PruebaRendimiento.findByPuntaje", query = "SELECT p FROM PruebaRendimiento p WHERE p.puntaje = :puntaje"),
    @NamedQuery(name = "PruebaRendimiento.findByFecha", query = "SELECT p FROM PruebaRendimiento p WHERE p.fecha = :fecha")})
public class PruebaRendimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "cantidadIZAP")
    private Integer cantidadIZAP;
    @Column(name = "cantidadDEAP")
    private Integer cantidadDEAP;
    @Column(name = "cantidadIZ_bandal")
    private Integer cantidadIZbandal;
    @Column(name = "cantidadDE_bandal")
    private Integer cantidadDEbandal;
    @Column(name = "cantidadDE_doble_bandal")
    private Integer cantidadDEdoblebandal;
    @Column(name = "cantidad_desp_nerio")
    private Integer cantidadDespNerio;
    @Column(name = "cantidad_des_furyo")
    private Integer cantidadDesFuryo;
    @Column(name = "cantidad_des_dolio")
    private Integer cantidadDesDolio;
    @Column(name = "puntaje")
    private Integer puntaje;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public PruebaRendimiento() {
    }

    public PruebaRendimiento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadIZAP() {
        return cantidadIZAP;
    }

    public void setCantidadIZAP(Integer cantidadIZAP) {
        this.cantidadIZAP = cantidadIZAP;
    }

    public Integer getCantidadDEAP() {
        return cantidadDEAP;
    }

    public void setCantidadDEAP(Integer cantidadDEAP) {
        this.cantidadDEAP = cantidadDEAP;
    }

    public Integer getCantidadIZbandal() {
        return cantidadIZbandal;
    }

    public void setCantidadIZbandal(Integer cantidadIZbandal) {
        this.cantidadIZbandal = cantidadIZbandal;
    }

    public Integer getCantidadDEbandal() {
        return cantidadDEbandal;
    }

    public void setCantidadDEbandal(Integer cantidadDEbandal) {
        this.cantidadDEbandal = cantidadDEbandal;
    }

    public Integer getCantidadDEdoblebandal() {
        return cantidadDEdoblebandal;
    }

    public void setCantidadDEdoblebandal(Integer cantidadDEdoblebandal) {
        this.cantidadDEdoblebandal = cantidadDEdoblebandal;
    }

    public Integer getCantidadDespNerio() {
        return cantidadDespNerio;
    }

    public void setCantidadDespNerio(Integer cantidadDespNerio) {
        this.cantidadDespNerio = cantidadDespNerio;
    }

    public Integer getCantidadDesFuryo() {
        return cantidadDesFuryo;
    }

    public void setCantidadDesFuryo(Integer cantidadDesFuryo) {
        this.cantidadDesFuryo = cantidadDesFuryo;
    }

    public Integer getCantidadDesDolio() {
        return cantidadDesDolio;
    }

    public void setCantidadDesDolio(Integer cantidadDesDolio) {
        this.cantidadDesDolio = cantidadDesDolio;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PruebaRendimiento)) {
            return false;
        }
        PruebaRendimiento other = (PruebaRendimiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.PruebaRendimiento[ id=" + id + " ]";
    }
    
}
