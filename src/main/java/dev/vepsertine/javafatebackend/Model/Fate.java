package dev.vepsertine.javafatebackend.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "fate")
public class Fate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long fateid;

    private String fatename, fatebio, fateimageURL;

    //One to One
    private Historical historical;

    //One to Many
    private Set<MapMarker> mapmarkers = new HashSet<>();

    public Fate(){}

    public long getFateid() {
        return fateid;
    }

    public void setFateid(long fateid) {
        this.fateid = fateid;
    }

    public String getFatename() {
        return fatename;
    }

    public void setFatename(String fatename) {
        this.fatename = fatename;
    }

    public String getBio() {
        return fatebio;
    }

    public void setBio(String bio) {
        this.fatebio = bio;
    }

    public String getFateimageURL() {
        return fateimageURL;
    }

    public void setFateimageURL(String fateimageURL) {
        this.fateimageURL = fateimageURL;
    }

    public Historical getHistorical() {
        return historical;
    }

    public void setHistorical(Historical historical) {
        this.historical = historical;
    }

    public Set<MapMarker> getMapmarkers() {
        return mapmarkers;
    }

    public void setMapmarkers(Set<MapMarker> mapmarkers) {
        this.mapmarkers = mapmarkers;
    }
}
