package com.tianyansl.designPatterns.builder.demoBuilder;

public class MobileBuilder extends Builder{
    @Override
    void setFrame() {
        bike.setFrame("碳素框架！");
    }

    @Override
    void setColor() {
        bike.setColor("黑色！");
    }

    @Override
    Bike createBike() {
        return bike;
    }
}
