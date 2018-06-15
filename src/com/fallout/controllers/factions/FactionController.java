package com.fallout.controllers.factions;

import com.fallout.config.KnownFactions;
import com.fallout.controllers.GeneralControllerActions;
import com.fallout.models.factions.definitions.Faction;

import java.util.ArrayList;

public class FactionController implements GeneralControllerActions<Faction,KnownFactions> {
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
    public boolean addElement(Faction faction) {
        if(!factions.contains(faction)){
            factions.add(faction);
            return true;
        }
        else return false;
    }

    @Override
    public Faction getElementByName(KnownFactions type) {
        for (Faction faction: factions){
            if(faction.getFactionName() == type) {
                return faction;
            }
        }
        return null;
    }

    @Override
    public Faction getElementById(Integer id) {

        for (Faction faction: factions){
            if(faction.getFactionId().equals(id) ){
                return faction;
            }
        }

        return null;
    }

    @Override
    public ArrayList<Faction> returnAll() {
       // if(!factions.isEmpty()){
            return factions;
        //}
        //else return null;
    }


}
