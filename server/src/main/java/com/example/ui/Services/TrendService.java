package com.example.ui.Services;

import com.example.ui.Entities.Trend;
import com.example.ui.Repositories.TrendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class TrendService
{

    @Autowired
    private TrendRepository trendRepository;


    @Transactional(readOnly=true)
    public List<Trend> getAll()
    {
        return trendRepository.findAll();
    }

    /*
    @Transactional(readOnly=true)
    public Trend getById(Long id)
    {
        return trendRepository.findById(id).get();
    }
    */

    /*
    @Transactional(readOnly=true)
    public Trend getByName(String name)
    {
        return trendRepository.findByName(name).get(0);
    }
    */
}
