/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "intervenccionpre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Intervenccionpre.findAll", query = "SELECT i FROM Intervenccionpre i"),
    @NamedQuery(name = "Intervenccionpre.findByIdIntervenccionPre", query = "SELECT i FROM Intervenccionpre i WHERE i.idIntervenccionPre = :idIntervenccionPre"),
    @NamedQuery(name = "Intervenccionpre.findByIntervenccionPredominante", query = "SELECT i FROM Intervenccionpre i WHERE i.intervenccionPredominante = :intervenccionPredominante")})
public class Intervenccionpre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idIntervenccionPre")
    private Integer idIntervenccionPre;
    @Size(max = 10)
    @Column(name = "IntervenccionPredominante")
    private String intervenccionPredominante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intervenccionPreidIntervenccionPre")
    private List<Ejercicioresistencia> ejercicioresistenciaList;

    public Intervenccionpre() {
    }

    public Intervenccionpre(Integer idIntervenccionPre) {
        this.idIntervenccionPre = idIntervenccionPre;
    }

    public Integer getIdIntervenccionPre() {
        return idIntervenccionPre;
    }

    public void setIdIntervenccionPre(Integer idIntervenccionPre) {
        this.idIntervenccionPre = idIntervenccionPre;
    }

    public String getIntervenccionPredominante() {
        return intervenccionPredominante;
    }

    public void setIntervenccionPredominante(String intervenccionPredominante) {
        this.intervenccionPredominante = intervenccionPredominante;
    }

    @XmlTransient
    public List<Ejercicioresistencia> getEjercicioresistenciaList() {
        return ejercicioresistenciaList;
    }

    public void setEjercicioresistenciaList(List<Ejercicioresistencia> ejercicioresistenciaList) {
        this.ejercicioresistenciaList = ejercicioresistenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIntervenccionPre != null ? idIntervenccionPre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Intervenccionpre)) {
            return false;
        }
        Intervenccionpre other = (Intervenccionpre) object;
        if ((this.idIntervenccionPre == null && other.idIntervenccionPre != null) || (this.idIntervenccionPre != null && !this.idIntervenccionPre.equals(other.idIntervenccionPre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Intervenccionpre[ idIntervenccionPre=" + idIntervenccionPre + " ]";
    }
    
}
