/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "resistencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resistencia.findAll", query = "SELECT r FROM Resistencia r"),
    @NamedQuery(name = "Resistencia.findByIdResistencia", query = "SELECT r FROM Resistencia r WHERE r.idResistencia = :idResistencia"),
    @NamedQuery(name = "Resistencia.findByTipo", query = "SELECT r FROM Resistencia r WHERE r.tipo = :tipo"),
    @NamedQuery(name = "Resistencia.findByTipodeCargaidTipodeCarga", query = "SELECT r FROM Resistencia r WHERE r.tipodeCargaidTipodeCarga = :tipodeCargaidTipodeCarga")})
public class Resistencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idResistencia")
    private Integer idResistencia;
    @Size(max = 20)
    @Column(name = "Tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tipo de Carga_idTipo de Carga")
    private int tipodeCargaidTipodeCarga;
    @ManyToMany(mappedBy = "resistenciaList")
    private List<Entrenamientos> entrenamientosList;

    public Resistencia() {
    }

    public Resistencia(Integer idResistencia) {
        this.idResistencia = idResistencia;
    }

    public Resistencia(Integer idResistencia, int tipodeCargaidTipodeCarga) {
        this.idResistencia = idResistencia;
        this.tipodeCargaidTipodeCarga = tipodeCargaidTipodeCarga;
    }

    public Integer getIdResistencia() {
        return idResistencia;
    }

    public void setIdResistencia(Integer idResistencia) {
        this.idResistencia = idResistencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTipodeCargaidTipodeCarga() {
        return tipodeCargaidTipodeCarga;
    }

    public void setTipodeCargaidTipodeCarga(int tipodeCargaidTipodeCarga) {
        this.tipodeCargaidTipodeCarga = tipodeCargaidTipodeCarga;
    }

    @XmlTransient
    public List<Entrenamientos> getEntrenamientosList() {
        return entrenamientosList;
    }

    public void setEntrenamientosList(List<Entrenamientos> entrenamientosList) {
        this.entrenamientosList = entrenamientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResistencia != null ? idResistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resistencia)) {
            return false;
        }
        Resistencia other = (Resistencia) object;
        if ((this.idResistencia == null && other.idResistencia != null) || (this.idResistencia != null && !this.idResistencia.equals(other.idResistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Resistencia[ idResistencia=" + idResistencia + " ]";
    }
    
}
