package com.fallout.controllers.resourses;

import com.fallout.AbstractFactory;
import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.*;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;
import java.util.HashMap;

public class ResourcesFactory  implements AbstractFactory {
    @Override
    public Building getBuilding(KnownBuildings building) {
        return null;
    }

    @Override
    public Faction getFaction(KnownFactions faction) {
        return null;
    }

    @Override
    public ArrayList<Resourse> getFactionResources(KnownFactions faction) {

        switch (faction){
            case THE_INSTITUTE:
                ResourcesController.getInstance().addElement( (new EnclaveRemainder(500,5000)));
                ResourcesController.getInstance().addElement((new NuclearPower(500,5000)));
                ResourcesController.getInstance().addElement(new Oil(500,5000));
                return ResourcesController.getInstance().returnAll();
            case BROTHERHOOD_OF_STEEL:
                ResourcesController.getInstance().addElement(new Steel(500,5000));
                ResourcesController.getInstance().addElement(new Aluminium(500,5000));
                ResourcesController.getInstance().addElement(new Adhesive(500,5000));
                return ResourcesController.getInstance().returnAll();
            default:
                return null;
        }
    }
}
