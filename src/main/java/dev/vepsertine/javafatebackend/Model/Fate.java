package dev.vepsertine.javafatebackend.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "historicalfigure", referencedColumnName = "historicalid")
    private Historical historical;

    @ManyToMany
    @JoinTable(name = "topictags",
        joinColumns = {@JoinColumn(name = "fateid")},
        inverseJoinColumns = {@JoinColumn(name = "tagid")})
    @JsonIgnoreProperties("tags")
    private Set<Tag> tags = new HashSet<>();

     @OneToMany(mappedBy = "fate")
     @JsonIgnoreProperties("fate")
    private Set<MapMarker> mapmarkers = new HashSet<>();

     @ManyToMany(mappedBy = "favorites")
     @JsonIgnoreProperties("favorites")
     private Set<User> users = new HashSet<>();



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
