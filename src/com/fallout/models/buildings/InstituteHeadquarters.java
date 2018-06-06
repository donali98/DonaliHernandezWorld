package com.fallout.models.buildings;


import com.fallout.models.buildings.Headquarter;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class InstituteHeadquarters extends Headquarter {


    public InstituteHeadquarters(String name,
                                 Faction faction,
                                 Integer healthPoints,
                                 ArrayList<Resourse>initialResourses) {
        super(name, faction, healthPoints,initialResourses);
    }
}
