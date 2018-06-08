package com.fallout;


import com.fallout.models.buildings.InstituteHeadquarters;
import com.fallout.models.factions.TheInstitute;
import com.fallout.models.resourses.NuclearPower;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Resourse> instituteResources = new ArrayList<>();
        instituteResources.add(new NuclearPower("Nuclear Power",
                TheInstitute.getInstance(),
                40,
                40)
        );
        InstituteHeadquarters headquarters = new InstituteHeadquarters(
                100,
                instituteResources);
        }
    }

