package com.fallout;

import com.fallout.config.KnownFactions;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;

public interface AbstractFactory {

    Building getBuilding(String building);
    Faction getFaction(KnownFactions faction);

}
