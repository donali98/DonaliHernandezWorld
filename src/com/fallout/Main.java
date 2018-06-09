package com.fallout;


import com.fallout.controllers.factions.FactionsController;
import com.fallout.models.factions.TheInstitute;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

public class Main {

    public static void main(String[] args) {

        FactionsController factionsController = FactionsController.getInstance();
        factionsController.add(new TheInstitute());
        Faction faction = factionsController.get(0);
        for(Resourse r : faction.getHeadquarter().getResources()){
            System.out.println(r.getHeadQuarterStorageLimit());
        }
    }
}
