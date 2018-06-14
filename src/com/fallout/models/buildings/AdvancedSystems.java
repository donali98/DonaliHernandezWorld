package com.fallout.models.buildings;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.models.buildings.definitions.BuildingActions;
import com.fallout.models.buildings.definitions.Building;



public class AdvancedSystems extends Building implements BuildingActions {
    public AdvancedSystems(Integer healthPoints,
                           KnownResources productionResource){
        super(
                KnownFactions.THE_INSTITUTE,
                healthPoints,
                Building.setRequiredResources(KnownFactions.THE_INSTITUTE, KnownBuildings.ADVANCED_SYSTEMS),
                productionResource,
                150,
                true,
                KnownBuildings.ADVANCED_SYSTEMS
        );
    }

    @Override
    public void build() {

    }

    @Override
    public void generate() {

    }

    @Override
    public void extract() {

    }


}
