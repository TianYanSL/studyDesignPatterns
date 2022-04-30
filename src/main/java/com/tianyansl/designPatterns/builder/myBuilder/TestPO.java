package com.tianyansl.designPatterns.builder.myBuilder;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class TestPO {
    @JSONField(ordinal = 1)
    private String pkid;
    @JSONField(ordinal = 3)
    private String name;
    @JSONField(ordinal = 2)
    private Integer number;
    @JSONField(ordinal = 1)
    private Date time;

    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
