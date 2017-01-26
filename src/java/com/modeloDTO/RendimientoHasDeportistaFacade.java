/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloDTO;

import com.modeloEntities.RendimientoHasDeportista;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author WJS
 */
@Stateless
public class RendimientoHasDeportistaFacade extends AbstractFacade<RendimientoHasDeportista> {

    @PersistenceContext(unitName = "ASYCFrontEndPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RendimientoHasDeportistaFacade() {
        super(RendimientoHasDeportista.class);
    }
    
}
