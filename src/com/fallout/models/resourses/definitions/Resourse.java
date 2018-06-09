package com.fallout.models.resourses.definitions;

import com.fallout.models.factions.definitions.Faction;

public class Resourse {
    private Integer amount;
    private Integer headQuarterStorageLimit;
    private Faction faction;

    public Resourse(Integer amount, Faction faction, Integer headQuarterStorageLimit) {
        this.amount = amount;
        this.faction = faction;
        this.headQuarterStorageLimit = headQuarterStorageLimit;
    }

    public Integer getAmount() {
        return amount;
    }

    public Faction getFaction() {
        return faction;
    }

    public Integer getHeadQuarterStorageLimit() {
        return headQuarterStorageLimit;
    }
}
