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
@Table(name = "evolucionfisico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evolucionfisico.findAll", query = "SELECT e FROM Evolucionfisico e"),
    @NamedQuery(name = "Evolucionfisico.findByIdEvolucionFisico", query = "SELECT e FROM Evolucionfisico e WHERE e.idEvolucionFisico = :idEvolucionFisico"),
    @NamedQuery(name = "Evolucionfisico.findByEvolucionTiempoMetros", query = "SELECT e FROM Evolucionfisico e WHERE e.evolucionTiempoMetros = :evolucionTiempoMetros"),
    @NamedQuery(name = "Evolucionfisico.findByEvolucionCantidadAbdominales", query = "SELECT e FROM Evolucionfisico e WHERE e.evolucionCantidadAbdominales = :evolucionCantidadAbdominales"),
    @NamedQuery(name = "Evolucionfisico.findByEvolucionCantidadFlexiones", query = "SELECT e FROM Evolucionfisico e WHERE e.evolucionCantidadFlexiones = :evolucionCantidadFlexiones"),
    @NamedQuery(name = "Evolucionfisico.findByEvolucionCantidadBarras", query = "SELECT e FROM Evolucionfisico e WHERE e.evolucionCantidadBarras = :evolucionCantidadBarras"),
    @NamedQuery(name = "Evolucionfisico.findByEvolucionCantidadSentadillas", query = "SELECT e FROM Evolucionfisico e WHERE e.evolucionCantidadSentadillas = :evolucionCantidadSentadillas"),
    @NamedQuery(name = "Evolucionfisico.findByEvolucionAlturaSalto", query = "SELECT e FROM Evolucionfisico e WHERE e.evolucionAlturaSalto = :evolucionAlturaSalto"),
    @NamedQuery(name = "Evolucionfisico.findByEvolucionPuntaje", query = "SELECT e FROM Evolucionfisico e WHERE e.evolucionPuntaje = :evolucionPuntaje"),
    @NamedQuery(name = "Evolucionfisico.findByFecha", query = "SELECT e FROM Evolucionfisico e WHERE e.fecha = :fecha")})
public class Evolucionfisico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEvolucionFisico")
    private Integer idEvolucionFisico;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EvolucionTiempoMetros")
    private Double evolucionTiempoMetros;
    @Column(name = "EvolucionCantidadAbdominales")
    private Integer evolucionCantidadAbdominales;
    @Column(name = "EvolucionCantidadFlexiones")
    private Integer evolucionCantidadFlexiones;
    @Column(name = "EvolucionCantidadBarras")
    private Integer evolucionCantidadBarras;
    @Column(name = "EvolucionCantidadSentadillas")
    private Integer evolucionCantidadSentadillas;
    @Column(name = "EvolucionAlturaSalto")
    private Integer evolucionAlturaSalto;
    @Column(name = "EvolucionPuntaje")
    private Integer evolucionPuntaje;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Evolucionfisico() {
    }

    public Evolucionfisico(Integer idEvolucionFisico) {
        this.idEvolucionFisico = idEvolucionFisico;
    }

    public Integer getIdEvolucionFisico() {
        return idEvolucionFisico;
    }

    public void setIdEvolucionFisico(Integer idEvolucionFisico) {
        this.idEvolucionFisico = idEvolucionFisico;
    }

    public Double getEvolucionTiempoMetros() {
        return evolucionTiempoMetros;
    }

    public void setEvolucionTiempoMetros(Double evolucionTiempoMetros) {
        this.evolucionTiempoMetros = evolucionTiempoMetros;
    }

    public Integer getEvolucionCantidadAbdominales() {
        return evolucionCantidadAbdominales;
    }

    public void setEvolucionCantidadAbdominales(Integer evolucionCantidadAbdominales) {
        this.evolucionCantidadAbdominales = evolucionCantidadAbdominales;
    }

    public Integer getEvolucionCantidadFlexiones() {
        return evolucionCantidadFlexiones;
    }

    public void setEvolucionCantidadFlexiones(Integer evolucionCantidadFlexiones) {
        this.evolucionCantidadFlexiones = evolucionCantidadFlexiones;
    }

    public Integer getEvolucionCantidadBarras() {
        return evolucionCantidadBarras;
    }

    public void setEvolucionCantidadBarras(Integer evolucionCantidadBarras) {
        this.evolucionCantidadBarras = evolucionCantidadBarras;
    }

    public Integer getEvolucionCantidadSentadillas() {
        return evolucionCantidadSentadillas;
    }

    public void setEvolucionCantidadSentadillas(Integer evolucionCantidadSentadillas) {
        this.evolucionCantidadSentadillas = evolucionCantidadSentadillas;
    }

    public Integer getEvolucionAlturaSalto() {
        return evolucionAlturaSalto;
    }

    public void setEvolucionAlturaSalto(Integer evolucionAlturaSalto) {
        this.evolucionAlturaSalto = evolucionAlturaSalto;
    }

    public Integer getEvolucionPuntaje() {
        return evolucionPuntaje;
    }

    public void setEvolucionPuntaje(Integer evolucionPuntaje) {
        this.evolucionPuntaje = evolucionPuntaje;
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
        hash += (idEvolucionFisico != null ? idEvolucionFisico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evolucionfisico)) {
            return false;
        }
        Evolucionfisico other = (Evolucionfisico) object;
        if ((this.idEvolucionFisico == null && other.idEvolucionFisico != null) || (this.idEvolucionFisico != null && !this.idEvolucionFisico.equals(other.idEvolucionFisico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Evolucionfisico[ idEvolucionFisico=" + idEvolucionFisico + " ]";
    }
    
}
