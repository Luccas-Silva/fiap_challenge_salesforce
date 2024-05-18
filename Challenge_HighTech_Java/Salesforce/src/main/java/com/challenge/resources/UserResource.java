package com.challenge.resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import com.challenge.bo.UserBO;
import com.challenge.model.User;

@Path("/user")
public class UserResource {
	
	private UserBO userBO = new UserBO();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs(User user, @Context UriInfo uriInfo) throws ClassNotFoundException, SQLException {
		userBO.InsertBO(user);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder(); 
		builder.path(user.getCpf()); 
		return Response.created(builder.build()).build();
	}
		
	@PUT
	@Path("/{cpf}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizaRs(User user, @PathParam("cpf") String cpf) throws ClassNotFoundException, SQLException {
		userBO.UpdateBO(user);
		return Response.ok().build();
	}
		
	@DELETE
	@Path("/{cpf}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("cpf") String cpf) throws ClassNotFoundException, SQLException {
		userBO.DeleteBO(cpf);
		return Response.ok().build();
	}
			
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<User> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<User>) userBO.SelectBO();
	}

}
