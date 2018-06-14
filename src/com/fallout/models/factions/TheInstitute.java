package com.fallout.models.factions;

import com.fallout.config.KnownFactions;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.factions.definitions.FactionActions;
import com.fallout.models.resourses.EnclaveRemainder;
import com.fallout.models.resourses.NuclearPower;
import com.fallout.models.resourses.Oil;

public class TheInstitute extends Faction implements FactionActions {

    public TheInstitute() {
        super(KnownFactions.THE_INSTITUTE);
        try {
            this.getHeadquarter().addResource(new NuclearPower(100,10000));
            this.getHeadquarter().addResource(new EnclaveRemainder(500,5000));
            this.getHeadquarter().addResource(new Oil(300,3000));

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    @Override
    public void buildMine() {

    }
}
