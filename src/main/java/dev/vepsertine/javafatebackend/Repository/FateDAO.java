package dev.vepsertine.javafatebackend.Repository;

import dev.vepsertine.javafatebackend.Model.Fate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FateDAO extends JpaRepository<Fate, Long> {

}
