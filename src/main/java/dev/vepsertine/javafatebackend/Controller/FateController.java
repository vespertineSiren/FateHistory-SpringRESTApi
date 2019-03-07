package dev.vepsertine.javafatebackend.Controller;

import dev.vepsertine.javafatebackend.Model.Fate;
import dev.vepsertine.javafatebackend.Repository.FateDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/fate", produces = MediaType.APPLICATION_JSON_VALUE)
public class FateController {

    @Autowired
    FateDAO fateDAO;

    @GetMapping(value = "/fate")
    public List<Fate> getAllFateCharacters(){return fateDAO.findAll();}

}
