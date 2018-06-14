package com.fallout;


import com.fallout.config.Global;
import com.fallout.controllers.GameController;
import com.fallout.controllers.factions.FactionController;
import com.fallout.models.factions.definitions.Faction;

/***
 * Los facciones se crean en el GameController, los centros de mando se crean al crearse las facciones
 * y los recursos iniciales por faccion se asignan al crearse el centro de mando
 */
public class Main {

    public static void main(String[] args) {

        //Cargando los controladores

        GameController  gameController = GameController.getInstance();
        Faction faction1 =null, faction2 = null;

        System.out.println("******************FALLOUT STRATEGY(DONALI HERNANDEZ'S WORLD)******************\n");
        int opSelected = Global.displayMenu(Global.MAIN_MENU);
        switch (opSelected){
            case 1:
                for (int i= 0; i<2; i++){
                    System.out.println("Jugador "+(i+1)+", elija su faccion:");
                    opSelected = Global.displayMenu(Global.getAvailableFactions());
                    switch (opSelected){
                        case 1:
                            faction1 =  FactionController.getInstance().getElementById(1);
                        break;
                        case 2:
                            faction2 =  FactionController.getInstance().getElementById(2);
                        break;
                    }
                }
                GameController.getInstance().createGameFactions(faction1, faction2);
                GameController.getInstance().play();
            break;
        }

    }


}
