package com.labcheckin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.labcheckin.dao.PersonManage;
import com.labcheckin.entity.User;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{
	
	private String userName;
	private String userPassword;
	private PersonManage personManage;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public void setPersonManage(PersonManage personManage) {
		this.personManage = personManage;
	}
	
	
	public String loginCheck(){
		String page = "fail";
		User user = new User();
		user = personManage.checkUser(userName, userPassword);
		if(user != null){
			page = "success";
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			if(session.getAttribute("loginUser") != null){
				session.removeAttribute("loginUser");
			}
			session.setAttribute("loginUser", user);
		}
		return page;
	}

}
