package com.tianyansl.designPatterns.factory.factoryMethod;

import java.util.UUID;

public class FactoryA extends AbsFactory {
    @Override
    Entity getEntityObject() {
        Entity entity = new Entity();
        entity.setId(UUID.randomUUID().toString());
        entity.setName("I am entity, created by FactoryA");
        return entity;
    }
}
