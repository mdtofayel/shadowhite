package com.theme.domain;

import javax.persistence.*;


@Entity
@Table(name = "digital_item_compatable_browsers")
public class DigitalItemCompatableBrowsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @Column(name = "browsers")
    private String browsers;

    @ManyToOne
    @JoinColumn(name = "COMPATABLE_BROWSER_ID")
    private CompatableBrowsers compatableBrowsers;


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

    public String getBrowsers() {
        return browsers;
    }

    public void setBrowsers(String browsers) {
        this.browsers = browsers;
    }

    public CompatableBrowsers getCompatableBrowsers() {
        return compatableBrowsers;
    }

    public void setCompatableBrowsers(CompatableBrowsers compatableBrowsers) {
        this.compatableBrowsers = compatableBrowsers;
    }

    @Override
    public String toString() {
        return "DigitalItemCompatableBrowsers{" +
                "id=" + id +
                ", digitalItems=" + digitalItems +
                ", browsers='" + browsers + '\'' +
                '}';
    }
}
