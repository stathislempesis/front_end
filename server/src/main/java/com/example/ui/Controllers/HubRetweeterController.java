package com.example.ui.Controllers;

import com.example.ui.Entities.HubRetweeter;
import com.example.ui.Repositories.HubRetweeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class HubRetweeterController {

    @Autowired
    HubRetweeterRepository hubRetweeterRepository;

    @GetMapping("/hubretweeter")
    public HubRetweeter getHubRetweeter() {

        return hubRetweeterRepository.findTop1ByOrderByIdDesc();
    }
}
