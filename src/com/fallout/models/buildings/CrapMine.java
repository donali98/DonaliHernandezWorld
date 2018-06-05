package com.fallout.models.buildings;

import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;

public class CrapMine extends Building {
    public CrapMine(String name, Faction faction, Double healthPoints, Double quiantityPerPhase, Integer creationWaitingPhases) {
        super(name, faction, healthPoints, quiantityPerPhase, creationWaitingPhases);
    }
}
