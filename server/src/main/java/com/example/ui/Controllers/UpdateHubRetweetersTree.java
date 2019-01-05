package com.example.ui.Controllers;

import com.example.ui.Entities.Retweeter;
import com.example.ui.Repositories.RetweeterRepository;
import com.google.gson.Gson;
import org.jgrapht.Graph;
import org.jgrapht.alg.scoring.AlphaCentrality;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.api.UsersResources;
import com.example.ui.TwitterAnalytics.TwitterApi;

import java.util.*;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class UpdateHubRetweetersTree {

    List<User> entries = new ArrayList<User>(10);

    Gson gson = new Gson();
    UsersResources userResource = TwitterApi.client().users();

    @Autowired
    CacheManager cacheManager;

    @Autowired
    RetweeterRepository retweeterRepository;

    @GetMapping("/retweeterRetweetedPut")
    @CachePut(value="retweeterRetweetedMap")
    public List<User> retweeterRetweetedPut() {

        Graph<Long, DefaultEdge> graph = new DefaultDirectedGraph<Long, DefaultEdge>(DefaultEdge.class);

        List<Retweeter> retweeterRetweeted = retweeterRepository.findByAppUserFlagFalse();

        for(Retweeter retweeter : retweeterRetweeted){
            if (!graph.containsVertex(retweeter.getRetweeter_id())) { ;
                graph.addVertex(retweeter.getRetweeter_id());
            }
            if (!graph.containsVertex(retweeter.getRetweeted_user_id())) {
                graph.addVertex(retweeter.getRetweeted_user_id());
            }
            graph.addEdge(retweeter.getRetweeter_id(), retweeter.getRetweeted_user_id());
        }

        AlphaCentrality alphaCentrality = new AlphaCentrality(graph);

        Map<Long, Double> map = sortByValue(alphaCentrality.getScores());

        int counter = 0;

        User user;

        for (Map.Entry<Long, Double> entry : map.entrySet())
        {
            try {

                user = userResource.showUser(entry.getKey());

                entries.add(user);

                counter++;

                if(counter==10) break;

            }catch (TwitterException e) {
                e.printStackTrace();
            }

        }

        return entries;
    }

    @GetMapping("/retweeterRetweetedGet")
    @Cacheable(value="retweeterRetweetedMap")
    public List<User> retweeterRetweetedGet() {
        return entries;
    }

    @GetMapping("/retweeterRetweetedEvict")
    @CacheEvict(value = "retweeterRetweetedMap", allEntries = true)
    public String evict(){
        cacheManager.getCache("retweeterRetweetedMap").clear();
        return "Done";
    }

    public static Map<Object, Double>sortByValue(Map<Object, Double> unsortMap) {

        List<Map.Entry<Object, Double>> list =
                new LinkedList<Map.Entry<Object, Double>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Object, Double>>() {
            public int compare(Map.Entry<Object, Double> o1,
                               Map.Entry<Object, Double> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<Object, Double> sortedMap = new LinkedHashMap<Object, Double>();
        for (Map.Entry<Object, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}