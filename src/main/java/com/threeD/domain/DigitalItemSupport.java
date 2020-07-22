package com.threeD.domain;

import javax.persistence.*;

/**
 * Created by Tofayel Ahmed on  5/29/17.
 */


@Entity
@Table(name = "digital_item_support")
public class DigitalItemSupport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @ManyToOne
    @JoinColumn(name = "support_id")
    private Support supportId;

    @Column(name = "status")
    private  String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DigitalItems getDigitalItemId() {
        return digitalItems;
    }

    public void setDigitalItemId(DigitalItems digitalItemId) {
        this.digitalItems = digitalItems;
    }

    public Support getSupportId() {
        return supportId;
    }

    public void setSupportId(Support supportId) {
        this.supportId = supportId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DigitalItemSupport{" +
                "id=" + id +
                ", digitalItemId=" + digitalItems +
                ", supportId=" + supportId +
                ", status='" + status + '\'' +
                '}';
    }
}
