package com.college.management.reqresp.payloads;

import java.io.Serializable;

public class StudentResponse extends RootResponse implements Serializable {
	
	private Object response;

	

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}


	
}  
