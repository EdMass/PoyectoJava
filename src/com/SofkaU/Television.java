package com.SofkaU;

public class Television extends Electrodomestico{
    int resolucion =20;
    boolean sintonizadorTDT = false;

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergia,
                      double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergia, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if(this.resolucion > 40) precio = precio*1.3;
        if(this.sintonizadorTDT == true) precio += 50;
        return precio;
    }
}
