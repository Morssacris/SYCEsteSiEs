/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloEntities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WJS
 */
@Entity
@Table(name = "roles_has_permisos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolesHasPermisos.findAll", query = "SELECT r FROM RolesHasPermisos r"),
    @NamedQuery(name = "RolesHasPermisos.findByRolesIdroles", query = "SELECT r FROM RolesHasPermisos r WHERE r.rolesHasPermisosPK.rolesIdroles = :rolesIdroles"),
    @NamedQuery(name = "RolesHasPermisos.findByPermisosidPermisos", query = "SELECT r FROM RolesHasPermisos r WHERE r.rolesHasPermisosPK.permisosidPermisos = :permisosidPermisos")})
public class RolesHasPermisos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolesHasPermisosPK rolesHasPermisosPK;

    public RolesHasPermisos() {
    }

    public RolesHasPermisos(RolesHasPermisosPK rolesHasPermisosPK) {
        this.rolesHasPermisosPK = rolesHasPermisosPK;
    }

    public RolesHasPermisos(int rolesIdroles, int permisosidPermisos) {
        this.rolesHasPermisosPK = new RolesHasPermisosPK(rolesIdroles, permisosidPermisos);
    }

    public RolesHasPermisosPK getRolesHasPermisosPK() {
        return rolesHasPermisosPK;
    }

    public void setRolesHasPermisosPK(RolesHasPermisosPK rolesHasPermisosPK) {
        this.rolesHasPermisosPK = rolesHasPermisosPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolesHasPermisosPK != null ? rolesHasPermisosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolesHasPermisos)) {
            return false;
        }
        RolesHasPermisos other = (RolesHasPermisos) object;
        if ((this.rolesHasPermisosPK == null && other.rolesHasPermisosPK != null) || (this.rolesHasPermisosPK != null && !this.rolesHasPermisosPK.equals(other.rolesHasPermisosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modeloEntities.RolesHasPermisos[ rolesHasPermisosPK=" + rolesHasPermisosPK + " ]";
    }
    
}
