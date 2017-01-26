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
@Table(name = "evolucionrendimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evolucionrendimiento.findAll", query = "SELECT e FROM Evolucionrendimiento e"),
    @NamedQuery(name = "Evolucionrendimiento.findByIdEvolucionRendimiento", query = "SELECT e FROM Evolucionrendimiento e WHERE e.idEvolucionRendimiento = :idEvolucionRendimiento"),
    @NamedQuery(name = "Evolucionrendimiento.findByEvolucionIzAp", query = "SELECT e FROM Evolucionrendimiento e WHERE e.evolucionIzAp = :evolucionIzAp"),
    @NamedQuery(name = "Evolucionrendimiento.findByEvolucionDeAp", query = "SELECT e FROM Evolucionrendimiento e WHERE e.evolucionDeAp = :evolucionDeAp"),
    @NamedQuery(name = "Evolucionrendimiento.findByEvolucionDeBandal", query = "SELECT e FROM Evolucionrendimiento e WHERE e.evolucionDeBandal = :evolucionDeBandal"),
    @NamedQuery(name = "Evolucionrendimiento.findByEvolucionIzBandal", query = "SELECT e FROM Evolucionrendimiento e WHERE e.evolucionIzBandal = :evolucionIzBandal"),
    @NamedQuery(name = "Evolucionrendimiento.findByEvolucionDobleBandal", query = "SELECT e FROM Evolucionrendimiento e WHERE e.evolucionDobleBandal = :evolucionDobleBandal"),
    @NamedQuery(name = "Evolucionrendimiento.findByEvolucionDesplasamientoNerio", query = "SELECT e FROM Evolucionrendimiento e WHERE e.evolucionDesplasamientoNerio = :evolucionDesplasamientoNerio"),
    @NamedQuery(name = "Evolucionrendimiento.findByEvolucionDesplasamientoFuryo", query = "SELECT e FROM Evolucionrendimiento e WHERE e.evolucionDesplasamientoFuryo = :evolucionDesplasamientoFuryo"),
    @NamedQuery(name = "Evolucionrendimiento.findByEvolucionDesplasamientoDolyo", query = "SELECT e FROM Evolucionrendimiento e WHERE e.evolucionDesplasamientoDolyo = :evolucionDesplasamientoDolyo"),
    @NamedQuery(name = "Evolucionrendimiento.findByPuntajeEvolucion", query = "SELECT e FROM Evolucionrendimiento e WHERE e.puntajeEvolucion = :puntajeEvolucion"),
    @NamedQuery(name = "Evolucionrendimiento.findByFecha", query = "SELECT e FROM Evolucionrendimiento e WHERE e.fecha = :fecha")})
public class Evolucionrendimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEvolucionRendimiento")
    private Integer idEvolucionRendimiento;
    @Column(name = "EvolucionIzAp")
    private Integer evolucionIzAp;
    @Column(name = "EvolucionDeAp")
    private Integer evolucionDeAp;
    @Column(name = "EvolucionDeBandal")
    private Integer evolucionDeBandal;
    @Column(name = "EvolucionIzBandal")
    private Integer evolucionIzBandal;
    @Column(name = "EvolucionDobleBandal")
    private Integer evolucionDobleBandal;
    @Column(name = "EvolucionDesplasamientoNerio")
    private Integer evolucionDesplasamientoNerio;
    @Column(name = "EvolucionDesplasamientoFuryo")
    private Integer evolucionDesplasamientoFuryo;
    @Column(name = "EvolucionDesplasamientoDolyo")
    private Integer evolucionDesplasamientoDolyo;
    @Column(name = "PuntajeEvolucion")
    private Integer puntajeEvolucion;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Evolucionrendimiento() {
    }

    public Evolucionrendimiento(Integer idEvolucionRendimiento) {
        this.idEvolucionRendimiento = idEvolucionRendimiento;
    }

    public Integer getIdEvolucionRendimiento() {
        return idEvolucionRendimiento;
    }

    public void setIdEvolucionRendimiento(Integer idEvolucionRendimiento) {
        this.idEvolucionRendimiento = idEvolucionRendimiento;
    }

    public Integer getEvolucionIzAp() {
        return evolucionIzAp;
    }

    public void setEvolucionIzAp(Integer evolucionIzAp) {
        this.evolucionIzAp = evolucionIzAp;
    }

    public Integer getEvolucionDeAp() {
        return evolucionDeAp;
    }

    public void setEvolucionDeAp(Integer evolucionDeAp) {
        this.evolucionDeAp = evolucionDeAp;
    }

    public Integer getEvolucionDeBandal() {
        return evolucionDeBandal;
    }

    public void setEvolucionDeBandal(Integer evolucionDeBandal) {
        this.evolucionDeBandal = evolucionDeBandal;
    }

    public Integer getEvolucionIzBandal() {
        return evolucionIzBandal;
    }

    public void setEvolucionIzBandal(Integer evolucionIzBandal) {
        this.evolucionIzBandal = evolucionIzBandal;
    }

    public Integer getEvolucionDobleBandal() {
        return evolucionDobleBandal;
    }

    public void setEvolucionDobleBandal(Integer evolucionDobleBandal) {
        this.evolucionDobleBandal = evolucionDobleBandal;
    }

    public Integer getEvolucionDesplasamientoNerio() {
        return evolucionDesplasamientoNerio;
    }

    public void setEvolucionDesplasamientoNerio(Integer evolucionDesplasamientoNerio) {
        this.evolucionDesplasamientoNerio = evolucionDesplasamientoNerio;
    }

    public Integer getEvolucionDesplasamientoFuryo() {
        return evolucionDesplasamientoFuryo;
    }

    public void setEvolucionDesplasamientoFuryo(Integer evolucionDesplasamientoFuryo) {
        this.evolucionDesplasamientoFuryo = evolucionDesplasamientoFuryo;
    }

    public Integer getEvolucionDesplasamientoDolyo() {
        return evolucionDesplasamientoDolyo;
    }

    public void setEvolucionDesplasamientoDolyo(Integer evolucionDesplasamientoDolyo) {
        this.evolucionDesplasamientoDolyo = evolucionDesplasamientoDolyo;
    }

    public Integer getPuntajeEvolucion() {
        return puntajeEvolucion;
    }

    public void setPuntajeEvolucion(Integer puntajeEvolucion) {
        this.puntajeEvolucion = puntajeEvolucion;
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
        hash += (idEvolucionRendimiento != null ? idEvolucionRendimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evolucionrendimiento)) {
            return false;
        }
        Evolucionrendimiento other = (Evolucionrendimiento) object;
        if ((this.idEvolucionRendimiento == null && other.idEvolucionRendimiento != null) || (this.idEvolucionRendimiento != null && !this.idEvolucionRendimiento.equals(other.idEvolucionRendimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Evolucionrendimiento[ idEvolucionRendimiento=" + idEvolucionRendimiento + " ]";
    }
    
}
