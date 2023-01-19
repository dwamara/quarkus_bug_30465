package com.dwitech.kc.beipp.frontend.boundary;


import static javax.json.bind.JsonbBuilder.create;

public class GatewayResponse {
	public boolean success = false;
	public String errorMessage;
	public String internalCode;
	public int httpCode;
	public Object entity;

	@Override public String toString() { return create().toJson(this); }
}