package com.fallout.models.buildings.definitions;

import com.fallout.models.Properties;
import com.fallout.models.factions.definitions.Faction;


public class Building implements BuildingActions {

    Properties properties;


    public Building(String name, Faction faction, Double healthPoints, Double quiantityPerPhase, Integer creationWaitingPhases) {
        this.properties = Properties.getProperties(name,faction,healthPoints,quiantityPerPhase,creationWaitingPhases).build();
    }

    @Override
    public void generate(int ammount) {

    }
}
