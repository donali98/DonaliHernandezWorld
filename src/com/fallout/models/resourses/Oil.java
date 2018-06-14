package com.fallout.models.resourses;

import com.fallout.config.KnownFactions;
import com.fallout.models.resourses.definitions.Resourse;

public class Oil extends Resourse {

    public Oil(Integer amount, Integer headQuarterStorageLimit) {
        super(
                amount,
                KnownFactions.THE_INSTITUTE,
                headQuarterStorageLimit
        );
    }
}
