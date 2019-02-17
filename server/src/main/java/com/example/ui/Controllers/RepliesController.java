package com.example.ui.Controllers;

import com.example.ui.Repositories.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class RepliesController {

    @Autowired
    private ReplyRepository replyRepository;

    @GetMapping("/users/{userId}/replies")
    public List<Object> getAllRepliesByUserId()
    {
        return replyRepository.countRepliesByDate();
    }

    @GetMapping("/users/{userId}/{arr_dates}/replies")
    public List<Object> getAllRepliesByUserIdDates(@PathVariable(value = "arr_dates") List<Object> arr_dates)
    {
        return replyRepository.countRepliesInDatesByDate(arr_dates);
    }
}
