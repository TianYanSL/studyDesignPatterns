package com.tianyansl.designPatterns.builder.myBuilder;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class TestBuilder {

    public static void main(String[] args) {
        TestPO po = new TestPOBuilder()
                .buildPrimaryKey("AbcDef")
                .buildNumber(10)
                .buildName("Alina")
                .buildTime(new Date())
                .director();

        System.out.println(JSON.toJSONString(po));
    }
}
