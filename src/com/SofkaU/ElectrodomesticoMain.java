package com.SofkaU;

import java.util.ArrayList;

public class ElectrodomesticoMain {
    public static void main(String[] args) {
        double contarLavadora = 0;
        double contarElectro = 0;
        double contarTv = 0;
        ArrayList<Electrodomestico> listado = new ArrayList<>();

        Electrodomestico electrodomestico1 = new Electrodomestico(100, "negro", 'A', 40);
        Electrodomestico electrodomestico2 = new Electrodomestico(100, "blanco", 'B', 70);
        Lavadora lavadora2 = new Lavadora(110, "blanco", 'b', 40, 35);
        Lavadora lavadora3 = new Lavadora(105, "azul", 'c', 40, 30);
        Lavadora lavadora4 = new Lavadora(107, "gris", 'd', 40, 30);
        Lavadora lavadora1 = new Lavadora(103, "rojo", 'e', 40, 27);
        Television television1 = new Television(100, "negro", 'f', 15, 22, false);
        Television television2 = new Television(103, "blanco", 'f', 15, 30, true);
        Television television3 = new Television(106, "gris", 'f', 15, 35, true);
        Television television4 = new Television(109, "azul", 'f', 15, 40, true);

        listado.add(electrodomestico1);
        listado.add(electrodomestico2);
        listado.add(lavadora1);
        listado.add(lavadora2);
        listado.add(lavadora3);
        listado.add(lavadora4);
        listado.add(television1);
        listado.add(television2);
        listado.add(television3);
        listado.add(television4);

        for (Electrodomestico electrodomestico : listado) {


            if (electrodomestico instanceof Lavadora) contarLavadora += electrodomestico.precioFinal();
            if (electrodomestico instanceof Television) contarTv += electrodomestico.precioFinal();
            if (electrodomestico instanceof Electrodomestico) contarElectro += electrodomestico.precioFinal();

        }
        double total = contarElectro+contarLavadora+contarTv;
        System.out.println("El resultado total es "+total+" de electrodomésticos es "+contarElectro+
                ", de lavadoras es "+contarLavadora+" y de TVs es "+contarTv);
    }
}

