package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * Created by sasha on 12/21/14.
 */
public class CityGuide {
    private int id;
    private String  name;
    private double latitude;
    private double longitude;
    private String description;
    private String imgUrl;
    private String fullImgUrl;
    private float rating;
    private String mapCash;
    private String dataCash;
    private Date changed;
    private Collection<CustomGeoPoint> points= new ArrayList<CustomGeoPoint>();

    public CityGuide(){
        super();
    }

    public CityGuide(int id, String name, double latitude, double longitude, String description, String imgUrl,
                     String fullImgUrl, float rating, String mapCash, String dataCash, Date changed) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setRating(byte rating) {
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

    public Collection<CustomGeoPoint> getPoints() {
        return points;
    }

    public void setPoints(Collection<CustomGeoPoint> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "CityGuide{" +
                "id=" + id +
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
                '}';
    }
}
