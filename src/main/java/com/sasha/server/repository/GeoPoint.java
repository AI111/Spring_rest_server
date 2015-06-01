package com.sasha.server.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "geo_point")
public class GeoPoint {
    public enum PointType{SHOWPLACE,HOTEL,SHOP,RESTAURAN,MUSEUM,CAFE};

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="point_id",unique = true, nullable = false)
    private long id;

    @Column(name="title")
    private String title;

    @Column(name="type")
    @Enumerated(EnumType.ORDINAL)
    private PointType type;

    @Column(name="description")
    private String description;

    @Column(name="text")
    private String text;

    @ElementCollection
    @CollectionTable(name="imeges", joinColumns=@JoinColumn(name="id"))
    @Column(name="galery")
    private Set<String> galery;

    @Column(name="audio")
    private String audio;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="guide_id")
    private Guide guide;

    public GeoPoint() {
    }

    public GeoPoint(String title, PointType type, String description, String text, Set<String> galery, String audio, double latitude, double longitude) {
        this.title = title;
        this.type = type;
        this.description = description;
        this.text = text;
        this.galery = galery;
        this.audio = audio;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PointType getType() {
        return type;
    }

    public void setType(PointType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Set<String> getGalery() {
        return galery;
    }

    public void setGalery(Set<String> galery) {
        this.galery = galery;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
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

    public long getId() {
        return id;
    }

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    @Override
    public String toString() {
        return "GeoPoint{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", text='" + text + '\'' +
                ", galery=" + galery +
                ", audio='" + audio + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                "}\n";
    }
}
