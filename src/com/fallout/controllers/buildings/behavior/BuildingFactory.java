package com.fallout.controllers.buildings.behavior;

import com.fallout.AbstractFactory;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.ResourseProperties;

public class BuildingFactory implements AbstractFactory {
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
