package com.fallout.models.factions.definitions;


import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.resourses.EnclaveRemainder;
import com.fallout.models.resourses.NuclearPower;
import com.fallout.models.resourses.Oil;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class Faction {

    private ArrayList<Building> buildings;
    private ArrayList<Resourse> resourses;


    public Faction() {

        this.resourses = new ArrayList<>();
        this.buildings = new ArrayList<>();
        //asignando la cantidad de recursos iniciales
        this.resourses.add(new NuclearPower(150, this));
        this.resourses.add(new EnclaveRemainder(50, this));
        this.resourses.add(new Oil(30,this));

    }


}
