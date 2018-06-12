package com.fallout.controllers.factions;

import com.fallout.controllers.GeneralControllerActions;
import com.fallout.models.factions.definitions.Faction;

import java.util.ArrayList;

public class FactionController implements GeneralControllerActions<Faction,String > {
    private static FactionController factionsController;
    private static ArrayList<Faction> factions;

    private FactionController() { }

    public synchronized static FactionController getInstance(){
       if(factionsController == null){
            factionsController = new FactionController();
            factions = new ArrayList<>();
       }
       return factionsController;
    }


    @Override
    public boolean add(Faction type) {
        if(!factions.contains(type)){
            factions.add(type);
            return true;
        }
        else return false;
    }

    @Override
    public Faction get(String type) {
        for (Faction faction: factions){
            if(faction.getFactionName().equals(type.toUpperCase()) ){
                return faction;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Faction> returnAll() {
        if(!factions.isEmpty()){
            return factions;
        }
        else return null;
    }


}
