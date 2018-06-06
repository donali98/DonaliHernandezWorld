package com.fallout.models.buildings;


import com.fallout.models.factions.TheInstitute;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class InstituteHeadquarters extends Headquarter {


    public InstituteHeadquarters(Integer healthPoints,
                                 ArrayList<Resourse>initialResourses) {
        super("The Institute HQ", TheInstitute.getInstance(), healthPoints,initialResourses);
    }
}
