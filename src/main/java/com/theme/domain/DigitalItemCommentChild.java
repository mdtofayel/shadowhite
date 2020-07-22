package com.theme.domain;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "digital_item_comment_child")
public class DigitalItemCommentChild {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "digital_item_comment_id")
    private DigitalItemComments digitalItemComments;


    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;


    private String comment;

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

    public DigitalItemComments getDigitalItemComments() {
        return digitalItemComments;
    }

    public void setDigitalItemComments(DigitalItemComments digitalItemComments) {
        this.digitalItemComments = digitalItemComments;
    }

//
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    @Override
    public String toString() {
        return "DigitalItemCommentChild{" +
                "id=" + id +
                ", digitalItemComments=" + digitalItemComments +
                ", comment='" + comment + '\'' +
                ", status='" + status + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
