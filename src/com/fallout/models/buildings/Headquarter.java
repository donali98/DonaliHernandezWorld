package com.fallout.models.buildings;

import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class Headquarter extends Building {

    public Headquarter(String name,
                       Faction faction,
                       Integer healthPoints,
                       ArrayList<Resourse> initialResourses){
        super(name, faction, healthPoints ,initialResourses);
    }
}

