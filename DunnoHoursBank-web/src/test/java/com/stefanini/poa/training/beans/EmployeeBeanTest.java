package com.stefanini.poa.training.beans;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import com.stefanini.poa.training.dunno.web.beans.EmployeeBean;
import com.stefanini.poa.training.dunno.web.beans.EmployeeBeanImpl;

public class EmployeeBeanTest {
	
	private EmployeeBean employeeBean = new EmployeeBeanImpl();

	@Test
	public final void testRegisterTime() {
		
		Boolean registerResult = employeeBean.registerTime();
		
		assertThat(registerResult, is(Boolean.TRUE)); 
	}

}
