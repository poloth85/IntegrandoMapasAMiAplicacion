package net.copaba.integrandomapasamiaplicacion;

/**
 * Created by Polo on 22/09/16.
 */

public class Place {
    private String name;
    private String latitude;
    private String longitude;

    public Place(String name, String latitude, String longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
