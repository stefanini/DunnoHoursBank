/**
 * 
 */
package com.stefanini.poa.training.dunno.web.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * @author heoliveira
 *
 */
@Stateless(name = "EmployeeBean")
@LocalBean
public class EmployeeBeanImpl implements EmployeeBean {

	/* (non-Javadoc)
	 * @see com.stefanini.poa.training.dunno.web.beans.EmployeeBean#registerTime()
	 */
	@Override
	public Boolean registerTime() {
		return Boolean.TRUE;
	}

}
