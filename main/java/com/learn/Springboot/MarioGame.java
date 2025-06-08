package com.learn.Springboot;

public class MarioGame implements Console{

    public void up() {
        System.out.println("jump");
    }
    public void down() {
        System.out.println("go into hole");
    }
    public void left() {
        System.out.println("move back");
    }
    public void right() {
        System.out.println("move forward");
    }
}
