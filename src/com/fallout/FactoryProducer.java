package com.fallout;


import com.fallout.controllers.buildings.BuildingsFactory;
import com.fallout.controllers.factions.FactionsFactory;
import com.fallout.controllers.resourses.ResourcesFactory;
import com.fallout.models.Factories;

public class FactoryProducer {
    public static AbstractFactory getFactory(Factories factory){
        switch (factory){
            case FACTION_FACTORY:
                return new FactionsFactory();
            case BUILDING_FACTORY:
                return new BuildingsFactory();
            case RESOURCES_FACTORY:
                return new ResourcesFactory();
                default:
                    return null;
        }
    }
}
