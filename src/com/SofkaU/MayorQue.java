package com.SofkaU;



class MayorQue {

    static int num1 ;
    static int num2 ;

    /**
     *Al ingresar los números enteros en los parámetros, podrá saber cuál es el mayor
     *o si son iguales
     */
    static String comparar(int num1, int num2) {

        if (num1 < num2) {
            return "El número mayor entre los dos es " + String.valueOf(num2);
        } else if (num1 > num2) {
            return "El número mayor entre los dos es " + String.valueOf(num1);
        }
        return "Los números son iguales";
    }
}
