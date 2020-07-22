package com.theme.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "digital_item_versions")
public class DigitalItemVersions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_ITEM_ID")
    private DigitalItems digitalItems;

    @Column(name = "change_log")
    private  String changeLog;

    @Column(name = "version_no")
    private  String versionNo;

    @Column(name = "PATH")
    private String path;

    @Column(name = "preview_url")
    private  String previewUrl;

    @Column(name = "video_url")
    private  String videoUrl;

    @Column(name="product_name")
    private String productName;

    @Column(name = "status")
    private  String status;

    @Column(name = "created")
    private Date created;

    @Column(name = "modified")
    private Date modified;


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

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getChangeLog() {
        return changeLog;
    }

    public void setChangeLog(String changeLog) {
        this.changeLog = changeLog;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "DigitalItemVersions{" +
                "id=" + id +
                ", digitalItemId=" + digitalItems +
                ", versionNo='" + versionNo + '\'' +
                ", path='" + path + '\'' +
                ", previewUrl='" + previewUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", status='" + status + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
