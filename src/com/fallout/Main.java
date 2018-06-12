package com.fallout;


import com.fallout.config.Global;
import com.fallout.config.KnownFactions;
import com.fallout.controllers.GameController;
import com.fallout.controllers.factions.FactionController;
import com.fallout.models.Factories;
import com.fallout.models.factions.definitions.Faction;

public class Main {

    public static void main(String[] args) {

        //Cargando los controladores
        //obteniendo la factory de facciones
        GameController  gameController = GameController.getInstance();
        Faction faction1, faction2;

        System.out.println("******************FALLOUT STRATEGY(DONALI HERNANDEZ'S WORLD)******************\n");
        int opSelected = Global.displayMenu(Global.MAIN_MENU);
        switch (opSelected){
            case 1:
                for (int i= 0; i<2; i++){
                    System.out.println("Jugador "+(i+1)+", elija su faccion:");
                    opSelected = Global.displayMenu(Global.getAvailableFactions());
                    switch (opSelected){
                        case 1:
                            System.out.println(FactionController.getInstance().getElementByName(KnownFactions.THE_INSTITUTE).getFactionId());
                            faction1 =  FactionController.getInstance().getElementById(1);
                        break;
                    }
                }
            break;
        }

        //Cargando las facciones existentes en el juego







    }


}
