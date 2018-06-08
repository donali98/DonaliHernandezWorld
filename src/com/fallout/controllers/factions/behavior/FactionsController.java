package com.fallout.controllers.factions.behavior;

import com.fallout.models.factions.definitions.Faction;

import java.util.ArrayList;

public class FactionsController {

    private static FactionsController factionsController;
    private static ArrayList<Faction> factions;

    private FactionsController(){};

    public synchronized  static FactionsController getInstance(){
        if(factionsController == null){
            factionsController = new FactionsController();
            factions = new ArrayList<>();
        }
        return factionsController;
    }

}
