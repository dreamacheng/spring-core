package com.acheng.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "dreamacheng")
public class HelloProperties {

    private static final String DEFAULT_NAME = "ACHENG";
    private static final String DEFAULT_MSG = "HELLO, ACHENG";

    private String name;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
