package com.acheng.core;

public class HelloService {

    private String name;

    private String msg;

    public String sayHello() {
        return name + "," + msg;
    }

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
