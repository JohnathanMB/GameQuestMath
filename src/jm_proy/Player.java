/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jm_proy;

/**
 *
 * @author monitorvdo10
 */
public class Player {
    private String name;
    private int lives;

    public Player(String name) {
        this.name = name;
        this.lives = 3;
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public void reduceLives() {
        lives = lives-1;
    }
    
    public boolean gameOver(){
        boolean boolGameOver = false;
        if(lives == 0){
            boolGameOver = true;
        }
        return boolGameOver;
    }
    
    
    
}
