package com.fallout.models.resourses;

import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

public class NuclearPower extends Resourse {


    public NuclearPower(String name, Faction faction, Integer amount, Integer amountPerPhase) {
        super(name, faction, amount, amountPerPhase);
    }

    public NuclearPower(String name, Faction faction, Integer amount, Integer amountPerPhase, Integer hQLimit) {
        super(name, faction, amount, amountPerPhase, hQLimit);
    }
}