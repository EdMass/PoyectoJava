package com.SofkaU;

import java.util.Locale;
import java.util.Scanner;

public class CuentaVocales {

    static String contar(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la frase a modificar: ");
        String texto = entrada.nextLine();
        String lon = String.valueOf(texto.length());
        String numA = CuentaVocales.contarLetras(texto,'a');
        String numE = CuentaVocales.contarLetras(texto,'e');
        String numI = CuentaVocales.contarLetras(texto,'i');
        String numO = CuentaVocales.contarLetras(texto,'o');
        String numU = CuentaVocales.contarLetras(texto,'u');
        return "El texto ingresado tiene "+lon+" letras en total, "+numA+" vocales a, "+numE+" vocales e, \n"+
                numI+" vocales i, "+numO+" vocales o y "+numU+" vocales u";
    }

    static String contarLetras(String texto, char letra) {
        int index = 0;
        int numLetras = 0;
        int indexM = 0;

        texto=texto.toLowerCase(Locale.ROOT);
        index = texto.indexOf(letra);
        while (index != -1) {
            numLetras++;
            index = texto.indexOf(letra, index + 1);
        }


        String lon = String.valueOf(numLetras);
        return lon;
    }
}
