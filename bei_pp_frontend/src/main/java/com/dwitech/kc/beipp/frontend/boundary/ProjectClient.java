package com.dwitech.kc.beipp.frontend.boundary;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import static javax.ws.rs.core.MediaType.MULTIPART_FORM_DATA;


@Path("projects")
@RegisterRestClient
public interface ProjectClient {
	@GET
	@Path("{code}")
	GatewayResponse retrieve(@PathParam("code") final String code);
}