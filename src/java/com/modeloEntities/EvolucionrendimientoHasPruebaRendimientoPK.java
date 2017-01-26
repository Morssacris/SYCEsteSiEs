/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author WJS
 */
@Embeddable
public class EvolucionrendimientoHasPruebaRendimientoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "EvolucionRendimiento_idEvolucionRendimiento")
    private int evolucionRendimientoidEvolucionRendimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prueba_rendimiento_id")
    private int pruebaRendimientoId;

    public EvolucionrendimientoHasPruebaRendimientoPK() {
    }

    public EvolucionrendimientoHasPruebaRendimientoPK(int evolucionRendimientoidEvolucionRendimiento, int pruebaRendimientoId) {
        this.evolucionRendimientoidEvolucionRendimiento = evolucionRendimientoidEvolucionRendimiento;
        this.pruebaRendimientoId = pruebaRendimientoId;
    }

    public int getEvolucionRendimientoidEvolucionRendimiento() {
        return evolucionRendimientoidEvolucionRendimiento;
    }

    public void setEvolucionRendimientoidEvolucionRendimiento(int evolucionRendimientoidEvolucionRendimiento) {
        this.evolucionRendimientoidEvolucionRendimiento = evolucionRendimientoidEvolucionRendimiento;
    }

    public int getPruebaRendimientoId() {
        return pruebaRendimientoId;
    }

    public void setPruebaRendimientoId(int pruebaRendimientoId) {
        this.pruebaRendimientoId = pruebaRendimientoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) evolucionRendimientoidEvolucionRendimiento;
        hash += (int) pruebaRendimientoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvolucionrendimientoHasPruebaRendimientoPK)) {
            return false;
        }
        EvolucionrendimientoHasPruebaRendimientoPK other = (EvolucionrendimientoHasPruebaRendimientoPK) object;
        if (this.evolucionRendimientoidEvolucionRendimiento != other.evolucionRendimientoidEvolucionRendimiento) {
            return false;
        }
        if (this.pruebaRendimientoId != other.pruebaRendimientoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.EvolucionrendimientoHasPruebaRendimientoPK[ evolucionRendimientoidEvolucionRendimiento=" + evolucionRendimientoidEvolucionRendimiento + ", pruebaRendimientoId=" + pruebaRendimientoId + " ]";
    }
    
}
