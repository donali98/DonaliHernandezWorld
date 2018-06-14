package com.fallout.models.buildings;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.buildings.definitions.BuildingActions;

import java.util.HashMap;

public class OilMine extends Building implements BuildingActions {


    /***
     *     Se deja como protected por el hecho de que las unicas clases 'autorizadas' para poder crear instancias
     *     de esta clase son los modelos que hereden de la misma
     * @param healthPoints
     * @param productionResource
     * @param productionAmountPerPhase
     * @param isMine
     * @param buildName
     */
    protected OilMine( Integer healthPoints,  KnownResources productionResource, Integer productionAmountPerPhase, boolean isMine, KnownBuildings buildName) {
        super(
                KnownFactions.THE_INSTITUTE,
                healthPoints,
                Building.setRequiredResources(KnownFactions.THE_INSTITUTE,KnownBuildings.OIL_MINE),
                productionResource,
                productionAmountPerPhase,
                isMine,
                KnownBuildings.OIL_MINE
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
