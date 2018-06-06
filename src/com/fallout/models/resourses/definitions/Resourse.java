package com.fallout.models.resourses.definitions;

import com.fallout.models.factions.definitions.Faction;

public class Resourse {
    ResourseProperties properties;

    public Resourse(String name, Faction faction, Integer amount, Integer amountPerPhase) {
        this.properties = ResourseProperties.getResourse(name,
                faction,
                amount,
                amountPerPhase).build();
    }
    public Resourse(String name, Faction faction, Integer amount, Integer amountPerPhase,Integer hQLimit) {
        this.properties = ResourseProperties.getResourse(name,
                faction,
                amount,
                amountPerPhase).hqLimit(hQLimit).build();
    }
}
