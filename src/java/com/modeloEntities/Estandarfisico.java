/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "estandarfisico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estandarfisico.findAll", query = "SELECT e FROM Estandarfisico e"),
    @NamedQuery(name = "Estandarfisico.findByIdEstandarFisico", query = "SELECT e FROM Estandarfisico e WHERE e.idEstandarFisico = :idEstandarFisico"),
    @NamedQuery(name = "Estandarfisico.findByMasculinoidMasculinoEstadoBueno", query = "SELECT e FROM Estandarfisico e WHERE e.masculinoidMasculinoEstadoBueno = :masculinoidMasculinoEstadoBueno"),
    @NamedQuery(name = "Estandarfisico.findByFemeninoidMasculinoEstadoBueno", query = "SELECT e FROM Estandarfisico e WHERE e.femeninoidMasculinoEstadoBueno = :femeninoidMasculinoEstadoBueno")})
public class Estandarfisico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstandarFisico")
    private Integer idEstandarFisico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Masculino_idMasculinoEstadoBueno")
    private int masculinoidMasculinoEstadoBueno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Femenino_idMasculinoEstadoBueno")
    private int femeninoidMasculinoEstadoBueno;

    public Estandarfisico() {
    }

    public Estandarfisico(Integer idEstandarFisico) {
        this.idEstandarFisico = idEstandarFisico;
    }

    public Estandarfisico(Integer idEstandarFisico, int masculinoidMasculinoEstadoBueno, int femeninoidMasculinoEstadoBueno) {
        this.idEstandarFisico = idEstandarFisico;
        this.masculinoidMasculinoEstadoBueno = masculinoidMasculinoEstadoBueno;
        this.femeninoidMasculinoEstadoBueno = femeninoidMasculinoEstadoBueno;
    }

    public Integer getIdEstandarFisico() {
        return idEstandarFisico;
    }

    public void setIdEstandarFisico(Integer idEstandarFisico) {
        this.idEstandarFisico = idEstandarFisico;
    }

    public int getMasculinoidMasculinoEstadoBueno() {
        return masculinoidMasculinoEstadoBueno;
    }

    public void setMasculinoidMasculinoEstadoBueno(int masculinoidMasculinoEstadoBueno) {
        this.masculinoidMasculinoEstadoBueno = masculinoidMasculinoEstadoBueno;
    }

    public int getFemeninoidMasculinoEstadoBueno() {
        return femeninoidMasculinoEstadoBueno;
    }

    public void setFemeninoidMasculinoEstadoBueno(int femeninoidMasculinoEstadoBueno) {
        this.femeninoidMasculinoEstadoBueno = femeninoidMasculinoEstadoBueno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstandarFisico != null ? idEstandarFisico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estandarfisico)) {
            return false;
        }
        Estandarfisico other = (Estandarfisico) object;
        if ((this.idEstandarFisico == null && other.idEstandarFisico != null) || (this.idEstandarFisico != null && !this.idEstandarFisico.equals(other.idEstandarFisico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Estandarfisico[ idEstandarFisico=" + idEstandarFisico + " ]";
    }
    
}
