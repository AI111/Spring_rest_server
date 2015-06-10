package com.sasha.server.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.*;

/**
 * Created by sasha on 12/21/14.
 */
@Entity
@Table(name = "guides")
public class Guide {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="guide_id",unique = true, nullable = false)
    private long id;

    @Column(name="locale")
    Locale locale;

    @Column(name="name")
    private String  name;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @Column(name="description",length = 2048)
    private String description;

    @Column(name="imgUrl")
    private String imgUrl;

    @Column(name="fullImgUrl")
    private String fullImgUrl;

    @Column(name="rating")
    private float rating;

    @Column(name="mapCash")
    private String mapCash;

    @Column(name="dataCash")
    private String dataCash;

    @Column(name="changed")
    private Date changed;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,mappedBy ="guide")
    private List<GeoPoint> points;//= new HashSet<GeoPoint>();

    public Guide(){
        super();
    }

    public Guide(Locale locale, String name, double latitude, double longitude, String description, String imgUrl, String fullImgUrl,
                 float rating, String mapCash, String dataCash, Date changed) {
        this.locale = locale;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.imgUrl = imgUrl;
        this.fullImgUrl = fullImgUrl;
        this.rating = rating;
        this.mapCash = mapCash;
        this.dataCash = dataCash;
        this.changed = changed;
    }

    public Guide(long id, Locale locale, String name, double latitude, double longitude, String description, String imgUrl,
                 String fullImgUrl, float rating, String mapCash, String dataCash, Date changed) {
        this.id = id;
        this.locale = locale;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.imgUrl = imgUrl;
        this.fullImgUrl = fullImgUrl;
        this.rating = rating;
        this.mapCash = mapCash;
        this.dataCash = dataCash;
        this.changed = changed;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getFullImgUrl() {
        return fullImgUrl;
    }

    public void setFullImgUrl(String fullImgUrl) {
        this.fullImgUrl = fullImgUrl;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getMapCash() {
        return mapCash;
    }

    public void setMapCash(String mapCash) {
        this.mapCash = mapCash;
    }

    public String getDataCash() {
        return dataCash;
    }

    public void setDataCash(String dataCash) {
        this.dataCash = dataCash;
    }

    public Date getChanged() {
        return changed;
    }

    public void setChanged(Date changed) {
        this.changed = changed;
    }

    public List<GeoPoint> getPoints() {
        return points;
    }

    public void setPoints(List<GeoPoint> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Guide{" +
                "id=" + id +
                ", locale=" + locale +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", description='" + description + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", fullImgUrl='" + fullImgUrl + '\'' +
                ", rating=" + rating +
                ", mapCash='" + mapCash + '\'' +
                ", dataCash='" + dataCash + '\'' +
                ", changed=" + changed +
                ", points=" + points +
                "}\n";
    }
}
