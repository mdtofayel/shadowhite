package com.theme.domain;

import javax.persistence.*;

/**
 * Created by Tofayel Ahmed on  8/13/17.
 */
@Entity
@Table(name = "digital_item_frameworks")
public class DigitalItemFrameworks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @ManyToOne
    @JoinColumn(name = "FRAMEWORKS_ID")
    private Frameworks frameworks;


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

    public Frameworks getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(Frameworks frameworks) {
        this.frameworks = frameworks;
    }
}
