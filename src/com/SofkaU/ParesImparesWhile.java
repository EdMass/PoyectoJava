package com.SofkaU;

import java.util.ArrayList;
//import java.util.Arrays;

public class ParesImparesWhile {
    static ArrayList par = new ArrayList();
    static ArrayList impar = new ArrayList();
    static int i;

    static void almacenar(){
        i=0;
        while (i<=100){
            if(i % 2 == 0) par.add(i);
            else impar.add(i);
            i++;
        }
    }

    static String imprimir(){
        ParesImparesWhile.almacenar();
        return "Pares \n"+par.toString()+"\nImpares \n"+impar.toString();
        }
    }

