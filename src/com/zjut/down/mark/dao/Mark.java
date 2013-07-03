package com.zjut.down.mark.dao;

/**
 * Mark entity. @author MyEclipse Persistence Tools
 */

public class Mark implements java.io.Serializable {

	// Fields

	private Integer softid;
	private Double score;

	// Constructors

	/** default constructor */
	public Mark() {
	}

	/** full constructor */
	public Mark(Double score) {
		this.score = score;
	}

	// Property accessors

	public Integer getSoftid() {
		return this.softid;
	}

	public void setSoftid(Integer softid) {
		this.softid = softid;
	}

	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}