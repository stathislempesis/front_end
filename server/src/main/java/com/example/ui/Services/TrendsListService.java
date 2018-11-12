package com.example.ui.Services;


import com.example.ui.Entities.Trend;
import com.example.ui.Entities.TrendsList;
import com.example.ui.Exception.ResourceNotFoundException;
import com.example.ui.Repositories.TrendRepository;
import com.example.ui.Repositories.TrendsListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Date;


@Service
public class TrendsListService
{
    @Autowired
    private TrendsListRepository trendsListRepository;

    @Autowired
    private TrendRepository trendRepository;


    @Transactional(readOnly=true)
    public List<TrendsList> getAll()
    {
        return trendsListRepository.findAll();
    }


    public TrendsList trendsList(Long trendsListId)
    {
        return trendsListRepository.findById(trendsListId).orElseThrow(() -> new ResourceNotFoundException("TrendsList", "id", trendsListId));
    }


    public List<TrendsList> recent(Integer number_to_fetch)
    {
        Date now = new Date();

        List<TrendsList> recentLists = trendsListRepository.closestToDate(now, number_to_fetch);

        if(recentLists.size() == 0)
        {
            return null;
        }

        return recentLists;
    }


    public List<Trend> trends(Long trendsListId)
    {
        TrendsList trendsList = this.trendsList(trendsListId);

        return trendRepository.allByIds(trendsList.trendsIds());
    }

}
