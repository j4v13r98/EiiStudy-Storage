package org.ulpgc.is1;

public class Greetings {
    private String name;

    public Greetings() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return ("Hello, " + name);
    }
}