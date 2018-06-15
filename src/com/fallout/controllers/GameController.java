package com.fallout.controllers;

import com.fallout.AbstractFactory;
import com.fallout.FactoryProducer;
import com.fallout.config.Global;
import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.controllers.factions.FactionController;
import com.fallout.controllers.resourses.ResourcesController;
import com.fallout.models.Factories;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.EnclaveRemainder;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class GameController  {

    private static GameController gameController;
    private static AbstractFactory factionFactory = FactoryProducer.getFactory(Factories.FACTION_FACTORY);
    private static AbstractFactory buildingFactory = FactoryProducer.getFactory(Factories.BUILDING_FACTORY);

    private static ArrayList<ArrayList<KnownBuildings>> factionsAvailableBuilds;
    private static Faction gamingFactions[];
    private byte turn;
    private static Integer phase;
    private static Integer finishedTurnsCount;

    //Opciones base para jugar un turno
    private static String[] inGameMenu = new String[]{
            "1-Crear Edificacion",
            "2-Entrenar Tropas",
            "3-Terminar Turno"
    };

    private GameController(){}

    public static synchronized GameController getInstance(){
        if(gameController==null){
            gameController = new GameController();

            factionsAvailableBuilds = new ArrayList<>();

            //agrega las facciones existentes
            FactionController.getInstance().addElement(factionFactory.getFaction(KnownFactions.THE_INSTITUTE));
            FactionController.getInstance().addElement(factionFactory.getFaction(KnownFactions.BROTHERHOOD_OF_STEEL));


        }
        return gameController;
    }
    //funcion llamada al momento de que tanto jugador 1 y 2 elijen la faccion con la que quieren jugar
    public void createGameFactions(Faction []factions){
        gamingFactions = new Faction[2];
        gamingFactions[0] = factions[0];
        gamingFactions[1] = factions[1];
        //obteniendo las edificaciones disponibles por faccion
        factionsAvailableBuilds.add(gamingFactions[0].getHeadquarter().getCrafteableBuilds());
        factionsAvailableBuilds.add(gamingFactions[1].getHeadquarter().getCrafteableBuilds());

    }
    public void play(){
        //iniciando la partida, creando la fase
        int opSelected = 0;
        turn = 1;
        String buildingMenu[];

        //mientras no se destruya ningun centro de mando
        while (true){
            while (opSelected!=-1){
                switch (turn){
                    case 1:
                        displayInfo(gamingFactions[0].getFactionName());
                        opSelected = Global.displayMenu(inGameMenu);
                        switch (opSelected){
                            case 1: {
                                buildingMenu = getBuildingMenu(0);
                                int buildSelected = Global.displayMenu(buildingMenu);
                                break;
                            }
                            case 3:
                                //Terminando turno
                                turn = 0;
                            break;
                        }
                    break;
                    case 0:
                        displayInfo(gamingFactions[1].getFactionName());
                        opSelected = Global.displayMenu(inGameMenu);
                        switch (opSelected){
                            case 1: {
                                buildingMenu = getBuildingMenu(1);
                                displayInfo(gamingFactions[1].getFactionName());
                                int buildSelected = Global.displayMenu(buildingMenu);
                                break;
                            }
                            case 3:
                                //Terminando turno
                                turn = 1;
                                break;
                        }
                        break;
                }
            }
        }

    }

    private void displayInfo(KnownFactions faction){
        System.out.println("--------------------Turno de "+faction.toString()+"--------------------");
        for (Resourse resourse: FactionController.getInstance().getElementByName(faction).getHeadquarter().getResources()){
            System.out.println("--------------------------------------------------------");
            System.out.println("Id:"+resourse.getId()+" Recurso: "+resourse.getClass().getSimpleName()+", Cantidad: "+resourse.getAmount());
        }
        System.out.println("--------------------------------------------------------");

    }

    private String[] getBuildingMenu(int faction){
        String[]buildingMenu;
        buildingMenu = new String[factionsAvailableBuilds.get(faction).size()];

        for (int i  = 0; i<factionsAvailableBuilds.get(faction).size();i++){
            buildingMenu[i] = (i+1)+"- "+factionsAvailableBuilds.get(faction).get(i);
        }
        return buildingMenu;
    }


}
