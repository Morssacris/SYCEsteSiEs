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
public class RendimientoHasDeportistaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "rendimiento_idrendimiento")
    private int rendimientoIdrendimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deportista_idDeportista")
    private int deportistaidDeportista;

    public RendimientoHasDeportistaPK() {
    }

    public RendimientoHasDeportistaPK(int rendimientoIdrendimiento, int deportistaidDeportista) {
        this.rendimientoIdrendimiento = rendimientoIdrendimiento;
        this.deportistaidDeportista = deportistaidDeportista;
    }

    public int getRendimientoIdrendimiento() {
        return rendimientoIdrendimiento;
    }

    public void setRendimientoIdrendimiento(int rendimientoIdrendimiento) {
        this.rendimientoIdrendimiento = rendimientoIdrendimiento;
    }

    public int getDeportistaidDeportista() {
        return deportistaidDeportista;
    }

    public void setDeportistaidDeportista(int deportistaidDeportista) {
        this.deportistaidDeportista = deportistaidDeportista;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rendimientoIdrendimiento;
        hash += (int) deportistaidDeportista;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RendimientoHasDeportistaPK)) {
            return false;
        }
        RendimientoHasDeportistaPK other = (RendimientoHasDeportistaPK) object;
        if (this.rendimientoIdrendimiento != other.rendimientoIdrendimiento) {
            return false;
        }
        if (this.deportistaidDeportista != other.deportistaidDeportista) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.RendimientoHasDeportistaPK[ rendimientoIdrendimiento=" + rendimientoIdrendimiento + ", deportistaidDeportista=" + deportistaidDeportista + " ]";
    }
    
}
