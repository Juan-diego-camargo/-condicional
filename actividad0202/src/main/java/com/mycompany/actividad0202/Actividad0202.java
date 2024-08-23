/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.actividad0202;

/**
 *
 * @author Sala de Sistemas
 */
public class Actividad0202 {

     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         if (args.length != 4) {
            System.out.println("Uso: java PersonaInfo <nombre> <apellido> <edad> <sexo>");
            return;
        }
        
        // Leer parámetros de entrada
        String nombre = args[0];
        String apellido = args[1];
        int edad;
        String sexo = args[3];
        
        try {
            edad = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("La edad debe ser un número entero.");
            return;
        }
        
        // Evaluar si es mayor o menor de edad
        if (edad >= 18) {
            System.out.println(nombre + " " + apellido + " es mayor de edad.");
        } else {
            System.out.println(nombre + " " + apellido + " es menor de edad.");
        }
        
        // Evaluar el sexo
        if (sexo.equalsIgnoreCase("Masculino")) {
            System.out.println(nombre + " " + apellido + " es un Hombre.");
        } else if (sexo.equalsIgnoreCase("Femenino")) {
            System.out.println(nombre + " " + apellido + " es una Mujer.");
        } else {
            System.out.println("Sexo no reconocido. Debe ser 'Masculino' o 'Femenino'.");
        }
    }
}