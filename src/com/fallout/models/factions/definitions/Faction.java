package com.fallout.models.factions.definitions;


import com.fallout.models.Properties;
import com.fallout.models.buildings.definitions.Building;

public class Faction implements FactionActions {

    Properties properties;

    public Faction(String nombre, Faction faction, Double healthPoints, Double quantityPerPhase,Integer creationWaitingPhases) {
        this.properties = Properties.getProperties(nombre, faction, healthPoints, quantityPerPhase, creationWaitingPhases).build();
    }

    @Override
    public void collectResource(Building building) {

    }
}
