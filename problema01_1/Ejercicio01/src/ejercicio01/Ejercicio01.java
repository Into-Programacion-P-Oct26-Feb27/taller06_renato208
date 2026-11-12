/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int operacion;
        double num1;
        double num2;
        double solucion = 0;

        System.out.println("Ingrese el primer numero:");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        num2 = entrada.nextDouble();

        if (num1 >= num2) {

            System.out.println("Ingrese el número correspondiente a la"
                    + " operacíon"
                    + "que desea realizar:\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicación\n"
                    + "4. División\n"
                    + "5. Módulo\n"
                    + "6. Potencia\n");
            operacion = entrada.nextInt();

            switch (operacion) {

                case 1:
                    solucion = num1 + num2;
                    break;

                case 2:
                    solucion = num1 - num2;
                    break;

                case 3:
                    solucion = num1 * num2;
                    break;

                case 4:
                    solucion = num1 / num2;
                    break;

                case 5:
                    solucion = num1 % num2;
                    break;

                case 6:
                    solucion = Math.pow(num1, num2);
                    break;

                default:
                    System.out.println("El número ingresado de la operación es "
                            + "inválido\n");
                    break;
                    
            }

            System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                        + "Primer número: %.2f\n"
                        + "Segundo número: %.2f\n"
                        + "Operación seleccionada: %s\n\n"
                        + "Resultado: %.2f", num1, num2, operacion, solucion);
 
        } else {
            System.out.println("Los numeros ingresados no son correctos");
        }

    }

}
