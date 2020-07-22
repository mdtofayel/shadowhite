package com.theme.domain;

import javax.persistence.*;

/**
 * Created by Tofayel Ahmed on  7/7/17.
 */
@Entity
@Table(name = "digital_item_software_versions")
public class DigitalItemSoftwareVersions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @ManyToOne
    @JoinColumn(name = "SOFTWARE_VERSIONS_ID")
    private SoftwareVersions softwareVersions;

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

    public SoftwareVersions getSoftwareVersions() {
        return softwareVersions;
    }

    public void setSoftwareVersions(SoftwareVersions softwareVersions) {
        this.softwareVersions = softwareVersions;
    }

    @Override
    public String toString() {
        return "DigitalItemSoftwareVersions{" +
                "id=" + id +
                ", digitalItems=" + digitalItems +
                ", softwareVersions=" + softwareVersions +
                '}';
    }
}
