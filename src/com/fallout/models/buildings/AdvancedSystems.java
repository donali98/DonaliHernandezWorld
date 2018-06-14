package com.fallout.models.buildings;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.controllers.factions.FactionController;
import com.fallout.models.buildings.definitions.BuildingActions;
import com.fallout.models.buildings.definitions.Building;

import java.util.HashMap;


public class AdvancedSystems extends Building implements BuildingActions {
    public AdvancedSystems(Integer healthPoints,
                           KnownResources productionResource){
        super(
                FactionController.getInstance().getElementByName(KnownFactions.THE_INSTITUTE),
                healthPoints,
                setRequiredResources(),
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

    private static HashMap<KnownResources,Integer> setRequiredResources(){

        HashMap<KnownResources,Integer> requiredResources = new HashMap<>();
        requiredResources.put(KnownResources.NUCLEAR_MATERIAL,100);
        requiredResources.put(KnownResources.OIL,100);
        requiredResources.put(KnownResources.ENCLAVE_REMAINDER,100);
        return requiredResources;
    }
}
