package com.justplay.demo;


import com.fasterxml.jackson.annotation.JsonProperty;

public class WorldPop {
    @JsonProperty("body")
    private Value worldPopulation;

    public Value
    getWorldPopulation() {
        return worldPopulation;
    }

}
