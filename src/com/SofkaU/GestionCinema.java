package com.SofkaU;

import java.io.Console;
import java.util.Scanner;

public class GestionCinema {


    private static void selector(String menu){

        switch (menu){
            case "1":
                GestionCinema.menu();
                break;
            case "2":
                GestionCinema.menu();
                break;
            case "3":
                GestionCinema.menu();
                break;
            case "4":
                GestionCinema.menu();
                break;
            case "5":
                GestionCinema.menu();
                break;
            case "6":
                GestionCinema.menu();
                break;
            case "7":
                GestionCinema.menu();
                break;
            case "8":
                break;
            default:
                System.out.println("OPCION INCORRECTO");
                GestionCinema.menu();
        }
    }


    static String menu (){

        Scanner entrada = new Scanner(System.in);
        System.out.println("****** GESTION CINEMATOGRÁFICA ********" +"\n" +
                                        "1-NUEVO ACTOR" +"\n"+
                                        "2-BUSCAR ACTOR" +"\n"+
                                        "3-ELIMINAR ACTOR" +"\n"+
                                        "4-MODIFICAR ACTOR" +"\n"+
                                        "5-VER TODOS LOS ACTORES" +"\n"+
                                        "6- VER PELICULAS DE LOS ACTORES" +"\n"+
                                        "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" +"\n"+
                                        "8-SALIR\"" +"\n"+
                                        "ELIJE UNA OPCION");
        String in = entrada.nextLine();
        GestionCinema.selector(in);
        return "";
    }


}
