/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author WJS
 */
@Embeddable
public class EjerciciosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idejercicios")
    private int idejercicios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fuerza_idFuerza")
    private int fuerzaidFuerza;

    public EjerciciosPK() {
    }

    public EjerciciosPK(int idejercicios, int fuerzaidFuerza) {
        this.idejercicios = idejercicios;
        this.fuerzaidFuerza = fuerzaidFuerza;
    }

    public int getIdejercicios() {
        return idejercicios;
    }

    public void setIdejercicios(int idejercicios) {
        this.idejercicios = idejercicios;
    }

    public int getFuerzaidFuerza() {
        return fuerzaidFuerza;
    }

    public void setFuerzaidFuerza(int fuerzaidFuerza) {
        this.fuerzaidFuerza = fuerzaidFuerza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idejercicios;
        hash += (int) fuerzaidFuerza;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EjerciciosPK)) {
            return false;
        }
        EjerciciosPK other = (EjerciciosPK) object;
        if (this.idejercicios != other.idejercicios) {
            return false;
        }
        if (this.fuerzaidFuerza != other.fuerzaidFuerza) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.EjerciciosPK[ idejercicios=" + idejercicios + ", fuerzaidFuerza=" + fuerzaidFuerza + " ]";
    }
    
}
