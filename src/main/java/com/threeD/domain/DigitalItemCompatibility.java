package com.threeD.domain;

import javax.persistence.*;

/**
 * Created by Tofayel Ahmed on  5/26/17.
 */
@Entity
@Table(name = "digital_item_compatibility")
public class DigitalItemCompatibility {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @Column(name = "compatable_with")
    private String compatbleWith;

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

    public String getCompatbleWith() {
        return compatbleWith;
    }

    public void setCompatbleWith(String compatbleWith) {
        this.compatbleWith = compatbleWith;
    }

    @Override
    public String toString() {
        return "DigitalItemCompatibility{" +
                "id=" + id +
                ", digitalItems=" + digitalItems +
                ", compatbleWith='" + compatbleWith + '\'' +
                '}';
    }
}
