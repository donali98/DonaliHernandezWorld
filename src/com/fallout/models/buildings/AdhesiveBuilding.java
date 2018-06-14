package com.fallout.models.buildings;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.buildings.definitions.BuildingActions;

import java.util.HashMap;

public class AdhesiveBuilding extends Building implements BuildingActions {
    /***
     *     Se deja como protected por el hecho de que las unicas clases 'autorizadas' para poder crear instancias
     *     de esta clase son los modelos que hereden de la misma
     * @param healthPoints
     * @param productionResource

     */
    public AdhesiveBuilding( Integer healthPoints,
                                KnownResources productionResource) {
        super(
                KnownFactions.BROTHERHOOD_OF_STEEL,
                healthPoints,
                Building.setRequiredResources(KnownFactions.BROTHERHOOD_OF_STEEL,KnownBuildings.ADHESIVE_BUILDING),
                productionResource,
                500,
                true,
                KnownBuildings.ADHESIVE_BUILDING
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
