package com.SofkaU;

import java.util.ArrayList;
import java.util.Scanner;

public class DiferenciadorPalabras {

    static String diferenciar(){
        int contador;
        int index1;
        int index2;
        int index;
        ArrayList<Integer> lista = new ArrayList();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra a comparar: ");
        String texto1 = entrada.nextLine();
        System.out.println("Ingrese la segunda palabra a comparar: ");
        String texto2 = entrada.nextLine();


        index1 = texto1.length();
        index2 = texto2.length();

        if( index1 >= index2 ) index= index1;
        else index = index2;

        contador = 0;
        for(int i=0; i<index;i++) {
            if(texto1.charAt(i) == texto2.charAt(i) ) contador++;
            else lista.add(i);
        }

        String rta="";

        if (contador == index) {
            rta = "Son iguales";
        }
        else  if(contador!= index){
            for (int i=0; i< lista.size();i++){
                System.out.println("En la  posicion "+lista.get(i)+ " "+texto1.charAt(lista.get(i))+" y "+
                        texto2.charAt(lista.get(i))+" son diferentes");

            }
        }

        return rta;
    }

}
