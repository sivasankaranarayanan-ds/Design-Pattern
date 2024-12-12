package com.example.desgin_pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeService {

    @Autowired
    private ShapeFactory shapeFactory;

    public void drawShape(String shapeType) {
        Shape shape = shapeFactory.getShape(shapeType);
        shape.draw();
    }
}
