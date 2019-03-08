package dev.vepsertine.javafatebackend.Controller;

import dev.vepsertine.javafatebackend.Model.User;
import dev.vepsertine.javafatebackend.Repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mgr", produces = MediaType.APPLICATION_JSON_VALUE)
public class MgrController {

    @Autowired
    UserDao userDao;

    @GetMapping(value = "/user")
    public List<User> getAllUsers(){return userDao.findAll();}


}
