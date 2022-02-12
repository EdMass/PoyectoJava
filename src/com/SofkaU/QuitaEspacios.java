package com.SofkaU;

import java.util.Scanner;

public class QuitaEspacios {

    static String remover(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la frase a modificar: ");
        String texto = entrada.nextLine();
        String frase = texto.replace(" ","");
        return frase;
    }
}
