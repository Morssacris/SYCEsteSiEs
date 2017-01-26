/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "rendimiento_has_prueba_rendimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RendimientoHasPruebaRendimiento.findAll", query = "SELECT r FROM RendimientoHasPruebaRendimiento r"),
    @NamedQuery(name = "RendimientoHasPruebaRendimiento.findByRendimientoIdrendimiento", query = "SELECT r FROM RendimientoHasPruebaRendimiento r WHERE r.rendimientoHasPruebaRendimientoPK.rendimientoIdrendimiento = :rendimientoIdrendimiento"),
    @NamedQuery(name = "RendimientoHasPruebaRendimiento.findByPruebaRendimientoId", query = "SELECT r FROM RendimientoHasPruebaRendimiento r WHERE r.rendimientoHasPruebaRendimientoPK.pruebaRendimientoId = :pruebaRendimientoId")})
public class RendimientoHasPruebaRendimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RendimientoHasPruebaRendimientoPK rendimientoHasPruebaRendimientoPK;

    public RendimientoHasPruebaRendimiento() {
    }

    public RendimientoHasPruebaRendimiento(RendimientoHasPruebaRendimientoPK rendimientoHasPruebaRendimientoPK) {
        this.rendimientoHasPruebaRendimientoPK = rendimientoHasPruebaRendimientoPK;
    }

    public RendimientoHasPruebaRendimiento(int rendimientoIdrendimiento, int pruebaRendimientoId) {
        this.rendimientoHasPruebaRendimientoPK = new RendimientoHasPruebaRendimientoPK(rendimientoIdrendimiento, pruebaRendimientoId);
    }

    public RendimientoHasPruebaRendimientoPK getRendimientoHasPruebaRendimientoPK() {
        return rendimientoHasPruebaRendimientoPK;
    }

    public void setRendimientoHasPruebaRendimientoPK(RendimientoHasPruebaRendimientoPK rendimientoHasPruebaRendimientoPK) {
        this.rendimientoHasPruebaRendimientoPK = rendimientoHasPruebaRendimientoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rendimientoHasPruebaRendimientoPK != null ? rendimientoHasPruebaRendimientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RendimientoHasPruebaRendimiento)) {
            return false;
        }
        RendimientoHasPruebaRendimiento other = (RendimientoHasPruebaRendimiento) object;
        if ((this.rendimientoHasPruebaRendimientoPK == null && other.rendimientoHasPruebaRendimientoPK != null) || (this.rendimientoHasPruebaRendimientoPK != null && !this.rendimientoHasPruebaRendimientoPK.equals(other.rendimientoHasPruebaRendimientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.RendimientoHasPruebaRendimiento[ rendimientoHasPruebaRendimientoPK=" + rendimientoHasPruebaRendimientoPK + " ]";
    }
    
}
