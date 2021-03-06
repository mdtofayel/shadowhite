package com.threeD.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "digital_items")
public class DigitalItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER_PROFILE_INFO_ID")
    private UserProfileInfo userProfileInfo;

    @ManyToOne
    @JoinColumn(name = "CATAGORIES_ID",referencedColumnName="id")
    private Categories catagories;

    @ManyToOne
    @JoinColumn(name = "CATAGORIES_CHILD_ID",referencedColumnName="id")
    private Categories catagoriesChild;

    @Column(name = "DOCUMENTATION")
    private String documentation;

    @Column(name = "high_resolution")
    private String highResolution;

    @NotNull(message = "Must provide a price")
//  @Range(min=0, max=200, message = "Price should be 8 to 200 taka")

    @Column(name = "price")
    private Integer price = 0;

//    @Range(min=8, max=1000, message = "Price should be 8 to 1000 taka")

    @Column(name = "multiple_price")
    private Integer multiplePrice = 0;

//    @Range(min=8,max=2000, message = "Price should be 8 to 2000 taka")
//    @Column(name = "extended_price")

    @Column(name = "extended_price")
    private Integer extendedPrice =0;

//    @NotNull(message = "Must provide a service price")
//    @Range(min=8, max=400, message = "Price should be 8 to 400 taka")

    @Column(name = "six_month_support_price")
    private Integer sixMonthSupportPrice = 0;

    @Column(name="status")
    private String status;

    @Column(name="cause_of_approve")
    private String causeOfApprove;


    @NotNull(message = "Must provide is animate")
    @Column(name="animate", length = 4)
    private String animate;

    @NotNull(message = "Must provide is low poly")
    @Column(name="low_poly", length = 4)
    private String lowPoly;

    @NotNull(message = "Must provide is materials")
    @Column(name="materials", length = 4)
    private String materials;

    @NotNull(message = "Must provide is rigged")
    @Column(name="rigged", length = 4)
    private String rigged;

    @NotNull(message = "Must provide is tectured")
    @Column(name="tectured", length = 4)
    private String tectured;

    @NotNull(message = "Must provide is uv layout")
    @Column(name="uv_layout", length = 4)
    private String uvLayout;

    @NotNull(message = "Must provide geo metry")
    @Column(name="geo_metry", length = 50)
    private String geoMetry;

    @NotNull(message = "Must provide poly count")
    @Column(name="poly_count", length = 200)
    private String polyCount;


    @OneToMany(mappedBy = "digitalItems", cascade = CascadeType.REMOVE)
    private List<DigitalItemPurchase> digitalItemPurchases;

    @OneToMany(mappedBy = "digitalItems", cascade = CascadeType.REMOVE)
    private List<DigitalItemComments> digitalItemComments;

    @OneToMany(mappedBy = "digitalItems", cascade = CascadeType.REMOVE)
    private List<DigitalItemTags> digitalItemTags;

    @OneToMany(mappedBy = "digitalItems", cascade = CascadeType.REMOVE)
    private List<DigitalItemCreateIn> digitalItemCompatableBrowsersList;

    @OneToMany(mappedBy = "digitalItems", cascade = CascadeType.REMOVE)
    private List<DigitalItemCompatibility> digitalItemCompatibilityList;

    @OneToMany(mappedBy = "digitalItems", cascade = CascadeType.REMOVE)
    private List<DigitalItemFileIncluded> digitalItemFileIncludedList;


    @OneToMany(mappedBy = "digitalItems", cascade = CascadeType.REMOVE)
    private List<DigitalItemSupport> digitalItemSupportList;

    @OneToMany(mappedBy = "digitalItems", cascade = CascadeType.REMOVE)
    private List<DigitalItemRating> digitalItemRatingList;

    @OneToMany(mappedBy = "digitalItems",cascade = CascadeType.REMOVE)
    private List<DigitalItemVersions> digitalItemVersionsList;



    @Column(name = "long_description")
    private String lognDescription;

//    @Length(min = 3,max=5, message = "*Your password must have at least 3 characters")

    @Size(min=3,max = 100 ,message = "*Your Name must have at least 3 characters")
    @Column(name = "pname")
    private String pname;

    @Size(min=5,max = 255,message = "*Title must be unique and at least 5 character")
    @Column(name = "name")
    private String name;

    @Column(name = "slug")
    private String slug;

    @Size(min=5, max=500,message = "*Short description must be unique and 5 - 500 character")
    @Column(name = "DESCRIPTION")
    private String description;

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

    public String getAnimate() {
        return animate;
    }

    public void setAnimate(String animate) {
        this.animate = animate;
    }

    public String getLowPoly() {
        return lowPoly;
    }

    public void setLowPoly(String lowPoly) {
        this.lowPoly = lowPoly;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getRigged() {
        return rigged;
    }

    public void setRigged(String rigged) {
        this.rigged = rigged;
    }

    public String getTectured() {
        return tectured;
    }

    public void setTectured(String tectured) {
        this.tectured = tectured;
    }

    public String getUvLayout() {
        return uvLayout;
    }

    public void setUvLayout(String uvLayout) {
        this.uvLayout = uvLayout;
    }

    public String getGeoMetry() {
        return geoMetry;
    }

    public void setGeoMetry(String geoMetry) {
        this.geoMetry = geoMetry;
    }

    public String getPolyCount() {
        return polyCount;
    }

    public void setPolyCount(String polyCount) {
        this.polyCount = polyCount;
    }

    public String getCauseOfApprove() {
        return causeOfApprove;
    }

    public void setCauseOfApprove(String causeOfApprove) {
        this.causeOfApprove = causeOfApprove;
    }

    public Categories getCatagoriesChild() {
        return catagoriesChild;
    }

    public void setCatagoriesChild(Categories catagoriesChild) {
        this.catagoriesChild = catagoriesChild;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getMultiplePrice() {
        return multiplePrice;
    }

    public void setMultiplePrice(Integer multiplePrice) {
        this.multiplePrice = multiplePrice;
    }

    public Integer getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(Integer extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public UserProfileInfo getUserProfileInfo() {
        return userProfileInfo;
    }

    public void setUserProfileInfo(UserProfileInfo userProfileInfo) {
        this.userProfileInfo = userProfileInfo;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getHighResolution() {
        return highResolution;
    }

    public void setHighResolution(String highResolution) {
        this.highResolution = highResolution;
    }



    public String getLognDescription() {
        return lognDescription;
    }

    public void setLognDescription(String lognDescription) {
        this.lognDescription = lognDescription;
    }




    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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


    public List<DigitalItemPurchase> getDigitalItemPurchases() {
        return digitalItemPurchases;
    }

    public void setDigitalItemPurchases(List<DigitalItemPurchase> digitalItemPurchases) {
        this.digitalItemPurchases = digitalItemPurchases;
    }

    public List<DigitalItemComments> getDigitalItemComments() {
        return digitalItemComments;
    }

    public void setDigitalItemComments(List<DigitalItemComments> digitalItemComments) {
        this.digitalItemComments = digitalItemComments;
    }

    public List<DigitalItemTags> getDigitalItemTags() {
        return digitalItemTags;
    }

    public void setDigitalItemTags(List<DigitalItemTags> digitalItemTags) {
        this.digitalItemTags = digitalItemTags;
    }


    public List<DigitalItemCreateIn> getDigitalItemCompatableBrowsersList() {
        return digitalItemCompatableBrowsersList;
    }

    public void setDigitalItemCompatableBrowsersList(List<DigitalItemCreateIn> digitalItemCompatableBrowsersList) {
        this.digitalItemCompatableBrowsersList = digitalItemCompatableBrowsersList;
    }

    public List<DigitalItemCompatibility> getDigitalItemCompatibilityList() {
        return digitalItemCompatibilityList;
    }

    public void setDigitalItemCompatibilityList(List<DigitalItemCompatibility> digitalItemCompatibilityList) {
        this.digitalItemCompatibilityList = digitalItemCompatibilityList;
    }

    public List<DigitalItemFileIncluded> getDigitalItemFileIncludedList() {
        return digitalItemFileIncludedList;
    }

    public void setDigitalItemFileIncludedList(List<DigitalItemFileIncluded> digitalItemFileIncludedList) {
        this.digitalItemFileIncludedList = digitalItemFileIncludedList;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<DigitalItemSupport> getDigitalItemSupportList() {
        return digitalItemSupportList;
    }

    public void setDigitalItemSupportList(List<DigitalItemSupport> digitalItemSupportList) {
        this.digitalItemSupportList = digitalItemSupportList;
    }


    public List<DigitalItemRating> getDigitalItemRatingList() {
        return digitalItemRatingList;
    }

    public void setDigitalItemRatingList(List<DigitalItemRating> digitalItemRatingList) {
        this.digitalItemRatingList = digitalItemRatingList;
    }

    public List<DigitalItemVersions> getDigitalItemVersionsList() {
        return digitalItemVersionsList;
    }

    public void setDigitalItemVersionsList(List<DigitalItemVersions> digitalItemVersionsList) {
        this.digitalItemVersionsList = digitalItemVersionsList;
    }

    public Integer getSixMonthSupportPrice() {
        return sixMonthSupportPrice;
    }

    public void setSixMonthSupportPrice(Integer sixMonthSupportPrice) {
        this.sixMonthSupportPrice = sixMonthSupportPrice;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Categories getCatagories() {
        return catagories;
    }

    public void setCatagories(Categories catagories) {
        this.catagories = catagories;
    }

    @Override
    public String toString() {
        return "DigitalItems{" +
                "id=" + id +
                ", documentation='" + documentation + '\'' +
                ", highResolution='" + highResolution + '\'' +
                ", price=" + price +
                ", multiplePrice=" + multiplePrice +
                ", extendedPrice=" + extendedPrice +
                ", sixMonthSupportPrice=" + sixMonthSupportPrice +
                ", status='" + status + '\'' +
                ", lognDescription='" + lognDescription + '\'' +
                ", pname='" + pname + '\'' +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
