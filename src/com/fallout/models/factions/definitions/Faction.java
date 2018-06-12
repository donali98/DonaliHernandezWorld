package com.fallout.models.factions.definitions;

import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.buildings.definitions.Headquarter;

import java.util.ArrayList;

public class Faction {


    private ArrayList<Building> buildings;
    private Headquarter headquarter;
    private String factionName;
    /***
     *     Se deja como protected por el hecho de que las unicas clases 'autorizadas' para poder crear instancias
     *     de esta clase son los modelos que hereden de la misma
     */
    protected Faction(String factionName) {
        this.factionName = factionName;
        this.buildings = new ArrayList<>();
        this.headquarter = new Headquarter(this);


    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public Headquarter getHeadquarter() {
        return headquarter;
    }

    public String getFactionName() {
        return factionName;
    }
}
