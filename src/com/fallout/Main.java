package com.fallout;


import com.fallout.models.buildings.Headquarter;
import com.fallout.models.buildings.InstituteHeadquarters;
import com.fallout.models.factions.TheInstitute;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.NuclearPower;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Faction faction = new TheInstitute("TheInstute");
        ArrayList<Resourse> instituteResources = new ArrayList<>();
        instituteResources.add(new NuclearPower("Nuclear Power",
                faction,100,
                40,
                40));
        InstituteHeadquarters headquarters = new InstituteHeadquarters("HQ",
                faction,
                500,
                instituteResources);
    }
}
