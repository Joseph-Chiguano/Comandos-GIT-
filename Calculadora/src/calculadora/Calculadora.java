/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simple");
        System.out.println("Seleccione la operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        
        System.out.print("Ingrese el numero de la operacion: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + (num1 + num2));
            case 2 -> System.out.println("Resultado: " + (num1 - num2));
            case 3 -> System.out.println("Resultado: " + (num1 * num2));
            case 4 -> {
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
            }
            default -> System.out.println("Opcion  invalida.");
        }
        scanner.close();
    }
}
