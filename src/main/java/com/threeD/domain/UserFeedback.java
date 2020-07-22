package com.threeD.domain;

import javax.persistence.*;

@Entity
@Table(name = "user_feedback")
public class UserFeedback {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
	public int id;	
	 
	@Column(name = "digital_items_url")
	public String digitalItemsUrl;
	
	@Column(name = "email_addr")
	public String emailAddr;
	
	@Column(name = "email_body")
	public String emailBody;
	
	@Column(name = "priority")
	public String priority;
	
	@Column(name = "status")
	public String status;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getdigitalItemsUrl() {
		return digitalItemsUrl;
	}

	public void setdigitalItemsUrl(String digitalItemsUrl) {
		this.digitalItemsUrl = digitalItemsUrl;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserFeedback [id=" + id + ", idgitalItemsUrl=" + digitalItemsUrl + ", emailAddr=" + emailAddr
				+ ", emailBody=" + emailBody + ", priority=" + priority + "]";
	}
	
	
}
