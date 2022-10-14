package com.dailycodebuffer.springboot.tutorial.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "features")
public class FeatureEndPoint {

    private final Map<String, Feature> featuerMap =
            new ConcurrentHashMap<>();

    public FeatureEndPoint() {
        featuerMap.put("Department", new Feature(true));
        featuerMap.put("User", new Feature(false));
        featuerMap.put("Authentication", new Feature(false));
    }

    @ReadOperation
    public Map<String, Feature> feature() {
        return featuerMap;
    }

    @ReadOperation
    public Feature feature(@Selector String featuerName) {
        return featuerMap.get(featuerName);

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Feature {
        private boolean isBoolean;


    }
}
