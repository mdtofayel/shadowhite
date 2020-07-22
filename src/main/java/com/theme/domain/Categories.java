package com.theme.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "catagories")
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "parent_id")
	private int parentId;

	private String name;
	private String slug;
	private String status;
	private Date created;
	private Date modified;
	@Column (name ="multiple_price_extended")
	private int multiplePriceExtended;
	@Column (name ="price_extended")
	private int priceExtended;
	@Column( name = "extended_price_extended")
	private int extendedPriceExtended;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public int getMultiplePriceExtended() {
		return multiplePriceExtended;
	}

	public void setMultiplePriceExtended(int multiplePriceExtended) {
		this.multiplePriceExtended = multiplePriceExtended;
	}

	public int getPriceExtended() {
		return priceExtended;
	}

	public void setPriceExtended(int priceExtended) {
		this.priceExtended = priceExtended;
	}

	public int getExtendedPriceExtended() {
		return extendedPriceExtended;
	}

	public void setExtendedPriceExtended(int extendedPriceExtended) {
		this.extendedPriceExtended = extendedPriceExtended;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", parentId=" + parentId + ", name=" + name + ", slug=" + slug + ", status="
				+ status + ", created=" + created + ", modified=" + modified + ", multiplePriceExtended="
				+ multiplePriceExtended + ", priceExtended=" + priceExtended + ", extendedPriceExtended="
				+ extendedPriceExtended + "]";
	}

}
