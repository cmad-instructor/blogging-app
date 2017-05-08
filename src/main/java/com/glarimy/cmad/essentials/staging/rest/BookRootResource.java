package com.glarimy.cmad.essentials.staging.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.glarimy.cmad.essentials.staging.api.Library;
import com.glarimy.cmad.essentials.staging.service.LibraryImpl;

@Path("/")
public class BookRootResource {
	private Library library = new LibraryImpl();

	@GET
	@Path("/book/{isbn}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response find(@PathParam("isbn") int isbn) {
		System.out.println("Root Resource finding " + isbn);
			return Response.ok().entity(library.find(isbn)).build();
	}
}
