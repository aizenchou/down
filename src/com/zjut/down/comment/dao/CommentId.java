package com.zjut.down.comment.dao;

/**
 * CommentId entity. @author MyEclipse Persistence Tools
 */

public class CommentId implements java.io.Serializable {

	// Fields

	private Integer cmtid;
	private Integer softid;

	// Constructors

	/** default constructor */
	public CommentId() {
	}

	/** full constructor */
	public CommentId(Integer cmtid, Integer softid) {
		this.cmtid = cmtid;
		this.softid = softid;
	}

	// Property accessors

	public Integer getCmtid() {
		return this.cmtid;
	}

	public void setCmtid(Integer cmtid) {
		this.cmtid = cmtid;
	}

	public Integer getSoftid() {
		return this.softid;
	}

	public void setSoftid(Integer softid) {
		this.softid = softid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CommentId))
			return false;
		CommentId castOther = (CommentId) other;

		return ((this.getCmtid() == castOther.getCmtid()) || (this.getCmtid() != null
				&& castOther.getCmtid() != null && this.getCmtid().equals(
				castOther.getCmtid())))
				&& ((this.getSoftid() == castOther.getSoftid()) || (this
						.getSoftid() != null && castOther.getSoftid() != null && this
						.getSoftid().equals(castOther.getSoftid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCmtid() == null ? 0 : this.getCmtid().hashCode());
		result = 37 * result
				+ (getSoftid() == null ? 0 : this.getSoftid().hashCode());
		return result;
	}

}