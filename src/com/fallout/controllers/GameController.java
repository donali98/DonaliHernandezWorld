package com.fallout.controllers;

import com.fallout.AbstractFactory;
import com.fallout.FactoryProducer;
import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.controllers.factions.FactionController;
import com.fallout.models.Factories;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;

import java.util.ArrayList;

public class GameController  {

    private static GameController gameController;
    private static AbstractFactory factionFactory = FactoryProducer.getFactory(Factories.FACTION_FACTORY);
    private static AbstractFactory buildingFactory = FactoryProducer.getFactory(Factories.BUILDING_FACTORY);

    private static ArrayList<ArrayList<KnownBuildings>> factionsAvailableBuilds;
    private static Faction gamingFactions[];
    private static Integer phase;

    private static ArrayList<String> inGameMenu;

    private GameController(){}

    public static synchronized GameController getInstance(){
        if(gameController==null){
            gameController = new GameController();


            //Inicializa el menu del juego
            inGameMenu = new ArrayList<>();
            factionsAvailableBuilds = new ArrayList<>();

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
        //obteniendo las edificaciones disponibles por faccion
        factionsAvailableBuilds.add(gamingFactions[0].getHeadquarter().getCrafteableBuilds());
        factionsAvailableBuilds.add(gamingFactions[1].getHeadquarter().getCrafteableBuilds());

    }
    public void play(){
        //iniciando la partida, creando la fase
        phase = 0;
        gamingFactions[0].getHeadquarter().createBuild(factionsAvailableBuilds.get(0).get(0));
        ArrayList<Building> builtBuilds =  gamingFactions[0].getHeadquarter().getBuiltBuilds();
        for (Building building:builtBuilds){
            System.out.println(building.getProperties().getBuildName());
        }
    }


}
