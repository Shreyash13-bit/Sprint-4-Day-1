package com.example.nisum.service;

public class Greeter {
    private final String greeting;

    public Greeter(String greeting) {
        this.greeting = greeting;
    }

    public String greet(String name) {
        return greeting + " " + name;
    }
}