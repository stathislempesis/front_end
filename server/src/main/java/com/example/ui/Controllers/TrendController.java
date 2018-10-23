package com.example.ui.Controllers;


import com.example.ui.Entities.Trend;
import com.example.ui.Services.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.RequestMapping.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Controller
public class TrendController
{

    //@Autowired
    //private TrendService trendService;


    /*
    @GetMapping("/trends/{id}")
    public Trend getTrend(@PathVariable(value = "id") Long id)
    {
        return trendService.getById(id);
    }
    */

    /*
    @GetMapping("/trends/get/{name}")
    public Trend getTrend(@PathVariable(value = "name") String name)
    {
        return trendService.getByName(name);
    }
    */
}
