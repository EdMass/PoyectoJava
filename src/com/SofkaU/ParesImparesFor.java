package com.SofkaU;

import java.util.ArrayList;

public class ParesImparesFor {

    private static ArrayList par = new ArrayList();
    private static ArrayList impar = new ArrayList();
    static int i;

    static void almacenar(){

        for (i =0; i<=100; i++){
            if(i % 2 == 0) par.add(i);
            else impar.add(i);
        }
    }

    static String imprimir(){
        ParesImparesFor.almacenar();
        return "Pares \n"+par.toString()+"\nImpares \n"+impar.toString();
    }
}
