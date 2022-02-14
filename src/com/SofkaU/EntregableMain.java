package com.SofkaU;

import java.util.ArrayList;

public class EntregableMain {
    public static void main(String[] args) {
        ArrayList<Videojuego> videojuegos = new ArrayList();
        ArrayList<Serie> series = new ArrayList<>();
        int contadorVideo = 0;
        int contadorSeries = 0;

        Videojuego videojuego1 = new Videojuego("video1",20,"shooter","compañia1");
        Videojuego videojuego2 = new Videojuego("video2",25,"estrategia","compañia2");
        Videojuego videojuego3 = new Videojuego("video3",30,"rol","compañia2");
        Videojuego videojuego4 = new Videojuego("video4",35,"8bits","compañia3");
        Videojuego videojuego5 = new Videojuego("video5",40,"mundo abierto","compañia1");

        videojuego1.entregar();
        videojuego3.entregar();
        videojuego5.entregar();

        Serie serie1 = new Serie("serie1",2,"comedia","productora1");
        Serie serie2 = new Serie("serie2",3,"accion","productora1");
        Serie serie3 = new Serie("serie3",4,"drama","productora3");
        Serie serie4 = new Serie("serie4",5,"fantasia","productora2");
        Serie serie5 = new Serie("serie5",4,"de epoca","productora4");

        serie4.entregar();
        serie2.entregar();

        videojuegos.add(videojuego1);
        videojuegos.add(videojuego2);
        videojuegos.add(videojuego3);
        videojuegos.add(videojuego4);
        videojuegos.add(videojuego5);

        series.add(serie1);
        series.add(serie2);
        series.add(serie3);
        series.add(serie4);
        series.add(serie5);


        for(Videojuego videojuego : videojuegos){

            if (videojuego.isEntregado()) contadorVideo++;
        }

        for(Serie serie : series){

            if (serie.isEntregado()) contadorSeries++;
        }

        System.out.println("las series entregadas son "+contadorSeries+" y la cantidad de videojuegos es "
                            +contadorVideo);

        System.out.println("la serie con mas temporadas es "+ serie5.toString());
        System.out.println("El videojuego con mas horas es "+videojuego5.toString());
    }
}
