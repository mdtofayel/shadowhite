package com.theme.solutionbankDomain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solution_bank")
public class SolutionBank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "name", length = 20)
	private String Name;
	
	@Column(name = "slogan", length = 100)
	private String slogan;
	
	@Column(name = "db_name", length = 100)
	private String dbName;
	
	@Column(name = "db_username", length = 100)
	private String dbUsername;
	
	@Column(name = "db_password", length = 100)
	private String dbPassword;
	
	@Column(name = "fa_icon", length = 50)
	private String faIcon;
	
	@Column(name = "list_bg", length = 20)
	private String listBg;
	
	@Column(name = "icon_bg", length = 20)
	private String iconBg;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public String getFaIcon() {
		return faIcon;
	}

	public void setFaIcon(String faIcon) {
		this.faIcon = faIcon;
	}

	public String getListBg() {
		return listBg;
	}

	public void setListBg(String listBg) {
		this.listBg = listBg;
	}

	public String getIconBg() {
		return iconBg;
	}

	public void setIconBg(String iconBg) {
		this.iconBg = iconBg;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
