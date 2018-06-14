package com.fallout.controllers.buildings;

import com.fallout.AbstractFactory;
import com.fallout.FactoryProducer;
import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.models.Factories;
import com.fallout.models.buildings.*;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.HashMap;

public class BuildingsFactory implements AbstractFactory {


    @Override
    public Building getBuilding(KnownBuildings buildingName) {
        switch (buildingName){
            case ADVANCED_SYSTEMS:
                return new AdvancedSystems(500, KnownResources.NUCLEAR_MATERIAL);
            case ADHESIVE_BUILDING:
                return new AdhesiveBuilding(500, KnownResources.ADHESIVE);
            case ALUMINIUM_MINE:
                return new AluminiumMine(500, KnownResources.ADHESIVE);
            case OIL_MINE:
                return new OilMine(500, KnownResources.OIL);
            case STEEL_MINE:
                return new SteelMine(500, KnownResources.STEEL);
            default:
                return null;
        }
    }

    @Override
    public Faction getFaction(KnownFactions faction) {
        return null;
    }

    @Override
    public HashMap<Integer, Resourse> getFactionResources(KnownFactions faction) { return null; }
}
