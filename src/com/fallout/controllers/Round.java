package com.fallout.controllers;

import com.fallout.AbstractFactory;
import com.fallout.FactoryProducer;
import com.fallout.models.Factories;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;

import java.util.ArrayList;

public class Round {

    private ArrayList<Faction> factions;

    public void createFactions(){
        factions = new ArrayList<>();
        //AbstractFactory factory = FactoryProducer.getFactory(Factories.FACTION_FACTORY);

    }


}
