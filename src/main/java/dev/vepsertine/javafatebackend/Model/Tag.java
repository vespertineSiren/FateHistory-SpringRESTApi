package dev.vepsertine.javafatebackend.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tagid;

    private String tagname;

    @ManyToMany(mappedBy = "tags")
    @JsonIgnoreProperties("tags")
    private Set<Fate> fate;

    public Tag(){}

    public long getTagid() {
        return tagid;
    }

    public void setTagid(long tagid) {
        this.tagid = tagid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public Set<Fate> getFate() {
        return fate;
    }

    public void setFate(Set<Fate> fate) {
        this.fate = fate;
    }
}
