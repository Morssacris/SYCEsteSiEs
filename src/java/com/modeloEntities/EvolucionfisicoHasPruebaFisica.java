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
@Table(name = "evolucionfisico_has_prueba_fisica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EvolucionfisicoHasPruebaFisica.findAll", query = "SELECT e FROM EvolucionfisicoHasPruebaFisica e"),
    @NamedQuery(name = "EvolucionfisicoHasPruebaFisica.findByEvolucionFisicoidEvolucionFisico", query = "SELECT e FROM EvolucionfisicoHasPruebaFisica e WHERE e.evolucionfisicoHasPruebaFisicaPK.evolucionFisicoidEvolucionFisico = :evolucionFisicoidEvolucionFisico"),
    @NamedQuery(name = "EvolucionfisicoHasPruebaFisica.findByPruebaFisicaIdpruebaFisica", query = "SELECT e FROM EvolucionfisicoHasPruebaFisica e WHERE e.evolucionfisicoHasPruebaFisicaPK.pruebaFisicaIdpruebaFisica = :pruebaFisicaIdpruebaFisica")})
public class EvolucionfisicoHasPruebaFisica implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EvolucionfisicoHasPruebaFisicaPK evolucionfisicoHasPruebaFisicaPK;

    public EvolucionfisicoHasPruebaFisica() {
    }

    public EvolucionfisicoHasPruebaFisica(EvolucionfisicoHasPruebaFisicaPK evolucionfisicoHasPruebaFisicaPK) {
        this.evolucionfisicoHasPruebaFisicaPK = evolucionfisicoHasPruebaFisicaPK;
    }

    public EvolucionfisicoHasPruebaFisica(int evolucionFisicoidEvolucionFisico, int pruebaFisicaIdpruebaFisica) {
        this.evolucionfisicoHasPruebaFisicaPK = new EvolucionfisicoHasPruebaFisicaPK(evolucionFisicoidEvolucionFisico, pruebaFisicaIdpruebaFisica);
    }

    public EvolucionfisicoHasPruebaFisicaPK getEvolucionfisicoHasPruebaFisicaPK() {
        return evolucionfisicoHasPruebaFisicaPK;
    }

    public void setEvolucionfisicoHasPruebaFisicaPK(EvolucionfisicoHasPruebaFisicaPK evolucionfisicoHasPruebaFisicaPK) {
        this.evolucionfisicoHasPruebaFisicaPK = evolucionfisicoHasPruebaFisicaPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evolucionfisicoHasPruebaFisicaPK != null ? evolucionfisicoHasPruebaFisicaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvolucionfisicoHasPruebaFisica)) {
            return false;
        }
        EvolucionfisicoHasPruebaFisica other = (EvolucionfisicoHasPruebaFisica) object;
        if ((this.evolucionfisicoHasPruebaFisicaPK == null && other.evolucionfisicoHasPruebaFisicaPK != null) || (this.evolucionfisicoHasPruebaFisicaPK != null && !this.evolucionfisicoHasPruebaFisicaPK.equals(other.evolucionfisicoHasPruebaFisicaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.EvolucionfisicoHasPruebaFisica[ evolucionfisicoHasPruebaFisicaPK=" + evolucionfisicoHasPruebaFisicaPK + " ]";
    }
    
}
