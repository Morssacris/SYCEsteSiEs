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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "tipo de carga")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDeCarga.findAll", query = "SELECT t FROM TipoDeCarga t"),
    @NamedQuery(name = "TipoDeCarga.findByIdTipodeCarga", query = "SELECT t FROM TipoDeCarga t WHERE t.idTipodeCarga = :idTipodeCarga"),
    @NamedQuery(name = "TipoDeCarga.findByTipodecarga", query = "SELECT t FROM TipoDeCarga t WHERE t.tipodecarga = :tipodecarga"),
    @NamedQuery(name = "TipoDeCarga.findByIntervenccionPreidIntervenccionPre", query = "SELECT t FROM TipoDeCarga t WHERE t.intervenccionPreidIntervenccionPre = :intervenccionPreidIntervenccionPre")})
public class TipoDeCarga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipo de Carga")
    private Integer idTipodeCarga;
    @Size(max = 15)
    @Column(name = "Tipo de carga")
    private String tipodecarga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IntervenccionPre_idIntervenccionPre")
    private int intervenccionPreidIntervenccionPre;

    public TipoDeCarga() {
    }

    public TipoDeCarga(Integer idTipodeCarga) {
        this.idTipodeCarga = idTipodeCarga;
    }

    public TipoDeCarga(Integer idTipodeCarga, int intervenccionPreidIntervenccionPre) {
        this.idTipodeCarga = idTipodeCarga;
        this.intervenccionPreidIntervenccionPre = intervenccionPreidIntervenccionPre;
    }

    public Integer getIdTipodeCarga() {
        return idTipodeCarga;
    }

    public void setIdTipodeCarga(Integer idTipodeCarga) {
        this.idTipodeCarga = idTipodeCarga;
    }

    public String getTipodecarga() {
        return tipodecarga;
    }

    public void setTipodecarga(String tipodecarga) {
        this.tipodecarga = tipodecarga;
    }

    public int getIntervenccionPreidIntervenccionPre() {
        return intervenccionPreidIntervenccionPre;
    }

    public void setIntervenccionPreidIntervenccionPre(int intervenccionPreidIntervenccionPre) {
        this.intervenccionPreidIntervenccionPre = intervenccionPreidIntervenccionPre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipodeCarga != null ? idTipodeCarga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeCarga)) {
            return false;
        }
        TipoDeCarga other = (TipoDeCarga) object;
        if ((this.idTipodeCarga == null && other.idTipodeCarga != null) || (this.idTipodeCarga != null && !this.idTipodeCarga.equals(other.idTipodeCarga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.TipoDeCarga[ idTipodeCarga=" + idTipodeCarga + " ]";
    }
    
}
