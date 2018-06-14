package com.fallout;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.HashMap;

public interface AbstractFactory {

    Building getBuilding(KnownBuildings building);
    Faction getFaction(KnownFactions faction);
    HashMap<Integer, Resourse> getFactionResources(KnownFactions faction);

}
