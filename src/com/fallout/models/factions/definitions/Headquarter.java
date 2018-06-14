package com.fallout.models.factions.definitions;

import com.fallout.controllers.factions.HeadquarterActions;
import com.fallout.models.resourses.definitions.Resourse;
import java.util.ArrayList;
import java.util.HashMap;

public class Headquarter implements HeadquarterActions {

    private Integer level;
    private ArrayList<Resourse> resources;
    private Faction faction;


    public Headquarter(Faction faction) {
        this.resources = new ArrayList<>();
        //nivel inicial del centro de mando
        this.level = 0;
        this.faction = faction;
    }

    public Faction getFaction() { return faction; }

    public Integer getLevel() {
        return level;
    }

    public ArrayList<Resourse> getResources() {
        return resources;
    }


    @Override
    public boolean addResource(Resourse resource) {
        if(!resources.contains(resource)){
            resources.add(resource);
            return true;
        }
        return false;
    }
}
