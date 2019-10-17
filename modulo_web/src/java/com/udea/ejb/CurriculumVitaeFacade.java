/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.CurriculumVitae;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author USUARIO
 */
@Stateless
public class CurriculumVitaeFacade extends AbstractFacade<CurriculumVitae> implements CurriculumVitaeFacadeLocal {

    @PersistenceContext(unitName = "modulo_webPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CurriculumVitaeFacade() {
        super(CurriculumVitae.class);
    }


    
}
