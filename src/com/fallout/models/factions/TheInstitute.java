package com.fallout.models.factions;

import com.fallout.controllers.factions.behavior.FactionActions;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class TheInstitute extends Faction implements FactionActions {
    public TheInstitute(String nombre) {
        super(nombre);
    }

    @Override
    public void attackBuilding() {

    }
}
