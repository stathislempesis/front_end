package com.example.ui.Controllers;

import com.example.ui.Repositories.RetweeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class RetweeterController {

    @Autowired
    private RetweeterRepository retweeterRepository;

    @GetMapping("/users/{retweeted_user_id}/retweeters")
    public List<Object> getAllRetweetsByRetweetedUserId(@PathVariable(value = "retweeted_user_id") Long retweeted_user_id)
    {
        return retweeterRepository.countByDateRetweetedUserId(retweeted_user_id);
    }
}
