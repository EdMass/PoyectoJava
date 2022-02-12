package com.SofkaU;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HastaMil {

    static ArrayList<Integer> contador(){

        ArrayList <Integer> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de inicio: ");
        String in = entrada.nextLine();
        int num = Integer.parseInt(in);


        for(int i=num; i<1000; i=i+2){
            lista.add(num);
            num += 2;
            if(num <=1000) {
                lista.add(num);
            }
        }
        return lista;
    }
}
