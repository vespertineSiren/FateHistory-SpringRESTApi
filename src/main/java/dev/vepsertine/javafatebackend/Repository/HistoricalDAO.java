package dev.vepsertine.javafatebackend.Repository;

import dev.vepsertine.javafatebackend.Model.Historical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricalDAO extends JpaRepository<Historical, Long> {
}
