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
public class RendimientoHasPruebaRendimientoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "rendimiento_idrendimiento")
    private int rendimientoIdrendimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prueba_rendimiento_id")
    private int pruebaRendimientoId;

    public RendimientoHasPruebaRendimientoPK() {
    }

    public RendimientoHasPruebaRendimientoPK(int rendimientoIdrendimiento, int pruebaRendimientoId) {
        this.rendimientoIdrendimiento = rendimientoIdrendimiento;
        this.pruebaRendimientoId = pruebaRendimientoId;
    }

    public int getRendimientoIdrendimiento() {
        return rendimientoIdrendimiento;
    }

    public void setRendimientoIdrendimiento(int rendimientoIdrendimiento) {
        this.rendimientoIdrendimiento = rendimientoIdrendimiento;
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
        hash += (int) rendimientoIdrendimiento;
        hash += (int) pruebaRendimientoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RendimientoHasPruebaRendimientoPK)) {
            return false;
        }
        RendimientoHasPruebaRendimientoPK other = (RendimientoHasPruebaRendimientoPK) object;
        if (this.rendimientoIdrendimiento != other.rendimientoIdrendimiento) {
            return false;
        }
        if (this.pruebaRendimientoId != other.pruebaRendimientoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.RendimientoHasPruebaRendimientoPK[ rendimientoIdrendimiento=" + rendimientoIdrendimiento + ", pruebaRendimientoId=" + pruebaRendimientoId + " ]";
    }
    
}
