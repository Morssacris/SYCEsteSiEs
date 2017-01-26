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
@Table(name = "pruebafisica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pruebafisica_1.findAll", query = "SELECT p FROM Pruebafisica_1 p"),
    @NamedQuery(name = "Pruebafisica_1.findByIdpruebaFisica", query = "SELECT p FROM Pruebafisica_1 p WHERE p.idpruebaFisica = :idpruebaFisica"),
    @NamedQuery(name = "Pruebafisica_1.findByTiempoMetros", query = "SELECT p FROM Pruebafisica_1 p WHERE p.tiempoMetros = :tiempoMetros"),
    @NamedQuery(name = "Pruebafisica_1.findByCantidadAbs", query = "SELECT p FROM Pruebafisica_1 p WHERE p.cantidadAbs = :cantidadAbs"),
    @NamedQuery(name = "Pruebafisica_1.findByCantidadFlexionesCodo", query = "SELECT p FROM Pruebafisica_1 p WHERE p.cantidadFlexionesCodo = :cantidadFlexionesCodo"),
    @NamedQuery(name = "Pruebafisica_1.findByCantidadBarrar", query = "SELECT p FROM Pruebafisica_1 p WHERE p.cantidadBarrar = :cantidadBarrar"),
    @NamedQuery(name = "Pruebafisica_1.findByCantidadSentadilla", query = "SELECT p FROM Pruebafisica_1 p WHERE p.cantidadSentadilla = :cantidadSentadilla"),
    @NamedQuery(name = "Pruebafisica_1.findByAlturaSalto", query = "SELECT p FROM Pruebafisica_1 p WHERE p.alturaSalto = :alturaSalto"),
    @NamedQuery(name = "Pruebafisica_1.findByPuntajefisica", query = "SELECT p FROM Pruebafisica_1 p WHERE p.puntajefisica = :puntajefisica"),
    @NamedQuery(name = "Pruebafisica_1.findByFecha", query = "SELECT p FROM Pruebafisica_1 p WHERE p.fecha = :fecha")})
public class Pruebafisica_1 implements Serializable {

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

    public Pruebafisica_1() {
    }

    public Pruebafisica_1(Integer idpruebaFisica) {
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
        if (!(object instanceof Pruebafisica_1)) {
            return false;
        }
        Pruebafisica_1 other = (Pruebafisica_1) object;
        if ((this.idpruebaFisica == null && other.idpruebaFisica != null) || (this.idpruebaFisica != null && !this.idpruebaFisica.equals(other.idpruebaFisica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Pruebafisica_1[ idpruebaFisica=" + idpruebaFisica + " ]";
    }
    
}
