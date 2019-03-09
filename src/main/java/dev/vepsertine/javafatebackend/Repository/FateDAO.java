package dev.vepsertine.javafatebackend.Repository;

import dev.vepsertine.javafatebackend.Model.Fate;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface FateDAO extends JpaRepository<Fate, Long> {

    Optional<Fate> findByFatenameEqualsIgnoreCase(String name);
}
