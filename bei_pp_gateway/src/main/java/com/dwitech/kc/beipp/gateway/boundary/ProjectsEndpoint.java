package com.dwitech.kc.beipp.gateway.boundary;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;

import java.sql.Timestamp;

import static javax.ws.rs.core.Response.Status.*;

@RequestScoped
@Path("projects")
public class ProjectsEndpoint {
	@GET
	@Path("{code}")
	public GatewayResponse retrieve(@PathParam("code") final String code) {
		GatewayResponse response;
		final var uiEntity = new UIProject();
		uiEntity.code = "SOme code";
		uiEntity.title = "entity.title";
		uiEntity.statusUpdate = "entity.statusUpdate";
		uiEntity.observation = "entity.observation";
		uiEntity.dateCreated = new Timestamp(System.currentTimeMillis());
		response = new GatewayResponse.Builder().withEntity(uiEntity).build(FOUND);
		return response;
	}
}