package com.justplay.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service //eller @Component
public class WorldPopService {
    @Autowired
    RestTemplate restTemplate;

    WorldPop fetchWorldPopFromApi() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("x-rapidapi-host", "world-population.p.rapidapi.com");
        httpHeaders.add("x-rapidapi-key", "0eb044f953msha89e76558d563e8p10c027jsn9c0738b6e44d");
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        ResponseEntity<WorldPop> popByCountry = restTemplate.exchange("https://world-population.p.rapidapi.com/worldpopulation", HttpMethod.GET, httpEntity, WorldPop.class);
        return popByCountry.getBody();
    }
}
