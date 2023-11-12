/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;

public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Operaciones disponibles:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");

        System.out.print("Seleccione una operación (1-2): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Suma: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resta: " + restar(num1, num2));
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
