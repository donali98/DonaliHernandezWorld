package com.fallout.controllers.factions;

import com.fallout.models.factions.definitions.Faction;

import java.util.ArrayList;

public class FactionsController implements FactionsControllerActions<Faction> {
    private static FactionsController factionsController;
    private static ArrayList<Faction> factions;

    private FactionsController() { }

    public synchronized static FactionsController getInstance(){
       if(factionsController == null){
            factionsController = new FactionsController();
            factions = new ArrayList<>();
       }
       return factionsController;
    }


    @Override
    public void add(Faction type) { if(!factions.contains(type)){factions.add(type);} }

    @Override
    public Faction get(int ind) { return factions.get(ind); }


}
