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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ejercicioresistencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejercicioresistencia.findAll", query = "SELECT e FROM Ejercicioresistencia e"),
    @NamedQuery(name = "Ejercicioresistencia.findByIdEjercicioResistencia", query = "SELECT e FROM Ejercicioresistencia e WHERE e.idEjercicioResistencia = :idEjercicioResistencia"),
    @NamedQuery(name = "Ejercicioresistencia.findByEjercicio", query = "SELECT e FROM Ejercicioresistencia e WHERE e.ejercicio = :ejercicio"),
    @NamedQuery(name = "Ejercicioresistencia.findByDuracion", query = "SELECT e FROM Ejercicioresistencia e WHERE e.duracion = :duracion")})
public class Ejercicioresistencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEjercicioResistencia")
    private Integer idEjercicioResistencia;
    @Size(max = 45)
    @Column(name = "Ejercicio")
    private String ejercicio;
    @Size(max = 45)
    @Column(name = "Duracion")
    private String duracion;
    @JoinColumn(name = "IntervenccionPre_idIntervenccionPre", referencedColumnName = "idIntervenccionPre")
    @ManyToOne(optional = false)
    private Intervenccionpre intervenccionPreidIntervenccionPre;

    public Ejercicioresistencia() {
    }

    public Ejercicioresistencia(Integer idEjercicioResistencia) {
        this.idEjercicioResistencia = idEjercicioResistencia;
    }

    public Integer getIdEjercicioResistencia() {
        return idEjercicioResistencia;
    }

    public void setIdEjercicioResistencia(Integer idEjercicioResistencia) {
        this.idEjercicioResistencia = idEjercicioResistencia;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Intervenccionpre getIntervenccionPreidIntervenccionPre() {
        return intervenccionPreidIntervenccionPre;
    }

    public void setIntervenccionPreidIntervenccionPre(Intervenccionpre intervenccionPreidIntervenccionPre) {
        this.intervenccionPreidIntervenccionPre = intervenccionPreidIntervenccionPre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEjercicioResistencia != null ? idEjercicioResistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejercicioresistencia)) {
            return false;
        }
        Ejercicioresistencia other = (Ejercicioresistencia) object;
        if ((this.idEjercicioResistencia == null && other.idEjercicioResistencia != null) || (this.idEjercicioResistencia != null && !this.idEjercicioResistencia.equals(other.idEjercicioResistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Ejercicioresistencia[ idEjercicioResistencia=" + idEjercicioResistencia + " ]";
    }
    
}
