package com.glarimy.cmad.essentials.staging.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.glarimy.cmad.essentials.staging.api.BookNotFoundException;
import com.glarimy.cmad.essentials.staging.api.LibraryException;

@Provider
public class LibraryExceptionMapper implements ExceptionMapper<LibraryException> {

	@Override
	public Response toResponse(LibraryException le) {
		le.printStackTrace();
		if (le instanceof BookNotFoundException)
			return Response.status(404).build();
		return Response.status(500).build();
	}
}
