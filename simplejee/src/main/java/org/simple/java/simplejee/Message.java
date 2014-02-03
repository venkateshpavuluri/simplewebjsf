package org.simple.java.simplejee;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="message",eager=true)
@RequestScoped
public class Message {
	
	
	public String message="Hello Venky";

	/**
	 * @return the message
	 */
	public String getMessage() {
		
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

}
