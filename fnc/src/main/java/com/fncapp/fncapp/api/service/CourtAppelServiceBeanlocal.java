/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fncapp.fncapp.api.service;

import com.fncapp.fncapp.api.entities.CourtAppel;
import com.fncapp.fncapp.api.service.core.BaseServiceBeanLocal;
import javax.ejb.Local;

/**
 *
 * @author Brendev
 */
@Local
public interface CourtAppelServiceBeanlocal extends BaseServiceBeanLocal<CourtAppel, Long> {
    
}
