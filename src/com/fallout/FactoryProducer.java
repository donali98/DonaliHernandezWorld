package com.fallout;

import com.fallout.controllers.buildings.behavior.BuildingFactory;
import com.fallout.controllers.factions.behavior.FactionsFactory;
import com.fallout.models.Factories;

public class FactoryProducer {
    public static AbstractFactory getFactory(Factories factory){
        switch (factory){
            case FACTION_FACTORY:
                return new FactionsFactory();
            case BUILDING_FACTORY:
                return new BuildingFactory();
                default:
                    return null;
        }
    }
}
