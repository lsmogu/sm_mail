package com.ipmotor.hello;

/**
 * Created by IntelliJ IDEA.
 * User: dafei
 * Date: 11-5-29
 * Time: обнГ10:06
 * To change this template use File | Settings | File Templates.
 */
public class HelloSpring {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void greet() {
        System.out.println("Hello " + getName());
    }
}
