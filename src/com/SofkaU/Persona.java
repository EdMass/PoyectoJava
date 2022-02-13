package com.SofkaU;

import java.util.ArrayList;
import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String dni = Persona.generaNumeros()+Persona.generaLetras();
    private char sexo = 'H';
    private double peso = 75;
    private double altura = 1.75;

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

    public String getNombre() {
        return nombre;
    }

    Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = Persona.comprobarSexo(sexo);
        double altura = this.altura;
        double peso = this.peso;
    }

    public Persona(String nombre, int edad, String dni, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = Persona.comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = Persona.comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC(){
        peso= this.peso;
        altura= this.altura;
        double imc;
        imc = (peso/(altura*altura));
        int medida = 0;
        if(imc<20){
            medida = -1;
        }else if (20<=imc && imc<=25){
            medida = 0;
        }else if (imc>25){
            medida = 1;
        }

        if(medida == -1) System.out.println(getNombre()+" está por debajo de su peso ideal ");
        else if (medida == 0) System.out.println(getNombre()+" está en su peso ideal ");
        else if(medida == 1) System.out.println(getNombre()+" está por encima de su peso ideal ");

        return "";
    }

    public boolean esMayorDeEdad(){
        edad = this.edad;
        if(edad >=18){
            System.out.println("Es mayor de edad");
            return true;
        }else {
            System.out.println("No es mayor de edad");
            return false;
        }
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

    private static char comprobarSexo(char sexo){
        sexo = Character.toUpperCase(sexo);
        if(sexo != 'M'){
            sexo = 'H';
        }
        return sexo;
    }

     private static String generaNumeros(){
        int numero=0;
        String salida;
        for (int i = 1; i < 9; i++) {
             numero =  (int) (Math.random() * 100000000);
        }
        salida = String.valueOf(numero);
        return salida;
    }
    //TODO generar el dni automatico

    private static String generaLetras(){
        String aleatoria = "";
        Random random = new Random();

        char charRandom = (char) (random.nextInt(26) + 'a');
        aleatoria += charRandom;

        return aleatoria;
    }

}
