/**
 * 
 */
package org.simple.java.simplejee;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * @author Nag
 *
 */
@ManagedBean(name="helloworld",eager=true)
@RequestScoped
public class Example implements Serializable {
	public String active;
	public String userName;
	public String data;
	
	
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}
	public void helloWorld()
	{
		System.out.println("helloworld");
	}
	public String getHelloWorld()
	{
		return "helloWorld";
	}
	
	@ManagedProperty(value="#{message}")
	public Message messageBean;
	
	public String message;

	/**
	 * @param messageBean the messageBean to set
	 */
	public void setMessageBean(Message messageBean) {
		this.messageBean = messageBean;
	}
	/**
	 * @return the messageaaaaccc
	 */
	public String getMessage() {
		if(messageBean!=null)
		{
			message=messageBean.getMessage();
		}
		
		return message;
	}
	
	@ManagedProperty(value="#{param.pageId}")
	private String pageId;
	
	public String showPage()
	{
		String page=null;
		
		if(pageId.equals("1"))
		
			page="page1";
		if(pageId.equals("2"))
			page="page2";
		if(pageId.equals("3"))
			page="page3";
		
		return page;
		
	}
	/**
	 * @return the pageId
	 */
	public String getPageId() {
		return pageId;
	}
	/**
	 * @param pageId the pageId to set
	 */
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	
	
	
	
	
}
