package com.SofkaU;

import java.util.Scanner;

public class AreaCirculo {



    static String calculo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio del circulo: ");
        String radioUsu = entrada.next();
        Double radio = Double.parseDouble(radioUsu);
        Double area = Math.round(Math.pow(radio,2)*Math.PI*100.0)/100.0;
        String areaStr = String.valueOf(area);
        return "El area del circulo es: "+areaStr;
    }
}
