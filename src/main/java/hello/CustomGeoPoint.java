package hello;

public class CustomGeoPoint {
    public CustomGeoPoint(String title, PointType type, String description, String text, String[] galery, String audio, double latitude, double longitude) {
        this.title = title;
        this.type = type;
        this.description = description;
        this.text = text;
        this.galery = galery;
        this.audio = audio;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    enum PointType{SHOWPLACE,HOTEL,SHOP,RESTAURAN,MUSEUM,CAFE};
    public String title;
    public PointType type;
    public String description;
    public String text;
    public String[] galery;
    public String audio;
    public double latitude;
    public double longitude;

}
