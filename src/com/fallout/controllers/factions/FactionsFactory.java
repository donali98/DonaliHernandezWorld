package com.fallout.controllers.factions;

import com.fallout.AbstractFactory;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;

public class FactionsFactory implements AbstractFactory {

    FactionController factionController = FactionController.getInstance();
    @Override
    public Building getBuilding(String building) {
        return null;
    }

    @Override
    public Faction getFaction(String factionName) {
        for (Faction faction: factionController.returnAll()){
            if(faction.getFactionName().equals(factionName.toUpperCase())){
                return faction;
            }
        }
        return null;
    }
}
