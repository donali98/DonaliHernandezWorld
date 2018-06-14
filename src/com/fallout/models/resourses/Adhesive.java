package com.fallout.models.resourses;

import com.fallout.config.KnownFactions;
import com.fallout.models.resourses.definitions.Resourse;

public class Adhesive extends Resourse {
    public Adhesive(Integer amount,  Integer headQuarterStorageLimit) {
        super(amount, KnownFactions.BROTHERHOOD_OF_STEEL, headQuarterStorageLimit);
    }
}
