package com.theme.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "compatable_browsers")
public class CompatableBrowsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @ManyToOne
    @JoinColumn(name = "catagories_id")
    private Categories catagories;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "status")
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "slug", length = 150)
    private String slug;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Categories getCatagories() {
        return catagories;
    }

    public void setCatagories(Categories catagories) {
        this.catagories = catagories;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String toString() {
        return "CompatableBrowsers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}