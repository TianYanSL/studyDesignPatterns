package com.tianyansl.designPatterns.factory.factoryMethod;

import java.util.UUID;

public class FactoryB extends AbsFactory {
    @Override
    Entity getEntityObject() {
        Entity entity = new Entity();
        entity.setId(UUID.randomUUID().toString());
        entity.setName("I am entity, created by FactoryB");
        return entity;
    }
}
