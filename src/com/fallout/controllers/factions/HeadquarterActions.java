package com.fallout.controllers.factions;

import com.fallout.config.KnownBuildings;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;


public interface HeadquarterActions<A> {
    boolean addResource(Resourse resource);
    void createBuild(KnownBuildings building);
    ArrayList<A> getBuiltBuilds();

}
