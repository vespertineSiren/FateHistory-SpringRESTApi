package dev.vepsertine.javafatebackend.Controller;

import dev.vepsertine.javafatebackend.Model.MapMarker;
import dev.vepsertine.javafatebackend.Model.Tag;
import dev.vepsertine.javafatebackend.Repository.TagDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tag", produces = MediaType.APPLICATION_JSON_VALUE)
public class TagController {

    @Autowired
    TagDAO tagDAO;

    @GetMapping(value = "/tag")
    public List<Tag> getAllTags() {return tagDAO.findAll();}



}
