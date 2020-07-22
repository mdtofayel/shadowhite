package com.threeD.domain;

import javax.persistence.*;


@Entity
@Table(name = "digital_item_created_in")
public class DigitalItemCreateIn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "created_in_id")
    private CreateIn createIn;


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

    public String getCreateInName() {
        return name;
    }

    public void setCreateInName(String createIn) {
        this.name = createIn;
    }

    public CreateIn getCreateIn() {
        return createIn;
    }

    public void setCreateIn(CreateIn createIn) {
        this.createIn = createIn;
    }

    @Override
    public String toString() {
        return "DigitalItemCompatableBrowsers{" +
                "id=" + id +
                ", digitalItems=" + digitalItems +
                ", browsers='" + name + '\'' +
                '}';
    }
}
