package dev.vepsertine.javafatebackend.Repository;

import dev.vepsertine.javafatebackend.Model.MapMarker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapMarkerDAO extends JpaRepository<MapMarker, Long> {
}
