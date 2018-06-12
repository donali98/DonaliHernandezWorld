package com.fallout.models.buildings.definitions;

import com.fallout.models.Properties;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;
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
                    Faction faction,
                    Integer healthPoints,
                    HashMap<Integer,Resourse> requiredResources,
                    Resourse productionResource,
                    Integer productionAmountPerPhase,
                    boolean isMine,String buildName) {
        this.properties = Properties.getProperties(faction,healthPoints).
                requiredResources(requiredResources).
                productionResourse(productionResource).
                productionAmountPerPhase(productionAmountPerPhase).
                isMine(isMine).buildName(buildName).
                build();
    }

}
