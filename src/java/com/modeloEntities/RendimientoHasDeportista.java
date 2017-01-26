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
@Table(name = "rendimiento_has_deportista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RendimientoHasDeportista.findAll", query = "SELECT r FROM RendimientoHasDeportista r"),
    @NamedQuery(name = "RendimientoHasDeportista.findByRendimientoIdrendimiento", query = "SELECT r FROM RendimientoHasDeportista r WHERE r.rendimientoHasDeportistaPK.rendimientoIdrendimiento = :rendimientoIdrendimiento"),
    @NamedQuery(name = "RendimientoHasDeportista.findByDeportistaidDeportista", query = "SELECT r FROM RendimientoHasDeportista r WHERE r.rendimientoHasDeportistaPK.deportistaidDeportista = :deportistaidDeportista")})
public class RendimientoHasDeportista implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RendimientoHasDeportistaPK rendimientoHasDeportistaPK;

    public RendimientoHasDeportista() {
    }

    public RendimientoHasDeportista(RendimientoHasDeportistaPK rendimientoHasDeportistaPK) {
        this.rendimientoHasDeportistaPK = rendimientoHasDeportistaPK;
    }

    public RendimientoHasDeportista(int rendimientoIdrendimiento, int deportistaidDeportista) {
        this.rendimientoHasDeportistaPK = new RendimientoHasDeportistaPK(rendimientoIdrendimiento, deportistaidDeportista);
    }

    public RendimientoHasDeportistaPK getRendimientoHasDeportistaPK() {
        return rendimientoHasDeportistaPK;
    }

    public void setRendimientoHasDeportistaPK(RendimientoHasDeportistaPK rendimientoHasDeportistaPK) {
        this.rendimientoHasDeportistaPK = rendimientoHasDeportistaPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rendimientoHasDeportistaPK != null ? rendimientoHasDeportistaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RendimientoHasDeportista)) {
            return false;
        }
        RendimientoHasDeportista other = (RendimientoHasDeportista) object;
        if ((this.rendimientoHasDeportistaPK == null && other.rendimientoHasDeportistaPK != null) || (this.rendimientoHasDeportistaPK != null && !this.rendimientoHasDeportistaPK.equals(other.rendimientoHasDeportistaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.RendimientoHasDeportista[ rendimientoHasDeportistaPK=" + rendimientoHasDeportistaPK + " ]";
    }
    
}
