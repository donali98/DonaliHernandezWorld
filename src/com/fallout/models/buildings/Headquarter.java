package com.fallout.models.buildings;

import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class Headquarter  {

    private ArrayList<Resourse> resourcesList;
    private ArrayList<Building> createdBuilds;
    private Faction faction;


    public Headquarter(ArrayList<Resourse> resoursesList) {
        this.resourcesList = resoursesList;
    }
}

