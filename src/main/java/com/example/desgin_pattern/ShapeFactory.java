package com.example.desgin_pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {


    @Autowired
    private ApplicationContext context;

    // Users can draw different shapes like Circle, Rectangle, and Triangle.
    // Instead of hardcoding the creation of these shapes, we use the Factory Pattern

    public Shape getShape(String shapeType) {
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return context.getBean(Circle.class);
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return context.getBean(Rectangle.class);
        } else if ("TRIANGLE".equalsIgnoreCase(shapeType)) {
            return context.getBean(Triangle.class);
        }
        throw new IllegalArgumentException("Unknown shape type: " + shapeType);
    }
}
