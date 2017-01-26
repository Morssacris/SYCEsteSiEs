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
@Table(name = "prueba_fisica_has_rendimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PruebaFisicaHasRendimiento.findAll", query = "SELECT p FROM PruebaFisicaHasRendimiento p"),
    @NamedQuery(name = "PruebaFisicaHasRendimiento.findByPruebaFisicaIdpruebaFisica", query = "SELECT p FROM PruebaFisicaHasRendimiento p WHERE p.pruebaFisicaHasRendimientoPK.pruebaFisicaIdpruebaFisica = :pruebaFisicaIdpruebaFisica"),
    @NamedQuery(name = "PruebaFisicaHasRendimiento.findByRendimientoIdrendimiento", query = "SELECT p FROM PruebaFisicaHasRendimiento p WHERE p.pruebaFisicaHasRendimientoPK.rendimientoIdrendimiento = :rendimientoIdrendimiento")})
public class PruebaFisicaHasRendimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PruebaFisicaHasRendimientoPK pruebaFisicaHasRendimientoPK;

    public PruebaFisicaHasRendimiento() {
    }

    public PruebaFisicaHasRendimiento(PruebaFisicaHasRendimientoPK pruebaFisicaHasRendimientoPK) {
        this.pruebaFisicaHasRendimientoPK = pruebaFisicaHasRendimientoPK;
    }

    public PruebaFisicaHasRendimiento(int pruebaFisicaIdpruebaFisica, int rendimientoIdrendimiento) {
        this.pruebaFisicaHasRendimientoPK = new PruebaFisicaHasRendimientoPK(pruebaFisicaIdpruebaFisica, rendimientoIdrendimiento);
    }

    public PruebaFisicaHasRendimientoPK getPruebaFisicaHasRendimientoPK() {
        return pruebaFisicaHasRendimientoPK;
    }

    public void setPruebaFisicaHasRendimientoPK(PruebaFisicaHasRendimientoPK pruebaFisicaHasRendimientoPK) {
        this.pruebaFisicaHasRendimientoPK = pruebaFisicaHasRendimientoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pruebaFisicaHasRendimientoPK != null ? pruebaFisicaHasRendimientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PruebaFisicaHasRendimiento)) {
            return false;
        }
        PruebaFisicaHasRendimiento other = (PruebaFisicaHasRendimiento) object;
        if ((this.pruebaFisicaHasRendimientoPK == null && other.pruebaFisicaHasRendimientoPK != null) || (this.pruebaFisicaHasRendimientoPK != null && !this.pruebaFisicaHasRendimientoPK.equals(other.pruebaFisicaHasRendimientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.PruebaFisicaHasRendimiento[ pruebaFisicaHasRendimientoPK=" + pruebaFisicaHasRendimientoPK + " ]";
    }
    
}
