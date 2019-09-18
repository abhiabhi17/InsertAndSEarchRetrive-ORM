package com.nit.exception;

import javax.ws.rs.core.Response.Status;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorResponse {
	
	private Integer statusCode;
	private String statusMsg;
	

	public Integer getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}


	public String getStatusMsg() {
		return statusMsg;
	}


	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}


	@Override
	public String toString() {
		return "ErrorResponse [statusCode=" + statusCode + ", statusMsg=" + statusMsg + "]";
	}


	public void setStatusCode(Status badRequest) {
		// TODO Auto-generated method stub
		
	}

	
	

}
