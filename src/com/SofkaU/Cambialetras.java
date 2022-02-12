package com.SofkaU;

import java.util.Scanner;

public class Cambialetras {

    static String modificador(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la frase complementaria a 'La sonrisa sera la mejor arma contra la tristeza': ");
        String frase = entrada.next();
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        texto = texto.replaceAll("a","e");
        return texto+" "+frase;
    }
}
