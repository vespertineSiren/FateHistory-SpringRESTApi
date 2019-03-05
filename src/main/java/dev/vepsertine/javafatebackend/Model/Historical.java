package dev.vepsertine.javafatebackend.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "historical")
public class Historical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long historicalid;

    private String historicalname, historicalbio, historicalimageURL, historicalsizzler;

    //One to One
    private Fate fate;

    //One to Many
    private Set<MapMarker> mapmarkers = new HashSet<>();

    public Historical(){}

    public long getHistoricalid() {
        return historicalid;
    }

    public void setHistoricalid(long historicalid) {
        this.historicalid = historicalid;
    }

    public String getHistoricalname() {
        return historicalname;
    }

    public void setHistoricalname(String historicalname) {
        this.historicalname = historicalname;
    }

    public String getHistoricalbio() {
        return historicalbio;
    }

    public void setHistoricalbio(String historicalbio) {
        this.historicalbio = historicalbio;
    }

    public String getHistoricalimageURL() {
        return historicalimageURL;
    }

    public void setHistoricalimageURL(String historicalimageURL) {
        this.historicalimageURL = historicalimageURL;
    }

    public String getHistoricalsizzler() {
        return historicalsizzler;
    }

    public void setHistoricalsizzler(String historicalsizzler) {
        this.historicalsizzler = historicalsizzler;
    }

    public Fate getFate() {
        return fate;
    }

    public void setFate(Fate fate) {
        this.fate = fate;
    }

    public Set<MapMarker> getMapmarkers() {
        return mapmarkers;
    }

    public void setMapmarkers(Set<MapMarker> mapmarkers) {
        this.mapmarkers = mapmarkers;
    }
}
