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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "estandarrendimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estandarrendimiento.findAll", query = "SELECT e FROM Estandarrendimiento e"),
    @NamedQuery(name = "Estandarrendimiento.findByIdEstandarRendimiento", query = "SELECT e FROM Estandarrendimiento e WHERE e.idEstandarRendimiento = :idEstandarRendimiento"),
    @NamedQuery(name = "Estandarrendimiento.findByFemeninoidMasculinoEstadoBueno", query = "SELECT e FROM Estandarrendimiento e WHERE e.femeninoidMasculinoEstadoBueno = :femeninoidMasculinoEstadoBueno"),
    @NamedQuery(name = "Estandarrendimiento.findByMasculinoidMasculinoEstadoBueno", query = "SELECT e FROM Estandarrendimiento e WHERE e.masculinoidMasculinoEstadoBueno = :masculinoidMasculinoEstadoBueno")})
public class Estandarrendimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstandarRendimiento")
    private Integer idEstandarRendimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Femenino_idMasculinoEstadoBueno")
    private int femeninoidMasculinoEstadoBueno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Masculino_idMasculinoEstadoBueno")
    private int masculinoidMasculinoEstadoBueno;

    public Estandarrendimiento() {
    }

    public Estandarrendimiento(Integer idEstandarRendimiento) {
        this.idEstandarRendimiento = idEstandarRendimiento;
    }

    public Estandarrendimiento(Integer idEstandarRendimiento, int femeninoidMasculinoEstadoBueno, int masculinoidMasculinoEstadoBueno) {
        this.idEstandarRendimiento = idEstandarRendimiento;
        this.femeninoidMasculinoEstadoBueno = femeninoidMasculinoEstadoBueno;
        this.masculinoidMasculinoEstadoBueno = masculinoidMasculinoEstadoBueno;
    }

    public Integer getIdEstandarRendimiento() {
        return idEstandarRendimiento;
    }

    public void setIdEstandarRendimiento(Integer idEstandarRendimiento) {
        this.idEstandarRendimiento = idEstandarRendimiento;
    }

    public int getFemeninoidMasculinoEstadoBueno() {
        return femeninoidMasculinoEstadoBueno;
    }

    public void setFemeninoidMasculinoEstadoBueno(int femeninoidMasculinoEstadoBueno) {
        this.femeninoidMasculinoEstadoBueno = femeninoidMasculinoEstadoBueno;
    }

    public int getMasculinoidMasculinoEstadoBueno() {
        return masculinoidMasculinoEstadoBueno;
    }

    public void setMasculinoidMasculinoEstadoBueno(int masculinoidMasculinoEstadoBueno) {
        this.masculinoidMasculinoEstadoBueno = masculinoidMasculinoEstadoBueno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstandarRendimiento != null ? idEstandarRendimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estandarrendimiento)) {
            return false;
        }
        Estandarrendimiento other = (Estandarrendimiento) object;
        if ((this.idEstandarRendimiento == null && other.idEstandarRendimiento != null) || (this.idEstandarRendimiento != null && !this.idEstandarRendimiento.equals(other.idEstandarRendimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Estandarrendimiento[ idEstandarRendimiento=" + idEstandarRendimiento + " ]";
    }
    
}
