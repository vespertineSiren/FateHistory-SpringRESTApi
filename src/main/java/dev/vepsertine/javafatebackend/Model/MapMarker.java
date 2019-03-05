package dev.vepsertine.javafatebackend.Model;

import javax.persistence.*;

@Entity
@Table(name = "mapmarker")
public class MapMarker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mapmarkerid;

    private String title, snippet;
    private long latitude, longtitude;

    //Many to One
    private Fate fate;

    //Many to One
    private Historical historical;

    public MapMarker(){}

    public long getMapmarkerid() {
        return mapmarkerid;
    }

    public void setMapmarkerid(long mapmarkerid) {
        this.mapmarkerid = mapmarkerid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(long longtitude) {
        this.longtitude = longtitude;
    }

    public Fate getFate() {
        return fate;
    }

    public void setFate(Fate fate) {
        this.fate = fate;
    }

    public Historical getHistorical() {
        return historical;
    }

    public void setHistorical(Historical historical) {
        this.historical = historical;
    }
}