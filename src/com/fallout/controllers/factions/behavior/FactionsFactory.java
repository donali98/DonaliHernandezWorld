package com.fallout.controllers.factions.behavior;

import com.fallout.AbstractFactory;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;

public class FactionsFactory implements AbstractFactory {

    @Override
    public Faction getFaction() {
        return null;
    }

    @Override
    public Building getBuilding() {
        return null;
    }

    @Override
    public ResourseProperties getResourse() {
        return null;
    }

}
