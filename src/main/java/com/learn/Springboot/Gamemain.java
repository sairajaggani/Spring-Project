package com.learn.Springboot;


import org.springframework.stereotype.Component;

@Component
public class Gamemain {
// private MarioGame game;
  private Console game;

    public Gamemain(Console game) {
        this.game = game;

    }

    public void run(){
       game.up();
       game.down();
       game.right();
       game.left();

    }

}
