package com.fallout.controllers.resourses;

import com.fallout.AbstractFactory;
import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.EnclaveRemainder;
import com.fallout.models.resourses.NuclearPower;
import com.fallout.models.resourses.Oil;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.HashMap;

public class ResourcesFactory  implements AbstractFactory {
    @Override
    public Building getBuilding(KnownBuildings building) {
        return null;
    }

    @Override
    public Faction getFaction(KnownFactions faction) {
        return null;
    }

    @Override
    public HashMap<Integer, Resourse> getFactionResources(KnownFactions faction) {

        HashMap<Integer,Resourse> factionResources = new HashMap<>();
        switch (faction){
            case THE_INSTITUTE:
                factionResources.put (0,new EnclaveRemainder(500,5000));
                factionResources.put (1,new NuclearPower(500,5000));
                factionResources.put (2,new Oil(500,5000));
                return factionResources;
            case BROTHERHOOD_OF_STEEL:
                return null;
            default:
                return null;
        }
    }
}
