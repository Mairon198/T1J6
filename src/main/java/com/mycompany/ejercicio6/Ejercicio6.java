//Mairon Omar Licona Duarte
//2018100010200
/*Crear un programa que imprima en consola un nombre de estudiante, una nota y una etiqueta que diga
Aprobado o Reprobado, dependiendo del valor de la nota que tenga*/

package com.mycompany.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor ingrese el primer nombre del estudiante: ");
        String nombre = scanner.nextLine();
        

        System.out.print("Por favor ingrese la nota final del estudiante: ");
        double nota = scanner.nextDouble();
        
        String resultado = (nota>=70)? "Aprobo la clase" : "Reprobo la clase";
        
        System.out.println("Estudiante: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("El estudiante: " + resultado);
        
        scanner.close();
    }
}