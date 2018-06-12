package com.fallout.models.buildings;

import com.fallout.models.buildings.definitions.BuildingActions;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.HashMap;


public class AdvancedSystems extends Building implements BuildingActions {
    public AdvancedSystems(Faction faction,
                           Integer healthPoints,
                          HashMap<Integer,Resourse> requiredResourses,
                           Resourse productionResource){
        super( faction, healthPoints, requiredResourses,productionResource,
                150,
                true,"ADVANCED SYSTEMS");
    }

    @Override
    public void build() {

    }

    @Override
    public void generate() {

    }

    @Override
    public void extract() {

    }
}
