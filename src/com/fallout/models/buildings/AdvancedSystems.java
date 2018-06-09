package com.fallout.models.buildings;

import com.fallout.models.buildings.definitions.BuildingActions;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class AdvancedSystems extends Building implements BuildingActions {
    public AdvancedSystems(String name,
                           Faction faction,
                           Integer healthPoints,
                           ArrayList<Resourse> requiredResourses,
                           Resourse productionResource){
        super(name, faction, healthPoints, requiredResourses,productionResource,
                150,
                true);
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
