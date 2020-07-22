package com.theme.domain;

/**
 * Created by Tofayel Ahmed on  5/26/17.
 */

import javax.persistence.*;

@Entity
@Table(name = "digital_item_file_included")
public class DigitalItemFileIncluded {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;





    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @ManyToOne
    @JoinColumn(name = "FILE_INCLUDED_ID")
    private FileIncluded fileIncluded;


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

    public FileIncluded getFileIncluded() {
        return fileIncluded;
    }

    public void setFileIncluded(FileIncluded fileIncluded) {
        this.fileIncluded = fileIncluded;
    }


    @Override
    public String toString() {
        return "DigitalItemFileIncluded{" +
                "id=" + id +
                ", digitalItems=" + digitalItems +

                '}';
    }
}
