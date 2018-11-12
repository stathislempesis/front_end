package com.example.ui.Controllers;


import com.example.ui.Entities.Trend;
import com.example.ui.Entities.TrendsList;
import com.example.ui.Services.TrendsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class TrendListController
{

    @Autowired
    private TrendsListService trendsListService;


    @RequestMapping(value = {"/trendsLists_recent", "/trendsLists_recent/{number_to_fetch}"})
    public List<TrendsList> recentTrendsList(@PathVariable Optional<Integer> number_to_fetch)
    {
        if(number_to_fetch.isPresent())
        {
            return trendsListService.recent(number_to_fetch.get());
        }

        return trendsListService.recent(1);
    }


    @GetMapping("/trendsLists/{id}/trends")
    public List<Trend> trends(@PathVariable Long id)
    {
        return trendsListService.trends(id);
    }
}
