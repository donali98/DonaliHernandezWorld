package com.fallout.controllers;

public class GameController  {

    public static GameController gameController;

    private GameController(){}

    public static synchronized GameController getInstance(){
        if(gameController==null){
            gameController = new GameController();
        }
        return gameController;
    }


}
