/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "ejercicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejercicios.findAll", query = "SELECT e FROM Ejercicios e"),
    @NamedQuery(name = "Ejercicios.findByIdejercicios", query = "SELECT e FROM Ejercicios e WHERE e.ejerciciosPK.idejercicios = :idejercicios"),
    @NamedQuery(name = "Ejercicios.findByEjercicio", query = "SELECT e FROM Ejercicios e WHERE e.ejercicio = :ejercicio"),
    @NamedQuery(name = "Ejercicios.findByRepeticiones", query = "SELECT e FROM Ejercicios e WHERE e.repeticiones = :repeticiones"),
    @NamedQuery(name = "Ejercicios.findBySeries", query = "SELECT e FROM Ejercicios e WHERE e.series = :series"),
    @NamedQuery(name = "Ejercicios.findByTiempodeRecuperacion", query = "SELECT e FROM Ejercicios e WHERE e.tiempodeRecuperacion = :tiempodeRecuperacion"),
    @NamedQuery(name = "Ejercicios.findByDuracion", query = "SELECT e FROM Ejercicios e WHERE e.duracion = :duracion"),
    @NamedQuery(name = "Ejercicios.findByFuerzaidFuerza", query = "SELECT e FROM Ejercicios e WHERE e.ejerciciosPK.fuerzaidFuerza = :fuerzaidFuerza")})
public class Ejercicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EjerciciosPK ejerciciosPK;
    @Size(max = 45)
    @Column(name = "Ejercicio")
    private String ejercicio;
    @Column(name = "repeticiones")
    private Integer repeticiones;
    @Column(name = "series")
    private Integer series;
    @Size(max = 45)
    @Column(name = "Tiempo de Recuperacion")
    private String tiempodeRecuperacion;
    @Size(max = 45)
    @Column(name = "Duracion")
    private String duracion;
    @JoinColumn(name = "fuerza_idFuerza", referencedColumnName = "idFuerza", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Fuerza fuerza;

    public Ejercicios() {
    }

    public Ejercicios(EjerciciosPK ejerciciosPK) {
        this.ejerciciosPK = ejerciciosPK;
    }

    public Ejercicios(int idejercicios, int fuerzaidFuerza) {
        this.ejerciciosPK = new EjerciciosPK(idejercicios, fuerzaidFuerza);
    }

    public EjerciciosPK getEjerciciosPK() {
        return ejerciciosPK;
    }

    public void setEjerciciosPK(EjerciciosPK ejerciciosPK) {
        this.ejerciciosPK = ejerciciosPK;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Integer getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(Integer repeticiones) {
        this.repeticiones = repeticiones;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getTiempodeRecuperacion() {
        return tiempodeRecuperacion;
    }

    public void setTiempodeRecuperacion(String tiempodeRecuperacion) {
        this.tiempodeRecuperacion = tiempodeRecuperacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Fuerza getFuerza() {
        return fuerza;
    }

    public void setFuerza(Fuerza fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ejerciciosPK != null ? ejerciciosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejercicios)) {
            return false;
        }
        Ejercicios other = (Ejercicios) object;
        if ((this.ejerciciosPK == null && other.ejerciciosPK != null) || (this.ejerciciosPK != null && !this.ejerciciosPK.equals(other.ejerciciosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Ejercicios[ ejerciciosPK=" + ejerciciosPK + " ]";
    }
    
}
