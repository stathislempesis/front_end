package com.example.ui.Controllers;

import com.example.ui.Repositories.RetweeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class UpdateHubRetweetersTree {

    @Autowired
    RetweeterRepository retweeterRepository;

    @GetMapping("/retweeterRetweeted")
    public List<Object> retweeterRetweeted() {

        return retweeterRepository.getTupleRetweeterRetweeted(Boolean.FALSE);
    }
}
