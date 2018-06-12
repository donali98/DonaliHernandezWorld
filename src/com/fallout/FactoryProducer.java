package com.fallout;


import com.fallout.controllers.buildings.BuildingsFactory;
import com.fallout.controllers.factions.FactionsFactory;
import com.fallout.models.Factories;

public class FactoryProducer {
    public static AbstractFactory getFactory(Factories factory){
        switch (factory){
            case FACTION_FACTORY:
                return new FactionsFactory();
            case BUILDING_FACTORY:
                return new BuildingsFactory();
                default:
                    return null;
        }
    }
}
