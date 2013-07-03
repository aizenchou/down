package com.zjut.down.software.dao;

import java.util.Date;

/**
 * Software entity. @author MyEclipse Persistence Tools
 */

public class Software implements java.io.Serializable {

	// Fields

	private Integer softid;
	private String title;
	private String typename;
	private String tags;
	private String language;
	private double filesize;
	private Date dealtime;
	private String installenv;
	private Integer pubid;
	private Integer count;
	private String address;
	private String intro;

	// Constructors

	/** default constructor */
	public Software() {
	}

	/** minimal constructor */
	public Software(Integer softid, String title, String typename,
			double filesize, Date dealtime, Integer pubid, Integer count,
			String address, String intro) {
		this.softid = softid;
		this.title = title;
		this.typename = typename;
		this.filesize = filesize;
		this.dealtime = dealtime;
		this.pubid = pubid;
		this.count = count;
		this.address = address;
		this.intro = intro;
	}

	/** full constructor */
	public Software(Integer softid, String title, String typename, String tags,
			String language, double filesize, Date dealtime, String installenv,
			Integer pubid, Integer count, String address, String intro) {
		this.softid = softid;
		this.title = title;
		this.typename = typename;
		this.tags = tags;
		this.language = language;
		this.filesize = filesize;
		this.dealtime = dealtime;
		this.installenv = installenv;
		this.pubid = pubid;
		this.count = count;
		this.address = address;
		this.intro = intro;
	}

	// Property accessors

	public Integer getSoftid() {
		return this.softid;
	}

	public void setSoftid(Integer softid) {
		this.softid = softid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getFilesize() {
		return this.filesize;
	}

	public void setFilesize(double filesize) {
		this.filesize = filesize;
	}

	public Date getDealtime() {
		return this.dealtime;
	}

	public void setDealtime(Date dealtime) {
		this.dealtime = dealtime;
	}

	public String getInstallenv() {
		return this.installenv;
	}

	public void setInstallenv(String installenv) {
		this.installenv = installenv;
	}

	public Integer getPubid() {
		return this.pubid;
	}

	public void setPubid(Integer pubid) {
		this.pubid = pubid;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

}