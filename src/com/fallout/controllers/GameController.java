package com.fallout.controllers;

import com.fallout.AbstractFactory;
import com.fallout.FactoryProducer;
import com.fallout.config.KnownFactions;
import com.fallout.controllers.factions.FactionController;
import com.fallout.models.Factories;
import com.fallout.models.factions.definitions.Faction;

public class GameController  {

    private static GameController gameController;
    private static AbstractFactory factionFactory = FactoryProducer.getFactory(Factories.FACTION_FACTORY);
    private static AbstractFactory resourcesFactory = FactoryProducer.getFactory(Factories.RESOURCES_FACTORY);

    private static Faction gamingFactions[];

    private GameController(){}

    public static synchronized GameController getInstance(){
        if(gameController==null){
            gameController = new GameController();
            //agrega las facciones existentes
            FactionController.getInstance().addElement(factionFactory.getFaction(KnownFactions.THE_INSTITUTE));
            FactionController.getInstance().addElement(factionFactory.getFaction(KnownFactions.BROTHERHOOD_OF_STEEL));

        }
        return gameController;
    }
    //funcion llamada al momento de que tanto jugador 1 y 2 elijen la faccion con la que quieren jugar
    public void createGameFactions(Faction factio1, Faction faction2){
        gamingFactions = new Faction[2];
        gamingFactions[0] = factio1;
        gamingFactions[1] = faction2;

    }
    public void play(){
        FactionController.getInstance().getElementByName(KnownFactions.THE_INSTITUTE).getHeadquarter().getResources();
    }


}
