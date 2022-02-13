package com.SofkaU;

public class Lavadora extends Electrodomestico{

    int carga = 5;

    public int getCarga() {
        return carga;
    }

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergia, double peso, int carga) {
        super(precioBase, color, consumoEnergia, peso);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if(this.carga > 30) precio +=  30;
        return precio;
    }
}
