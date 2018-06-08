package com.fallout.models.buildings;

import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class CrapMine extends Building {
    public CrapMine(String name,
                    Faction faction,
                    Integer healthPoints,
                    ArrayList<Resourse> requiredResourses,
                    Resourse productionResource,
                    Integer productionAmountPerPhase) {
        super(name, faction, healthPoints, requiredResourses,productionResource, productionAmountPerPhase);
    }
}
