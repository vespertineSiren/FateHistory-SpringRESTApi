package dev.vepsertine.javafatebackend.Controller;

import dev.vepsertine.javafatebackend.Model.MapMarker;
import dev.vepsertine.javafatebackend.Repository.MapMarkerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mapmarker", produces = MediaType.APPLICATION_JSON_VALUE)
public class MapMarkerController {

    @Autowired
    MapMarkerDAO mapMarkerDAO;

    @GetMapping(value = "/mapmarker")
    public List<MapMarker> getAllMapMarkers() {return mapMarkerDAO.findAll();}
}
