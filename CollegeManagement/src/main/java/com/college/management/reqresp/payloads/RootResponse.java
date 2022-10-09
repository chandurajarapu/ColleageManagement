/**
 * 
 */
package com.college.management.reqresp.payloads;

import java.io.Serializable;

/**
 * @author SHANTHI R
 * DATE : 07-Oct-2022
 * EMPID : 200
 */
public class RootResponse implements Serializable{
	
	private String statusCode;
	private String statusmessage;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusmessage() {
		return statusmessage;
	}
	public void setStatusmessage(String statusmessage) {
		this.statusmessage = statusmessage;
	}
}
