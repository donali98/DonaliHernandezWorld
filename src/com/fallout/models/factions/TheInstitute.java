package com.fallout.models.factions;

import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.factions.definitions.FactionActions;


public class TheInstitute extends Faction implements FactionActions {

    private static TheInstitute institute;

    public static TheInstitute getInstance(){
        if(institute == null){
            institute = new TheInstitute();
        }
        return institute;
    }

    @Override
    public void buildMine() {

    }
}
