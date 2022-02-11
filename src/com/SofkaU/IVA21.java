package com.SofkaU;

import java.util.Scanner;

public class IVA21 {

    static String precioIva() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del producto para calcular el precio con IVA: ");
        String precio = entrada.next();
        Double precioIva = Math.round(Double.parseDouble(precio)*1.21*100.0)/100.0;
        String precioIvaStr = String.valueOf(precioIva);
        return "El precio del prducto con iva es: "+precioIvaStr;
    }
}
