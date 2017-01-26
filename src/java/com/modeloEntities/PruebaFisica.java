/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "prueba_fisica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PruebaFisica.findAll", query = "SELECT p FROM PruebaFisica p"),
    @NamedQuery(name = "PruebaFisica.findByIdpruebaFisica", query = "SELECT p FROM PruebaFisica p WHERE p.idpruebaFisica = :idpruebaFisica"),
    @NamedQuery(name = "PruebaFisica.findByTiempoMetros", query = "SELECT p FROM PruebaFisica p WHERE p.tiempoMetros = :tiempoMetros"),
    @NamedQuery(name = "PruebaFisica.findByCantidadAbs", query = "SELECT p FROM PruebaFisica p WHERE p.cantidadAbs = :cantidadAbs"),
    @NamedQuery(name = "PruebaFisica.findByCantidadFlexionesCodo", query = "SELECT p FROM PruebaFisica p WHERE p.cantidadFlexionesCodo = :cantidadFlexionesCodo"),
    @NamedQuery(name = "PruebaFisica.findByCantidadBarrar", query = "SELECT p FROM PruebaFisica p WHERE p.cantidadBarrar = :cantidadBarrar"),
    @NamedQuery(name = "PruebaFisica.findByCantidadSentadilla", query = "SELECT p FROM PruebaFisica p WHERE p.cantidadSentadilla = :cantidadSentadilla"),
    @NamedQuery(name = "PruebaFisica.findByAlturaSalto", query = "SELECT p FROM PruebaFisica p WHERE p.alturaSalto = :alturaSalto"),
    @NamedQuery(name = "PruebaFisica.findByPuntajefisica", query = "SELECT p FROM PruebaFisica p WHERE p.puntajefisica = :puntajefisica"),
    @NamedQuery(name = "PruebaFisica.findByFecha", query = "SELECT p FROM PruebaFisica p WHERE p.fecha = :fecha")})
public class PruebaFisica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idprueba_fisica")
    private Integer idpruebaFisica;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tiempo_metros")
    private Double tiempoMetros;
    @Column(name = "cantidad_abs")
    private Integer cantidadAbs;
    @Column(name = "cantidad_flexiones_codo")
    private Integer cantidadFlexionesCodo;
    @Column(name = "cantidad_barrar")
    private Integer cantidadBarrar;
    @Column(name = "cantidad_sentadilla")
    private Integer cantidadSentadilla;
    @Column(name = "altura_salto")
    private Double alturaSalto;
    @Column(name = "puntajefisica")
    private Integer puntajefisica;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public PruebaFisica() {
    }

    public PruebaFisica(Integer idpruebaFisica) {
        this.idpruebaFisica = idpruebaFisica;
    }

    public Integer getIdpruebaFisica() {
        return idpruebaFisica;
    }

    public void setIdpruebaFisica(Integer idpruebaFisica) {
        this.idpruebaFisica = idpruebaFisica;
    }

    public Double getTiempoMetros() {
        return tiempoMetros;
    }

    public void setTiempoMetros(Double tiempoMetros) {
        this.tiempoMetros = tiempoMetros;
    }

    public Integer getCantidadAbs() {
        return cantidadAbs;
    }

    public void setCantidadAbs(Integer cantidadAbs) {
        this.cantidadAbs = cantidadAbs;
    }

    public Integer getCantidadFlexionesCodo() {
        return cantidadFlexionesCodo;
    }

    public void setCantidadFlexionesCodo(Integer cantidadFlexionesCodo) {
        this.cantidadFlexionesCodo = cantidadFlexionesCodo;
    }

    public Integer getCantidadBarrar() {
        return cantidadBarrar;
    }

    public void setCantidadBarrar(Integer cantidadBarrar) {
        this.cantidadBarrar = cantidadBarrar;
    }

    public Integer getCantidadSentadilla() {
        return cantidadSentadilla;
    }

    public void setCantidadSentadilla(Integer cantidadSentadilla) {
        this.cantidadSentadilla = cantidadSentadilla;
    }

    public Double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(Double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public Integer getPuntajefisica() {
        return puntajefisica;
    }

    public void setPuntajefisica(Integer puntajefisica) {
        this.puntajefisica = puntajefisica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpruebaFisica != null ? idpruebaFisica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PruebaFisica)) {
            return false;
        }
        PruebaFisica other = (PruebaFisica) object;
        if ((this.idpruebaFisica == null && other.idpruebaFisica != null) || (this.idpruebaFisica != null && !this.idpruebaFisica.equals(other.idpruebaFisica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.PruebaFisica[ idpruebaFisica=" + idpruebaFisica + " ]";
    }
    
}
