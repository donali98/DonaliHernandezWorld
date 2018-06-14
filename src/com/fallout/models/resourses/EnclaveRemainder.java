package com.fallout.models.resourses;

import com.fallout.config.KnownFactions;
import com.fallout.controllers.factions.FactionController;
import com.fallout.models.resourses.definitions.Resourse;

public class EnclaveRemainder extends Resourse {
    public EnclaveRemainder(Integer amount, Integer headQuarterStorageLimit) {
        super(
                amount,
                FactionController.getInstance().getElementByName(KnownFactions.THE_INSTITUTE),
                headQuarterStorageLimit
        );
    }
}
