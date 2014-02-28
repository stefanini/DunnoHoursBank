/**
 * 
 */
package com.stefanini.poa.training.dunno.web.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.poa.training.dunno.web.beans.EmployeeBean;

/**
 * @author heoliveira
 *
 */
@Stateless
@Path(value = "/employee")
public class EmployeeService {

	@EJB
    private EmployeeBean employeeBean;
	
	/**
	 * Register employee's time entry.
	 */
	@POST
	@Path("/timeEntry")
	@Produces(MediaType.APPLICATION_JSON)
	public Response registerTimeEntry() {

		employeeBean.registerTime();
	
		return Response.ok().build();
	}
}
