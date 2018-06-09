package com.fallout.models.factions.definitions;

import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.buildings.definitions.Headquarter;

import java.util.ArrayList;

public class Faction implements FactionActions {


    private ArrayList<Building> buildings;
    private Headquarter headquarter;

    public Faction() {

        this.buildings = new ArrayList<>();
        this.headquarter = new Headquarter(this);


    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public Headquarter getHeadquarter() {
        return headquarter;
    }

    @Override
    public void buildMine() {

    }
}
