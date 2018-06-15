package com.fallout.controllers.factions;

import com.fallout.config.KnownBuildings;


import java.util.ArrayList;


public interface HeadquarterActions<A> {
    void createBuild(KnownBuildings building);
    ArrayList<A> getBuiltBuilds();

}
