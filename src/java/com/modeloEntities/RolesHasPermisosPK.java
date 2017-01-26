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
public class RolesHasPermisosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "roles_idroles")
    private int rolesIdroles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Permisos_idPermisos")
    private int permisosidPermisos;

    public RolesHasPermisosPK() {
    }

    public RolesHasPermisosPK(int rolesIdroles, int permisosidPermisos) {
        this.rolesIdroles = rolesIdroles;
        this.permisosidPermisos = permisosidPermisos;
    }

    public int getRolesIdroles() {
        return rolesIdroles;
    }

    public void setRolesIdroles(int rolesIdroles) {
        this.rolesIdroles = rolesIdroles;
    }

    public int getPermisosidPermisos() {
        return permisosidPermisos;
    }

    public void setPermisosidPermisos(int permisosidPermisos) {
        this.permisosidPermisos = permisosidPermisos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rolesIdroles;
        hash += (int) permisosidPermisos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolesHasPermisosPK)) {
            return false;
        }
        RolesHasPermisosPK other = (RolesHasPermisosPK) object;
        if (this.rolesIdroles != other.rolesIdroles) {
            return false;
        }
        if (this.permisosidPermisos != other.permisosidPermisos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.RolesHasPermisosPK[ rolesIdroles=" + rolesIdroles + ", permisosidPermisos=" + permisosidPermisos + " ]";
    }
    
}
