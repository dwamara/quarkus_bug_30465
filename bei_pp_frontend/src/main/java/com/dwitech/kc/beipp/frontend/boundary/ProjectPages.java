package com.dwitech.kc.beipp.frontend.boundary;

import io.smallrye.common.annotation.Blocking;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.*;


@Path("projects")
@Blocking
public class ProjectPages {
    @RestClient ProjectClient client;

    @GET
    @Path("{code}")
    public void retrieve(@PathParam("code") final String code) {
        GatewayResponse response = client.retrieve(code);
//        if (response.success) {
//            template = Templates.display_details().data("project", response.entity);
//        } else {
//        }
    }
}