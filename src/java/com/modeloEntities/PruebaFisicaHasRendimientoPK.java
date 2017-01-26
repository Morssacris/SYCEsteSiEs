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
public class PruebaFisicaHasRendimientoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "prueba_fisica_idprueba_fisica")
    private int pruebaFisicaIdpruebaFisica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rendimiento_idrendimiento")
    private int rendimientoIdrendimiento;

    public PruebaFisicaHasRendimientoPK() {
    }

    public PruebaFisicaHasRendimientoPK(int pruebaFisicaIdpruebaFisica, int rendimientoIdrendimiento) {
        this.pruebaFisicaIdpruebaFisica = pruebaFisicaIdpruebaFisica;
        this.rendimientoIdrendimiento = rendimientoIdrendimiento;
    }

    public int getPruebaFisicaIdpruebaFisica() {
        return pruebaFisicaIdpruebaFisica;
    }

    public void setPruebaFisicaIdpruebaFisica(int pruebaFisicaIdpruebaFisica) {
        this.pruebaFisicaIdpruebaFisica = pruebaFisicaIdpruebaFisica;
    }

    public int getRendimientoIdrendimiento() {
        return rendimientoIdrendimiento;
    }

    public void setRendimientoIdrendimiento(int rendimientoIdrendimiento) {
        this.rendimientoIdrendimiento = rendimientoIdrendimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pruebaFisicaIdpruebaFisica;
        hash += (int) rendimientoIdrendimiento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PruebaFisicaHasRendimientoPK)) {
            return false;
        }
        PruebaFisicaHasRendimientoPK other = (PruebaFisicaHasRendimientoPK) object;
        if (this.pruebaFisicaIdpruebaFisica != other.pruebaFisicaIdpruebaFisica) {
            return false;
        }
        if (this.rendimientoIdrendimiento != other.rendimientoIdrendimiento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.PruebaFisicaHasRendimientoPK[ pruebaFisicaIdpruebaFisica=" + pruebaFisicaIdpruebaFisica + ", rendimientoIdrendimiento=" + rendimientoIdrendimiento + " ]";
    }
    
}
