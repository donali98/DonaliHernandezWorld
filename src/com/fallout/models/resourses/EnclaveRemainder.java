package com.fallout.models.resourses;

import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

public class EnclaveRemainder extends Resourse {
    public EnclaveRemainder(Integer amount, Faction faction, Integer headQuarterStorageLimit) {
        super(amount, faction, headQuarterStorageLimit);
    }
}
