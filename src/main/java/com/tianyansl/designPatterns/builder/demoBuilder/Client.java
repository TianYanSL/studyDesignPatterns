package com.tianyansl.designPatterns.builder.demoBuilder;

import com.alibaba.fastjson.JSON;

public class Client {
    public static void main(String[] args) {
        Bike haloBike = new Director().construct(new HaloBuilder());
        System.out.println(JSON.toJSONString(haloBike));
    }
}
