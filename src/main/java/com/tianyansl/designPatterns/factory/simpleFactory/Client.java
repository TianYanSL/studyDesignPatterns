package com.tianyansl.designPatterns.factory.simpleFactory;

import com.alibaba.fastjson.JSON;

public class Client {
    public static void main(String[] args) {
        EntityA entityA = (EntityA) new Factory().getEntity("A");
        entityA.setId("123");
        entityA.setName("I am A");

        EntityB entityB = (EntityB) new Factory().getEntity("B");
        entityB.setId("456");
        entityB.setName("I am B");

        Object entityC = new Factory().getEntity("C");
        System.out.println(JSON.toJSONString(entityA));
        System.out.println(entityA.getPassword());

        System.out.println(JSON.toJSONString(entityB));
        System.out.println(JSON.toJSONString(entityC));
    }
}
