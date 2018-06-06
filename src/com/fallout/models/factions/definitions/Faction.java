package com.fallout.models.factions.definitions;

import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class Faction {

    FactionProperties properties;

    public Faction(String nombre) {
        this.properties = new FactionProperties(nombre);
    }

}
