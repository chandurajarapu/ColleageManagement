package com.college.management.reqresp.payloads;

import java.io.Serializable;
import java.util.Date;

public class LectureResponse extends RootResponse implements Serializable {
	private Object Response;

	public Object getResponse() {
		return Response;
	}

	public void setResponse(Object response) {
		Response = response;
	}
	
}
