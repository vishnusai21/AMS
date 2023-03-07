package com.example.Newproject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class PacMan implements GamerConsole {
    public void up(){
        System.out.println(" move up");
    }
    public void down(){
        System.out.println("move down");
    }
    public void right(){
        System.out.println("move right");
    }
    public void left(){
        System.out.println("move left");
    }
}
