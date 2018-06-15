package com.fallout.models.buildings;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.buildings.definitions.BuildingActions;

import java.util.HashMap;

public class JunkMine extends Building implements BuildingActions  {
    /***
     *     Se deja como protected por el hecho de que las unicas clases 'autorizadas' para poder crear instancias
     *     de esta clase son los modelos que hereden de la misma
     * @param healthPoints
     * @param productionResource

     */
    protected JunkMine(Integer healthPoints, KnownResources productionResource, Integer productionAmountPerPhase, boolean isMine, KnownBuildings buildName) {
        super(KnownFactions.RAIDERS, healthPoints, Building.setRequiredResources(KnownFactions.RAIDERS,KnownBuildings.JUNK_MINE), productionResource, productionAmountPerPhase, isMine, buildName);
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
