package com.fallout.models.resourses;

import com.fallout.config.KnownFactions;
import com.fallout.controllers.factions.FactionController;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

public class NuclearPower extends Resourse {


    public NuclearPower( Integer amount,Integer headQuarterStorageLimit) {
        super(
                amount,
                FactionController.getInstance().getElementByName(KnownFactions.THE_INSTITUTE),
                headQuarterStorageLimit
        );

    }

}