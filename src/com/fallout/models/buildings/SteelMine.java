package com.fallout.models.buildings;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.models.buildings.definitions.Building;

import java.util.HashMap;


public class SteelMine extends Building {
    public SteelMine(
            Integer healthPoints,
            KnownResources productionResource) {
        super(
                KnownFactions.BROTHERHOOD_OF_STEEL,
                healthPoints,
                Building.setRequiredResources(KnownFactions.BROTHERHOOD_OF_STEEL,KnownBuildings.STEEL_MINE),
                productionResource,
                500,
                true,
                KnownBuildings.STEEL_MINE
        );
    }
}
