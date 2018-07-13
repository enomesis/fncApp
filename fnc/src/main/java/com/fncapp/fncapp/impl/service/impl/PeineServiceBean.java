/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fncapp.fncapp.impl.service.impl;

import com.fncapp.fncapp.api.dao.PeineDaoBeanLocal;
import com.fncapp.fncapp.api.dao.core.BaseDaoBeanLocal;
import com.fncapp.fncapp.api.entities.Peine;
import com.fncapp.fncapp.api.service.PeineServiceBeanLocal;
import com.fncapp.fncapp.impl.service.core.impl.BaseServiceBean;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Edson PAKOU
 */
@Stateless
public class PeineServiceBean extends BaseServiceBean<Peine, Long> implements PeineServiceBeanLocal{

    @EJB
    private PeineDaoBeanLocal pdbl;
    
    @Override
    protected BaseDaoBeanLocal<Peine, Long> getDao(){
        return pdbl;
    }

}
