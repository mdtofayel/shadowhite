package com.theme.domain;

import javax.persistence.*;

/**
 * Created by Tofayel Ahmed on  8/13/17.
 */

@Entity
@Table(name = "digital_item_compatible_with")
public class DigitalItemCompatibleWith {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @ManyToOne
    @JoinColumn(name = "COMPATIBLE_WITH_ID")
    private CompatibleWith compatibleWith;


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

    public CompatibleWith getCompatibleWith() {
        return compatibleWith;
    }

    public void setCompatibleWith(CompatibleWith compatibleWith) {
        this.compatibleWith = compatibleWith;
    }
}
