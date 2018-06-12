package com.fallout.config;

import com.fallout.controllers.factions.FactionController;

import java.util.Scanner;

/**
 * Clase donde seran almacenadas todos los valores base
 * de los objetos
 */

public class Global {

    /**
     *     Variables que representan el porcentaje de adicion/sustraccion a los
     *     puntos bases de cada objeto de cada faccion para definir fortalezas
     */

     public static String[] getAvailableFactions(){
         int length = FactionController.getInstance().returnAll().size();
         String[] availableFactions = new String[length];
         for (int i = 0; i<length;i++){
             availableFactions[i] =(i+1)+"- "+FactionController.getInstance().returnAll().get(i).getFactionName();
         }
         return availableFactions;
     }
     public static final String [] MAIN_MENU = {
             "1-Iniciar Partida",
             "2-Instrucciones"
     };

    public static int displayMenu(String[] opciones){
        Scanner scanner = new Scanner(System.in);
        int op = 10;
        while ( op !=0){
            try {
                System.out.println("-----Seleccione una opcion------");
                for (String opcion: opciones){
                    System.out.println(opcion);
                }
                op = scanner.nextInt();
                if(op>opciones.length) System.out.println("Opcion no valida");
                else return op;

            }
            catch (Exception e){
                scanner.next();
                System.out.println("Valor no valido");
            }
        }
        return  op;

    }


}
