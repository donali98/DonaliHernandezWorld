package com.fallout.models.resourses.definitions;

import com.fallout.models.factions.definitions.Faction;

public class Resourse {
    private Integer amount;
    private Faction faction;

    public Resourse(Integer amount, Faction faction) {
        this.amount = amount;
        this.faction = faction;
    }
}
