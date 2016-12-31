package com.lookactive.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.lookactive.model.Employee;

@Path("/v1")
public class LookActiveService {

	@GET
	@Path("/employee/{empid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getTest(@PathParam("empid") int employeeId){
		Employee emp = new Employee();
		emp.setEmpId(employeeId);
		emp.setEmpName("Rahul");
		emp.setEmpAddress("koramangala");
		return emp;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	@Path("/employee")
	public String postTest(Employee emp){
		return emp.getEmpName();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	@Path("/employee/{empid}")
	public String putTest(@PathParam("empid") String empId ,Employee emp)
	{
		return  "updated employee with id:"+empId+"\n"+"with name: "+emp.getEmpName()+" - residing in address: "+emp.getEmpAddress();
		
	}
	
	@DELETE
	@Produces(MediaType.TEXT_HTML)
	@Path("/employee/{emp}")
	public String deleteTest(@PathParam("emp") String empId)
	{
		return "deleting emp with id :"+empId;
		
	}
}
