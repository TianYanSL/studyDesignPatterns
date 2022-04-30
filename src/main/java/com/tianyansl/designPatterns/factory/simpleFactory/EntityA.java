package com.tianyansl.designPatterns.factory.simpleFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntityA {
    private String id;
    private String name;
    private transient String password;
}
