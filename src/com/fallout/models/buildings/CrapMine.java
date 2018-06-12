package com.fallout.models.buildings;

import com.fallout.config.KnowBuildings;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.HashMap;


public class CrapMine extends Building {
    public CrapMine(
                    Faction faction,
                    Integer healthPoints,
                    HashMap<Integer,Resourse> requiredResourses,
                    Resourse productionResource,
                    Integer productionAmountPerPhase) {
        super(faction,healthPoints, requiredResourses,productionResource, productionAmountPerPhase,true,KnowBuildings.CRAP_MINE);
    }
}
