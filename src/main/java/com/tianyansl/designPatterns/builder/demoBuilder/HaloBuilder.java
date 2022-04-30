package com.tianyansl.designPatterns.builder.demoBuilder;

public class HaloBuilder extends Builder {
    @Override
    void setFrame() {
        bike.setFrame("铝合金框架！");
    }

    @Override
    void setColor() {
        bike.setColor("蓝色！");
    }

    @Override
    Bike createBike() {
        return bike;
    }
}
