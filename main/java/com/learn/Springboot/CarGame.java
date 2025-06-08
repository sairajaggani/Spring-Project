package com.learn.Springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Car")
public class CarGame implements Console{

    public void up() {
        System.out.println("Accelerate");
    }
    public void down() {
        System.out.println("Brake/ Drift");
    }
    public void left() {
        System.out.println("move left");
    }
    public void right() {
        System.out.println("move right");
    }

}
