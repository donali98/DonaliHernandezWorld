package com.fallout.models.factions.definitions;

import com.fallout.config.KnownFactions;
import com.fallout.controllers.factions.FactionController;
import com.fallout.models.buildings.definitions.Building;

import java.util.ArrayList;

public class Faction {

    private Integer factionId;
    private ArrayList<Building> buildings;
    private Headquarter headquarter;
    private KnownFactions factionName;
    /***
     *     Se deja como protected por el hecho de que las unicas clases 'autorizadas' para poder crear instancias
     *     de esta clase son los modelos que hereden de la misma
     */
    protected Faction(KnownFactions faction) {
        this.factionId = FactionController.getInstance().returnAll() == null ? 1:FactionController.getInstance().returnAll().size()+1 ;
        this.factionName = faction;
        this.buildings = new ArrayList<>();
        this.headquarter = new Headquarter(faction);

    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public Headquarter getHeadquarter() { return headquarter; }

    public KnownFactions getFactionName() { return factionName; }

    public Integer getFactionId() { return factionId; }
}
