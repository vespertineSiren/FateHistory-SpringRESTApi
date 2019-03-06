package dev.vepsertine.javafatebackend.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String role;
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @ManyToMany
    @JoinTable(name = "favoritedby",
        joinColumns = {@JoinColumn(name = "id")},
        inverseJoinColumns = {@JoinColumn(name = "fateid")})
    @JsonIgnoreProperties("favorites")
    public Set<Fate> favorites = new HashSet<>();


    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

//    public List<SimpleGrantedAuthority> getAuthority() {
//        String myRole = "ROLE_" + this.role.toUpperCase();
//        return Arrays.asList(new SimpleGrantedAuthority(myRole));
//    }

}