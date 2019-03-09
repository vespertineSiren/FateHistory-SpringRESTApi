package dev.vepsertine.javafatebackend.Controller;

import dev.vepsertine.javafatebackend.Model.Fate;
import dev.vepsertine.javafatebackend.Model.Tag;
import dev.vepsertine.javafatebackend.Repository.FateDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(value = "/fate", produces = MediaType.APPLICATION_JSON_VALUE)
public class FateController {

    @Autowired
    FateDAO fateDAO;

    @GetMapping(value = "/fate")
    public List<Fate> getAllFateCharacters(){return fateDAO.findAll();}

    @GetMapping(value = "/tag/{tagname}")
    public List<Fate> getAllFateCharactersAssociatedWithTag(@PathVariable String tagname) {
        List<Fate> check = fateDAO.findAll();

        List<Fate> foundFate = new ArrayList<>();

        for(Fate f : check){
            Set<Tag> checkTags = f.getTags();
            for (Tag t : checkTags) {
                if (t.getTagname().equalsIgnoreCase(tagname)) {
                    foundFate.add(f);
                }
            }
        }
        return foundFate;
    }

    @GetMapping(value = "/fate/{name}")
    public Fate getFateCharacterBasedonName(@PathVariable String name) {
        Optional<Fate> found = fateDAO.findByFatenameEqualsIgnoreCase(name);

        if(found.isPresent()) {
            return found.get();
        } else {
            return null;
        }
    }


}
