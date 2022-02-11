package com.SofkaU;

import java.util.Scanner;

public class MayorQueConsola extends  MayorQue{
    static String entrada1;
    static String entrada2;


    static String comparar() {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número a comparar por favor: ");
        entrada1 = Entrada.next();
        System.out.println("Ingrese el segundo número a comparar por favor: ");
        entrada2 = Entrada.next();
        num1 = Integer.parseInt(entrada1);
        num2 = Integer.parseInt(entrada2);
        return MayorQue.comparar(num1, num2);
    }
}
