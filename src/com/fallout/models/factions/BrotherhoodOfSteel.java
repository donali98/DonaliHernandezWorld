package com.fallout.models.factions;

import com.fallout.models.factions.definitions.Faction;

public class BrotherhoodOfSteel extends Faction {


    private static BrotherhoodOfSteel brotherhoodOfSteel;

    private BrotherhoodOfSteel(String nombre) {
        super(nombre);
    }

    public static BrotherhoodOfSteel getInstance(){
        if(brotherhoodOfSteel == null){
            brotherhoodOfSteel = new BrotherhoodOfSteel("Brotherhood of Steel");
        }
        return brotherhoodOfSteel;
    }
}
