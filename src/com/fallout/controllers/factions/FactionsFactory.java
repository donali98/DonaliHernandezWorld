package com.fallout.controllers.factions;

import com.fallout.AbstractFactory;
import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.BrotherhoodOfSteel;
import com.fallout.models.factions.TheInstitute;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.HashMap;

public class FactionsFactory implements AbstractFactory {

    @Override
    public Building getBuilding(KnownBuildings building) {
        return null;
    }

    @Override
    public Faction getFaction(KnownFactions factionName) {
       switch (factionName){
           case THE_INSTITUTE:
               return new TheInstitute();
           case BROTHERHOOD_OF_STEEL:
               return new BrotherhoodOfSteel();
           default:
               return null;
       }

    }

    @Override
    public HashMap<Integer, Resourse> getFactionResources(KnownFactions faction) {
        return null;
    }
}
