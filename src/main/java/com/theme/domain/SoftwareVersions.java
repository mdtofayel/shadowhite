package com.theme.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "software_versions")
public class SoftwareVersions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @ManyToOne
    @JoinColumn(name = "catagories_id")
    private Categories catagories;

    @Column(name = "slug")
    private String slug;

    private String version;

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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


    @Override
    public String toString() {
        return "SoftwareVersions{" +
                "id=" + id +
                ", version='" + version + '\'' +
                ", status='" + status + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
