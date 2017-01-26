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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "deportista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deportista.findAll", query = "SELECT d FROM Deportista d"),
    @NamedQuery(name = "Deportista.findByIdDeportista", query = "SELECT d FROM Deportista d WHERE d.idDeportista = :idDeportista")})
public class Deportista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDeportista")
    private Integer idDeportista;
    @JoinTable(name = "deportista_has_entrenamientos", joinColumns = {
        @JoinColumn(name = "Deportista_idDeportista", referencedColumnName = "idDeportista")}, inverseJoinColumns = {
        @JoinColumn(name = "Entrenamientos_idEntrenamientos", referencedColumnName = "idEntrenamientos")})
    @ManyToMany
    private List<Entrenamientos> entrenamientosList;
    @JoinColumn(name = "usuarios_idusuarios", referencedColumnName = "idusuarios")
    @ManyToOne(optional = false)
    private Usuarios usuariosIdusuarios;
    @JoinColumn(name = "idGrado", referencedColumnName = "idGrado")
    @ManyToOne(optional = false)
    private Grado idGrado;

    public Deportista() {
    }

    public Deportista(Integer idDeportista) {
        this.idDeportista = idDeportista;
    }

    public Integer getIdDeportista() {
        return idDeportista;
    }

    public void setIdDeportista(Integer idDeportista) {
        this.idDeportista = idDeportista;
    }

    @XmlTransient
    public List<Entrenamientos> getEntrenamientosList() {
        return entrenamientosList;
    }

    public void setEntrenamientosList(List<Entrenamientos> entrenamientosList) {
        this.entrenamientosList = entrenamientosList;
    }

    public Usuarios getUsuariosIdusuarios() {
        return usuariosIdusuarios;
    }

    public void setUsuariosIdusuarios(Usuarios usuariosIdusuarios) {
        this.usuariosIdusuarios = usuariosIdusuarios;
    }

    public Grado getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Grado idGrado) {
        this.idGrado = idGrado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDeportista != null ? idDeportista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deportista)) {
            return false;
        }
        Deportista other = (Deportista) object;
        if ((this.idDeportista == null && other.idDeportista != null) || (this.idDeportista != null && !this.idDeportista.equals(other.idDeportista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.Deportista[ idDeportista=" + idDeportista + " ]";
    }
    
}
