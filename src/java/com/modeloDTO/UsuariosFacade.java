/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloDTO;

import com.modeloEntities.Usuarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author WJS
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> {

    @PersistenceContext(unitName = "ASYCFrontEndPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }
    
    public Usuarios login(String nombreUsuario, String clave){
        TypedQuery<Usuarios> query= getEntityManager().createNamedQuery(
                "Usuarios.findLogin",Usuarios.class);
        query.setParameter("nombreUsuario", nombreUsuario);
        query.setParameter("clave", clave);
        if (query.getResultList().size()==1) {
            return query.getResultList().get(0);
            
        }
        return null;        
    }
    public Usuarios loginDeportista(String nombreUsuario, String clave){
        TypedQuery<Usuarios> query2= getEntityManager().createNamedQuery(
                "Usuarios.findLoginDepor",Usuarios.class);
        query2.setParameter("nombreUsuario", nombreUsuario);
        query2.setParameter("clave", clave);
        if (query2.getResultList().size()==1) {
            return query2.getResultList().get(0);
            
        }
        return null;        
    }
    
    
    
}
