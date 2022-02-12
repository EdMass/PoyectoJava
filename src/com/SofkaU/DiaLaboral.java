package com.SofkaU;

import java.util.Locale;
import java.util.Scanner;

public class DiaLaboral {

    static String selector(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia que desea conocer: ");
        String dia = entrada.next();
        dia = dia.toLowerCase(Locale.ROOT);
        switch (dia){
            case "lunes":  dia = "Día laboral";
                break;
            case "martes":  dia = "Día laboral";
                break;
            case "miercoles":  dia = "Día laboral";
                break;
            case "jueves":  dia = "Día laboral";
                break;
            case "viernes":  dia = "Día laboral";
                break;
            case "sabado":  dia = "Día no laboral";
                break;
            case "domingo":  dia = "Día no laboral";
                break;
            default: dia = "Día inválido";
                break;
        }
        return dia;
    }
}
