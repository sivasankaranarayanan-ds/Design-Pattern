package com.example.desgin_pattern;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
