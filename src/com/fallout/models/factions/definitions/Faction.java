package com.fallout.models.factions.definitions;

import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.buildings.definitions.Headquarter;

import java.util.ArrayList;

public class Faction {


    private ArrayList<Building> instituteBuildings;
    private Headquarter instituteHeadquarter;

    public Faction() {

        this.instituteBuildings = new ArrayList<>();
        this.instituteHeadquarter = new Headquarter(this);



    }


}
