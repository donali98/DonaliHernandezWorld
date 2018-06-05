package com.fallout.models.factions;

import com.fallout.models.factions.definitions.Faction;

public class BrotherhoodOfSteel extends Faction {


    public BrotherhoodOfSteel(String nombre, Faction faction, Double healthPoints, Double quantityPerPhase, Integer creationWaitingPhases) {
        super(nombre, faction, healthPoints, quantityPerPhase, creationWaitingPhases);
    }
}
