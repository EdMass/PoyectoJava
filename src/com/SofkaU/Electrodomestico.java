package com.SofkaU;

import java.util.Locale;

public class Electrodomestico {

    double precioBase =100;
    String color = "blanco";
    char consumoEnergia = 'F';
    double peso = 5;
    double aumento;

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    public double getPeso() {
        return peso;
    }

    public Electrodomestico() {

    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergia, double peso) {
        this.precioBase = precioBase;
        this.color = Electrodomestico.comprobarColor(color);
        this.consumoEnergia= Electrodomestico.comprobarConsumoEnergetico(consumoEnergia);
        this.peso = peso;


    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergia=" + consumoEnergia +
                ", peso=" + peso +"'}'";
    }

    private static char comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        String consumo = "ABCDEF";
        String convertor = String.valueOf(letra);
        if(consumo.contains(convertor)) return letra;
        return 'F';
    }

    private static String comprobarColor(String color){
        color = color.toLowerCase();
        String opcionesColor = "blanco, negro, rojo, azul y gris";
        if(opcionesColor.contains(color)) return color;
        else color = "blanco";
        return color;
    }

    public double precioFinal(){
        double precio =this.precioBase;
        precio += aunmentoPorConsumo()+aunmentoPorPeso();
        return precio;
        }

    public double aunmentoPorConsumo() {
        aumento = 0;
        char consumo = this.consumoEnergia;
        switch (consumo) {
            case 'A':
                aumento += 100;
                break;
            case 'B':
                aumento += 80;
                break;
            case 'C':
                aumento += 60;
                break;
            case 'D':
                aumento += 50;
                break;
            case 'E':
                aumento += 30;
                break;
            case 'F':
                aumento += 10;
                break;
        }
        return aumento;
    }

    public double aunmentoPorPeso(){
        aumento=0;
        double peso = this.peso;
        if( peso <= 19) aumento += 10;
        else if ( peso >= 20 && peso <= 49) aumento += 50;
        else if ( peso >= 50 && peso <= 79) aumento += 80;
        else if ( peso >= 80 ) aumento += 100;

        return aumento;
    }
}


