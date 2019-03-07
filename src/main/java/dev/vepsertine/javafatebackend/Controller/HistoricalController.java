package dev.vepsertine.javafatebackend.Controller;

import dev.vepsertine.javafatebackend.Model.Historical;
import dev.vepsertine.javafatebackend.Repository.HistoricalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/historical", produces = MediaType.APPLICATION_JSON_VALUE)
public class HistoricalController {

    @Autowired
    HistoricalDAO historicalDAO;

    @GetMapping(value = "/historical")
    public List<Historical> getAllHistoricalFigures(){ return historicalDAO.findAll();}


}
