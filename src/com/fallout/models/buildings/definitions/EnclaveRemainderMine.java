package com.fallout.models.buildings.definitions;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;

import java.util.HashMap;

public class EnclaveRemainderMine extends Building implements BuildingActions {
    /***
     *     Se deja como protected por el hecho de que las unicas clases 'autorizadas' para poder crear instancias
     *     de esta clase son los modelos que hereden de la misma
     * @param healthPoints
     * @param productionResource
     * @param productionAmountPerPhase
     * @param buildName
     */
    protected EnclaveRemainderMine( Integer healthPoints, KnownResources productionResource, Integer productionAmountPerPhase, KnownBuildings buildName) {
        super(
                        KnownFactions.THE_INSTITUTE,
                        healthPoints,
                        Building.setRequiredResources(KnownFactions.THE_INSTITUTE,KnownBuildings.ENCLAVE_REMAINDER_MINE),
                        productionResource,
                        productionAmountPerPhase,
                        true,
                        KnownBuildings.ENCLAVE_REMAINDER_MINE
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
