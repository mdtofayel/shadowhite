package com.threeD.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Tofayel Ahmed on  5/23/17.
 */

@Entity
@Table(name = "digital_item_comments")
public class DigitalItemComments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private String comment;

    private String status;

    @Column(name = "created")
    private Date created;

    @Column(name = "modified")
    private Date modified;


    @OneToMany(mappedBy = "digitalItemComments", cascade = CascadeType.REMOVE)
    private List<DigitalItemCommentChild> digitalItemCommentChildList;


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


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<DigitalItemCommentChild> getDigitalItemCommentChildList() {
        return digitalItemCommentChildList;
    }

    public void setDigitalItemCommentChildList(List<DigitalItemCommentChild> digitalItemCommentChildList) {
        this.digitalItemCommentChildList = digitalItemCommentChildList;
    }

    @Override
    public String toString() {
        return "DigitalItemComments{" +
                "id=" + id +
                ", digitalItems=" + digitalItems +
                ", users=" + user +
                ", comment='" + comment + '\'' +
                ", status='" + status + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
