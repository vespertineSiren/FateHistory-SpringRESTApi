package dev.vepsertine.javafatebackend.Repository;

import dev.vepsertine.javafatebackend.Model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagDAO extends JpaRepository<Tag, Long> {
}
