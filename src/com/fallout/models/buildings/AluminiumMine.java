package com.fallout.models.buildings;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.buildings.definitions.BuildingActions;

import java.util.HashMap;

public class AluminiumMine extends Building implements BuildingActions {
    /***
     *     Se deja como protected por el hecho de que las unicas clases 'autorizadas' para poder crear instancias
     *     de esta clase son los modelos que hereden de la misma
     * @param healthPoints
     * @param productionResource
     */
    public AluminiumMine(Integer healthPoints, KnownResources productionResource) {
        super(KnownFactions.BROTHERHOOD_OF_STEEL,
                healthPoints,
                Building.setRequiredResources(KnownFactions.BROTHERHOOD_OF_STEEL,KnownBuildings.ALUMINIUM_MINE),
                productionResource,
                599,
                true,
                KnownBuildings.ALUMINIUM_MINE
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
