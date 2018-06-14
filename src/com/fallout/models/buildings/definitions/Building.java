package com.fallout.models.buildings.definitions;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.controllers.buildings.BuildingsController;
import com.fallout.models.Properties;
import java.util.HashMap;


public class Building {

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    /***
     *     Se deja como protected por el hecho de que las unicas clases 'autorizadas' para poder crear instancias
     *     de esta clase son los modelos que hereden de la misma
     */
    protected Building(
                    KnownFactions faction,
                    Integer healthPoints,
                    HashMap<KnownResources,Integer> requiredResources,
                    KnownResources productionResource,
                    Integer productionAmountPerPhase,
                    boolean isMine,
                    KnownBuildings buildName) {
        this.properties = Properties.getProperties(faction,healthPoints,
                BuildingsController.getInstance().returnAll() == null ? 1:BuildingsController.getInstance().returnAll().size()+1).
                requiredResources(requiredResources).
                productionResourse(productionResource).
                productionAmountPerPhase(productionAmountPerPhase).
                isMine(isMine).buildName(buildName).
                build();
    }

    public KnownFactions getBuildFaction(){
        return this.getProperties().getFaction();
    }

    /***
     * Metodo para asignar los recursos necesarios de construccion de edificacion por faccion
     */
    protected static HashMap<KnownResources,Integer> setRequiredResources(KnownFactions faction, KnownBuildings building){

        HashMap<KnownResources,Integer> requiredResources = new HashMap<>();
        switch (faction){
            case THE_INSTITUTE:
                switch (building){
                    case ADVANCED_SYSTEMS:
                        requiredResources.put(KnownResources.NUCLEAR_MATERIAL,100);
                        requiredResources.put(KnownResources.OIL,100);
                        requiredResources.put(KnownResources.ENCLAVE_REMAINDER,100);
                    break;
                    case OIL_MINE:
                        requiredResources.put(KnownResources.NUCLEAR_MATERIAL,150);
                        requiredResources.put(KnownResources.OIL,150);
                        requiredResources.put(KnownResources.ENCLAVE_REMAINDER,150);
                    break;
                }
            break;
            case BROTHERHOOD_OF_STEEL:
                requiredResources.put(KnownResources.STEEL,100);
                requiredResources.put(KnownResources.ADHESIVE,100);

                break;
        }

        return requiredResources;
    }

}
