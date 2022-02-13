package com.SofkaU;

import java.util.ArrayList;

public class Persona {
    private String nombre = "";
    private int edad;
    private int dni = 12345678;
    private char sexo = 'H';
    private double peso;
    private double altura;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, int dni, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public static int calcularIMC(double peso, double altura){
        double imc;
        imc = (peso/(altura*altura));

        if(imc<20){
            return -1;
        }else if (20<=imc && imc<=25){
            return 0;
        }else if (imc>25){
            return 1;
        }
        return 0;
    }

    public static boolean esMayorDeEdad(int edad){
        if(edad >=18){
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private static void comprobarSexo(char sexo){
        sexo = Character.toUpperCase(sexo);
        if(sexo !='H' || sexo != 'M'){
            sexo = 'H';
        }
    }

     static int generaNumeros(){
        int numero=0;
        for (int i = 1; i < 9; i++) {
             numero =  (int) (Math.random() * 100000000);
        }
        return numero;
    }

}
