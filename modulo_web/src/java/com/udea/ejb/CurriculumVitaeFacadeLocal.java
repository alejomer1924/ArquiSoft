/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.CurriculumVitae;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author USUARIO
 */
@Local
public interface CurriculumVitaeFacadeLocal {

    void create(CurriculumVitae curriculumVitae);

    void edit(CurriculumVitae curriculumVitae);

    void remove(CurriculumVitae curriculumVitae);

    CurriculumVitae find(Object id);

    List<CurriculumVitae> findAll();

    List<CurriculumVitae> findRange(int[] range);

    int count();

    
}
