package com.tianyansl.designPatterns.builder.demoBuilder;

public class Director {

    public Bike construct(Builder builder) {
        builder.setFrame();
        builder.setColor();
        return builder.createBike();
    }
}
