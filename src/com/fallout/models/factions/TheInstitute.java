package com.fallout.models.factions;

import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.EnclaveRemainder;
import com.fallout.models.resourses.NuclearPower;
import com.fallout.models.resourses.Oil;

//ya implemento las factionActions
public class TheInstitute extends Faction  {

    public TheInstitute() {
        try {
            this.getHeadquarter().addResource(new NuclearPower(100,this,10000));
            this.getHeadquarter().addResource(new EnclaveRemainder(500,this,5000));
            this.getHeadquarter().addResource(new Oil(300,this,3000));

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
