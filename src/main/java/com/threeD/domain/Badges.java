package com.threeD.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Tofayel Ahmed on   6/7/17.
 */
@Entity
@Table(name = "badges")
public class Badges {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 20)
    private String name;


    @Column(name = "created")
    private Date created;

    @Column(name = "modified",nullable = true)   
    private Date modified;


    public Badges(String name, Date created, Date modified) {
        this.name = name;
        this.created = created;
        this.modified = modified;
    }

    public Badges() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Badges{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
