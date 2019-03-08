package dev.vepsertine.javafatebackend.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @OneToOne(mappedBy = "historical")
    @JoinColumn(name = "fateid")
    @JsonIgnoreProperties("historical")
    private Fate fate;


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

}
