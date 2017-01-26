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
@Table(name = "evolucionrendimiento_has_prueba_rendimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EvolucionrendimientoHasPruebaRendimiento.findAll", query = "SELECT e FROM EvolucionrendimientoHasPruebaRendimiento e"),
    @NamedQuery(name = "EvolucionrendimientoHasPruebaRendimiento.findByEvolucionRendimientoidEvolucionRendimiento", query = "SELECT e FROM EvolucionrendimientoHasPruebaRendimiento e WHERE e.evolucionrendimientoHasPruebaRendimientoPK.evolucionRendimientoidEvolucionRendimiento = :evolucionRendimientoidEvolucionRendimiento"),
    @NamedQuery(name = "EvolucionrendimientoHasPruebaRendimiento.findByPruebaRendimientoId", query = "SELECT e FROM EvolucionrendimientoHasPruebaRendimiento e WHERE e.evolucionrendimientoHasPruebaRendimientoPK.pruebaRendimientoId = :pruebaRendimientoId")})
public class EvolucionrendimientoHasPruebaRendimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EvolucionrendimientoHasPruebaRendimientoPK evolucionrendimientoHasPruebaRendimientoPK;

    public EvolucionrendimientoHasPruebaRendimiento() {
    }

    public EvolucionrendimientoHasPruebaRendimiento(EvolucionrendimientoHasPruebaRendimientoPK evolucionrendimientoHasPruebaRendimientoPK) {
        this.evolucionrendimientoHasPruebaRendimientoPK = evolucionrendimientoHasPruebaRendimientoPK;
    }

    public EvolucionrendimientoHasPruebaRendimiento(int evolucionRendimientoidEvolucionRendimiento, int pruebaRendimientoId) {
        this.evolucionrendimientoHasPruebaRendimientoPK = new EvolucionrendimientoHasPruebaRendimientoPK(evolucionRendimientoidEvolucionRendimiento, pruebaRendimientoId);
    }

    public EvolucionrendimientoHasPruebaRendimientoPK getEvolucionrendimientoHasPruebaRendimientoPK() {
        return evolucionrendimientoHasPruebaRendimientoPK;
    }

    public void setEvolucionrendimientoHasPruebaRendimientoPK(EvolucionrendimientoHasPruebaRendimientoPK evolucionrendimientoHasPruebaRendimientoPK) {
        this.evolucionrendimientoHasPruebaRendimientoPK = evolucionrendimientoHasPruebaRendimientoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evolucionrendimientoHasPruebaRendimientoPK != null ? evolucionrendimientoHasPruebaRendimientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvolucionrendimientoHasPruebaRendimiento)) {
            return false;
        }
        EvolucionrendimientoHasPruebaRendimiento other = (EvolucionrendimientoHasPruebaRendimiento) object;
        if ((this.evolucionrendimientoHasPruebaRendimientoPK == null && other.evolucionrendimientoHasPruebaRendimientoPK != null) || (this.evolucionrendimientoHasPruebaRendimientoPK != null && !this.evolucionrendimientoHasPruebaRendimientoPK.equals(other.evolucionrendimientoHasPruebaRendimientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.EvolucionrendimientoHasPruebaRendimiento[ evolucionrendimientoHasPruebaRendimientoPK=" + evolucionrendimientoHasPruebaRendimientoPK + " ]";
    }
    
}
