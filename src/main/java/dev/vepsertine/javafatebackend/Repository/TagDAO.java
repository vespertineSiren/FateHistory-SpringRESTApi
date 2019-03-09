package dev.vepsertine.javafatebackend.Repository;

import dev.vepsertine.javafatebackend.Model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface TagDAO extends JpaRepository<Tag, Long> {


    Optional<Tag> findByTagnameEqualsIgnoreCase(String tagname);
}
