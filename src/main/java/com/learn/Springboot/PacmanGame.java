package com.learn.Springboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements Console{

    public void up() {
        System.out.println("move up");
    }
    public void down() {
        System.out.println("move down");
    }
    public void left() {
        System.out.println("move back");
    }
    public void right() {
        System.out.println("move forward");
    }
}
