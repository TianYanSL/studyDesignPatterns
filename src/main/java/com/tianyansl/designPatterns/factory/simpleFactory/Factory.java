package com.tianyansl.designPatterns.factory.simpleFactory;

import java.util.UUID;

public class Factory {
    public Object getEntity(String type) {
        switch (type) {
            case "A":
                EntityA entityA = new EntityA();
                entityA.setId(UUID.randomUUID().toString());
                entityA.setName("I am A");
                entityA.setPassword("123456");
                return entityA;
            case "B":
                EntityB entityB = new EntityB();
                entityB.setId(UUID.randomUUID().toString());
                entityB.setName("I am B");
                return entityB;
            default:
                System.out.println(String.format("can't find this type: %s", type));
                return null;
        }
    }
}
