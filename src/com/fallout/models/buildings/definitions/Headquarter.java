package com.fallout.models.buildings.definitions;

import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.EnclaveRemainder;
import com.fallout.models.resourses.NuclearPower;
import com.fallout.models.resourses.Oil;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class Headquarter {

    private Integer level;
    private ArrayList<Resourse> resources;
    private Faction faction;


    public Headquarter(Faction faction) {
        this.faction = faction;
        this.resources = new ArrayList<>();
        //nivel inicial del centro de mando
        this.level = 1;
        //asignando la cantidad de recursos iniciales
        this.resources.add(new NuclearPower(150, faction,1000));
        this.resources.add(new EnclaveRemainder(50, faction,5000));
        this.resources.add(new Oil(30,faction,3000));

    }

    public Integer getLevel() {
        return level;
    }

    public ArrayList<Resourse> getResources() {
        return resources;
    }
}
