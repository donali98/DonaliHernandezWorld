package com.fallout.models.buildings.definitions;

import com.fallout.models.factions.definitions.Faction;

import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class Headquarter implements HeadquarterActions {

    private Integer level;
    private ArrayList<Resourse> resources;


    public Headquarter(Faction faction) {
        this.resources = new ArrayList<>();
        //nivel inicial del centro de mando
        this.level = 1;
    }

    @Override
    public void addResource(Resourse resource) throws Exception  {
        if(!this.resources.contains(resource)) this.resources.add(resource);
        else throw new Exception("El recurso ya existe en la base");
    }

    public Integer getLevel() {
        return level;
    }

    public ArrayList<Resourse> getResources() {
        return resources;
    }



}
