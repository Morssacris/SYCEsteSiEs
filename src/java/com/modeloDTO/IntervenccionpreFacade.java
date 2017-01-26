/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloDTO;

import com.modeloEntities.Intervenccionpre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author WJS
 */
@Stateless
public class IntervenccionpreFacade extends AbstractFacade<Intervenccionpre> {

    @PersistenceContext(unitName = "ASYCFrontEndPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IntervenccionpreFacade() {
        super(Intervenccionpre.class);
    }
    
}
