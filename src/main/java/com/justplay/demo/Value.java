package com.justplay.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
    @JsonProperty("world_population")
    private Long worldPop;


    public Long getWorldPop() {
        return worldPop;
    }
}
