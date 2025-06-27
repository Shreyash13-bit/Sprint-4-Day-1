package com.example.nisum.service;

import org.springframework.stereotype.Component;

@Component
public class ComponentGreeter extends Greeter {
    public ComponentGreeter() {
        super("Hello from Component!");
    }
}
