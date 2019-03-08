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

    @OneToOne
    @JoinColumn(name = "historicalid")
    private Historical historical;

    @OneToMany(mappedBy = "fatefavorites")
    @JsonIgnoreProperties("fatefavorites")
    private Set<MapMarker> mapmarkers = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "topictags",
        joinColumns = {@JoinColumn(name = "fateid")},
        inverseJoinColumns = {@JoinColumn(name = "tagid")})
    @JsonIgnoreProperties("fate")
    private Set<Tag> tags = new HashSet<>();

     @ManyToMany(mappedBy = "favorites")
     @JsonIgnoreProperties("favorites")
     private Set<User> users = new HashSet<>();

    public String getFatebio() {
        return fatebio;
    }

    public void setFatebio(String fatebio) {
        this.fatebio = fatebio;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

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
