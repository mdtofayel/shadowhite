package com.threeD.domain;

import javax.persistence.*;

/**
 * Created by Tofayel Ahmed on  5/29/17.
 */
@Entity
@Table(name = "digital_item_rating")
public class DigitalItemRating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @Column(name = "rating", precision = 6)
    private float rating;


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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "DigitalItemRating{" +
                "id=" + id +
                ", digitalItems=" + digitalItems +
                ", rating=" + rating +
                '}';
    }
}
