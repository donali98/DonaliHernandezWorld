package com.fallout.models.buildings;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.controllers.factions.FactionController;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.HashMap;


public class CrapMine extends Building {
    public CrapMine(
            Integer healthPoints,
            HashMap<KnownResources,Integer> requiredResourses,
            KnownResources productionResource,
            Integer productionAmountPerPhase) {
        super(
                FactionController.getInstance().getElementByName(KnownFactions.BROTHERHOOD_OF_STEEL),
                healthPoints,
                requiredResourses,
                productionResource,
                productionAmountPerPhase,
                true,KnownBuildings.CRAP_MINE
        );
    }
}
