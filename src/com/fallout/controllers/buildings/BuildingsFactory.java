package com.fallout.controllers.buildings;

import com.fallout.AbstractFactory;
import com.fallout.config.KnownFactions;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;

public class BuildingsFactory implements AbstractFactory {

    BuildingsController buildingsController = BuildingsController.getInstance();

    @Override
    public Building getBuilding(String buildingName) {
        for(Building building: buildingsController.returnAll()){
            if(building.getProperties().getBuildName().equals(buildingName.toUpperCase())){
                return building;
            }
        }
        return null;
    }

    @Override
    public Faction getFaction(KnownFactions faction) {
        return null;
    }
}
