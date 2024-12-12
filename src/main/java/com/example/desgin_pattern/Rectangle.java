package com.example.desgin_pattern;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
