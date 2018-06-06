package com.fallout.models.factions;

import com.fallout.controllers.factions.behavior.FactionActions;
import com.fallout.models.factions.definitions.Faction;


public class TheInstitute extends Faction implements FactionActions {

    private static TheInstitute institute;

    private TheInstitute() {
        super("The Institute");
    }
    public static TheInstitute getInstance(){
        if(institute == null){
            institute = new TheInstitute();
        }
        return institute;
    }

    @Override
    public void attackBuilding() {

    }
}
