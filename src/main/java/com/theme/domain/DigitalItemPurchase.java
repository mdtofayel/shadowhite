package com.theme.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "digital_item_purchase")
public class DigitalItemPurchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "DIGITAL_ITEM_ID")
	private DigitalItems digitalItems;

	@Column(name = "IS_SIX_MONTH")
	private String isASixMonth;

	@Column(name = "created")
	private Date created;

	@Column(name = "modified")
	private Date modified;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DigitalItems getDigitalItems() {
		return digitalItems;
	}

	public void setDigitalItems(DigitalItems digitalItems) {
		this.digitalItems = digitalItems;
	}

	public String getCount() {
		return isASixMonth;
	}

	public void setCount(String isASixMonth) {
		this.isASixMonth = isASixMonth;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Override
	public String toString() {
		return "DigitalItemPurchase{" + "id=" + id + ", digitalItems=" + digitalItems + ", userId=" + ", count="
				+ isASixMonth + ", created=" + created + ", modified=" + modified + '}';
	}
}
