package com.tianyansl.designPatterns.factory.factoryMethod;

import com.alibaba.fastjson.JSON;

public class Client {
    public static void main(String[] args) {
        Entity entityObjectA = new FactoryA().getEntityObject();
        Entity entityObjectB = new FactoryB().getEntityObject();
        System.out.println(JSON.toJSONString(entityObjectA));
        System.out.println(JSON.toJSONString(entityObjectB));
    }
}
