package com.fallout.models.buildings.definitions;

import com.fallout.models.Properties;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;


public class Building {

    Properties properties;


    public Building(String name,
                    Faction faction,
                    Integer healthPoints,
                    ArrayList<Resourse> requiredResources,
                    Resourse productionResource,
                    Integer productionAmountPerPhase) {
        this.properties = Properties.getProperties(name,faction,healthPoints).
                requiredResources(requiredResources).
                productionResourse(productionResource).
                productionAmountPerPhase(productionAmountPerPhase).
                build();
    }

}
