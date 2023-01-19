package com.dwitech.kc.beipp.gateway.boundary;


import javax.ws.rs.core.Response.Status;

import static javax.json.bind.JsonbBuilder.create;

public class GatewayResponse {
	public boolean success = false;
	public String errorMessage;
	public String internalCode;
	public int httpCode;
	public Object entity;

	public static class Builder {
		private boolean success = false;
		private String errorMessage;
		private String internalCode;
		private Status status;
		private Object entity;

		public Builder withErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
			return this;
		}

		public Builder withErrorCode(String internalCode) {
			this.internalCode = internalCode;
			return this;
		}

		public Builder withEntity(Object entity) {
			this.entity = entity;
			this.success = true;
			return this;
		}

		public GatewayResponse build(Status status) {
			GatewayResponse response = new GatewayResponse();
			response.success = this.success;
			response.errorMessage = this.errorMessage;
			response.internalCode = this.internalCode;
			response.httpCode = status.getStatusCode();
			response.entity = this.entity;
			return response;
		}

		public GatewayResponse build() {
			GatewayResponse response = new GatewayResponse();
			response.success = this.success;
			response.errorMessage = this.errorMessage;
			response.internalCode = this.internalCode;
			response.httpCode = status.getStatusCode();
			response.entity = this.entity;
			return response;
		}
	}

	@Override public String toString() { return create().toJson(this); }
}