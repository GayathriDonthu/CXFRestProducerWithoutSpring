package com.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@SuppressWarnings("unused")
@Consumes("application/json")
@Produces("application/json")
public class StudentDetails implements StudentInterface {
	
	@POST
	@Path("/changeName")
	public Student changeName(Student student) {
		student.setName("HELLO " + student.getName());
		return student;
	}

	@POST
	@Path("/getName")
	public Student getName() {
		Student student = new Student();
	    student.setName("Gayathri");
	    return student;
	}

}
