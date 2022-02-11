package com.SofkaU;

import java.util.Scanner;

public class MayorIgualCero {

    private MayorIgualCero() {
    }

    static int devolver(){
        int numero = 0;
        do {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor: ");
        String valor = entrada.next();
        numero = Integer.parseInt(valor);
        }while (numero < 0);
        return numero;
    }
}
