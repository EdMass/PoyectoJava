package com.SofkaU;

import java.util.Scanner;

public class PersonaMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad: ");
        String edadEntrada = entrada.nextLine();
        System.out.println("Ingrese el sexo: (H o M)");
        String sexoEntrada = entrada.nextLine();
        System.out.println("Ingrese el peso en Kg: ");
        String pesoEntrada = entrada.nextLine();
        System.out.println("Ingrese el altura en metros: ");
        String alturaEntrada = entrada.nextLine();

        int edad = Integer.parseInt(edadEntrada);
        char sexo = sexoEntrada.charAt(0);
        double peso = Double.parseDouble(pesoEntrada);
        double altura = Double.parseDouble(alturaEntrada);

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new  Persona();

        persona3.setNombre("Andres");
        persona3.setEdad(26);
        persona3.setSexo('H');
        persona3.setPeso(67);
        persona3.setAltura(1.75);

        persona1.calcularIMC();
        persona2.calcularIMC();
        persona3.calcularIMC();

        persona1.esMayorDeEdad();
        persona2.esMayorDeEdad();
        persona3.esMayorDeEdad();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }
}
