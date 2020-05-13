package com.justplay.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PopRestController {

    @Autowired
    WorldPopService worldPopService;

    @GetMapping("/world-pop-json")
    String getWorldPopJson() {
        String worldPopulation = worldPopService.fetchWorldPopFromApi().getWorldPopulation().getWorldPop().toString();
        return "World population: " + worldPopulation;
    }

}
