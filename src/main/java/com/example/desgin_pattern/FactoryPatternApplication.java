package com.example.desgin_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FactoryPatternApplication {

    public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(FactoryPatternApplication.class, args);
        System.out.println("--------------------");
        // Factory Pattern
        ShapeService shapeService = context.getBean(ShapeService.class);
        shapeService.drawShape("CIRCLE");
        shapeService.drawShape("RECTANGLE");
        shapeService.drawShape("TRIANGLE");
        System.out.println("--------------------");
    }

}
