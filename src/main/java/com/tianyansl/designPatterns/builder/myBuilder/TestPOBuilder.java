package com.tianyansl.designPatterns.builder.myBuilder;

import java.util.Date;

public class TestPOBuilder {

    private String primaryKey;
    private String name;
    private Integer number;
    private Date time;

    public TestPOBuilder() {
    }

    public TestPOBuilder buildPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    public TestPOBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    public TestPOBuilder buildNumber(Integer number) {
        this.number = number;
        return this;
    }

    public TestPOBuilder buildTime(Date time) {
        this.time = time;
        return this;
    }

    public TestPO director() {
        TestPO testPO = new TestPO();
        testPO.setPkid(this.primaryKey);
        testPO.setName(this.name);
        testPO.setTime(this.time);
        testPO.setNumber(this.number);
        return testPO;
    }

}
