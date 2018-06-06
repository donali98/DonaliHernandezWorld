package com.fallout;

import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.ResourseProperties;

public interface AbstractFactory {

    Faction getFaction();
    Building getBuilding();
    ResourseProperties getResourse();

}
