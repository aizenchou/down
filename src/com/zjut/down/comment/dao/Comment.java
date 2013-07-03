package com.zjut.down.comment.dao;

import java.util.Date;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private CommentId id;
	private String email;
	private String cmtdetail;
	private Date cmttime;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(CommentId id, String email, Date cmttime) {
		this.id = id;
		this.email = email;
		this.cmttime = cmttime;
	}

	/** full constructor */
	public Comment(CommentId id, String email, String cmtdetail, Date cmttime) {
		this.id = id;
		this.email = email;
		this.cmtdetail = cmtdetail;
		this.cmttime = cmttime;
	}

	// Property accessors

	public CommentId getId() {
		return this.id;
	}

	public void setId(CommentId id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCmtdetail() {
		return this.cmtdetail;
	}

	public void setCmtdetail(String cmtdetail) {
		this.cmtdetail = cmtdetail;
	}

	public Date getCmttime() {
		return this.cmttime;
	}

	public void setCmttime(Date cmttime) {
		this.cmttime = cmttime;
	}

}