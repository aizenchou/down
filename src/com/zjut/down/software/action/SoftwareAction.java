package com.zjut.down.software.action;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

import com.zjut.down.software.dao.ISoftwareDAO;
import com.zjut.down.software.dao.Software;
import com.zjut.down.software.dao.impl.SoftwareDAO;

import java.text.*;
/**
 * 
 * @author Aizen
 */
public class SoftwareAction extends ActionSupport implements
		ServletRequestAware, ServletContextAware, ServletResponseAware {
	private HttpServletRequest request;
	private HttpServletResponse response;
	private ServletConfig config;
	private ServletContext context;
	private ISoftwareDAO isoftwaredao;
	private Software software;

	public String saveSoftware() throws Exception {
		request.setCharacterEncoding("UTF-8");
		String result = "";
		software.setCount(2);
		software.setPubid(8);
		software.setAddress("aaaaaaaaaaa");
		if (isoftwaredao.save(software)) {
			result = "success";
			
		} else {
			result = "error";
		}
		return result;
	}
	
	
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		response = arg0;
	}

	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
	
	/**
	 * @return the software
	 */
	public Software getSoftware() {
		return software;
	}

	/**
	 * @param software
	 *            the software to set
	 */
	public void setSoftware(Software software) {
		this.software = software;
	}
	
	/**
	 * @return the isoftwaredao
	 */
	public ISoftwareDAO getIsoftwaredao() {
		return isoftwaredao;
	}

	/**
	 * @param isoftwaredao
	 *            the isoftwaredao to set
	 */
	public void setIsoftwaredao(ISoftwareDAO isoftwaredao) {
		this.isoftwaredao = isoftwaredao;
	}
}
