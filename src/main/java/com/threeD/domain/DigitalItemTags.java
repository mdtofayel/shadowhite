package com.threeD.domain;

import javax.persistence.*;

/**
 * Created by Tofayel Ahmed on  5/25/17.
 */

@Entity
@Table(name = "digital_item_tags")
public class DigitalItemTags {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "tags_name")
    String tagsName;

    @ManyToOne
    @JoinColumn(name = "digital_item_id")
    private DigitalItems digitalItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTagsName() {
        return tagsName;
    }

    public void setTagsName(String tagsName) {
        this.tagsName = tagsName;
    }

    public DigitalItems getDigitalItems() {
        return digitalItems;
    }

    public void setDigitalItems(DigitalItems digitalItems) {
        this.digitalItems = digitalItems;
    }

    @Override
    public String toString() {
        return "DigitalItemTags{" +
                "id=" + id +
                ", tagsName='" + tagsName + '\'' +
                ", digitalItems=" + digitalItems +
                '}';
    }
}
