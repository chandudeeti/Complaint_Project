package com.hib.complaint;

import java.sql.Timestamp;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
@ManagedBean(name = "e")
@SessionScoped
@Entity
@Table(name = "Resolve")
public class ResolveE {

	@Id
	@Column(name = "ResolveID")
	@GenericGenerator(name = "custom_generator", strategy = "com.hib.complaint.ResIdGenerator")
	@GeneratedValue(generator = "custom_generator")
	private String resolveID;
	@JoinColumn
	 @Column(name = "ComplaintID")
	 private String complaintID;

	@Column(name = "ComplaintDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date complaintDate;

	@Column(name = "ResolveDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date resolveDate;

	@Column(name = "ResolvedBy")
	private String resolvedBy;

	@Column(name = "Comments")
	private String comments;

	@OneToOne(targetEntity = Complaint.class)
	private Complaint complaint;

	public String getResolveID() {
		return resolveID;
	}

	public void setResolveID(String resolveID) {
		this.resolveID = resolveID;
	}

	 public String getComplaintID() {
	 return complaintID;
	 }
	
	 public void setComplaintID(String complaintID) {
	 this.complaintID = complaintID;
	 }

	public String getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Complaint getComplaint() {
		return complaint;
	}

	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}

	public Date getComplaintDate() {
		return complaintDate;
	}

	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}

	public Date getResolveDate() {
		return resolveDate;
	}

	public void setResolveDate(Date resolveDate) {
		this.resolveDate = resolveDate;
	}

	@Override
	public String toString() {
		return "Resolve [resolveID=" + resolveID + ", complaintDate=" + complaintDate + ", resolveDate=" + resolveDate
				+ ", resolvedBy=" + resolvedBy + ", comments=" + comments + ", complaint=" + complaint + "]";
	}

}
