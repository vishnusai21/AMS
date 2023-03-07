package com.example.Newproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    private GamerConsole game;
    public GameRunner(GamerConsole game){
        this.game=game;

    }
    public void run(){
        game.up();
        game.down();
        game.right();
        game.left();
}
}
