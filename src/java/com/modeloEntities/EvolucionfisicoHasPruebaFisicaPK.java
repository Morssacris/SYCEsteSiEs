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
public class EvolucionfisicoHasPruebaFisicaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "EvolucionFisico_idEvolucionFisico")
    private int evolucionFisicoidEvolucionFisico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prueba_fisica_idprueba_fisica")
    private int pruebaFisicaIdpruebaFisica;

    public EvolucionfisicoHasPruebaFisicaPK() {
    }

    public EvolucionfisicoHasPruebaFisicaPK(int evolucionFisicoidEvolucionFisico, int pruebaFisicaIdpruebaFisica) {
        this.evolucionFisicoidEvolucionFisico = evolucionFisicoidEvolucionFisico;
        this.pruebaFisicaIdpruebaFisica = pruebaFisicaIdpruebaFisica;
    }

    public int getEvolucionFisicoidEvolucionFisico() {
        return evolucionFisicoidEvolucionFisico;
    }

    public void setEvolucionFisicoidEvolucionFisico(int evolucionFisicoidEvolucionFisico) {
        this.evolucionFisicoidEvolucionFisico = evolucionFisicoidEvolucionFisico;
    }

    public int getPruebaFisicaIdpruebaFisica() {
        return pruebaFisicaIdpruebaFisica;
    }

    public void setPruebaFisicaIdpruebaFisica(int pruebaFisicaIdpruebaFisica) {
        this.pruebaFisicaIdpruebaFisica = pruebaFisicaIdpruebaFisica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) evolucionFisicoidEvolucionFisico;
        hash += (int) pruebaFisicaIdpruebaFisica;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvolucionfisicoHasPruebaFisicaPK)) {
            return false;
        }
        EvolucionfisicoHasPruebaFisicaPK other = (EvolucionfisicoHasPruebaFisicaPK) object;
        if (this.evolucionFisicoidEvolucionFisico != other.evolucionFisicoidEvolucionFisico) {
            return false;
        }
        if (this.pruebaFisicaIdpruebaFisica != other.pruebaFisicaIdpruebaFisica) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.EvolucionfisicoHasPruebaFisicaPK[ evolucionFisicoidEvolucionFisico=" + evolucionFisicoidEvolucionFisico + ", pruebaFisicaIdpruebaFisica=" + pruebaFisicaIdpruebaFisica + " ]";
    }
    
}
