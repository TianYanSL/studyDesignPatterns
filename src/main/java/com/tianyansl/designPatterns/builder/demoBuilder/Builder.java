package com.tianyansl.designPatterns.builder.demoBuilder;

public abstract class Builder {
    protected Bike bike = new Bike();
    abstract void setFrame();
    abstract void setColor();
    abstract Bike createBike();
}
