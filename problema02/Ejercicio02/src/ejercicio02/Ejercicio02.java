/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String descripcion = "";
        int tipoVehi;
        double avaluo;
        double peaje;
        double porcentaje = 0;
        double total;
        double recargo = 0;
        double valorFijo = 0;

        System.out.println("Ingrese el nombre del propietario:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el número correspondiente"
                + " al tipo de vehículo:\n"
                + "1. Vehículo liviano particular\n"
                + "2. Vehículo grande particular\n"
                + "3. Taxi\n"
                + "4. Bus urbano\n");
        tipoVehi = entrada.nextInt();

        System.out.println("Ingrese el avalúo del vehículo:");
        avaluo = entrada.nextDouble();

        if (tipoVehi <= 4 && tipoVehi > 0) {
            switch (tipoVehi) {

                case 1:
                    if (avaluo > 30000) {
                        recargo = 1.50;
                    }
                    valorFijo = 2;
                    porcentaje = 0.01;
                    descripcion = "Vehículo liviano particular";
                    break;

                case 2:
                    if (avaluo > 30000) {
                        recargo = 1.50;
                    }
                    valorFijo = 2.50;
                    porcentaje = 0.02;
                    descripcion = "Vehículo grande particular";
                    break;

                case 3:
                    valorFijo = 1.50;
                    porcentaje = 0.04;
                    descripcion = "Taxi";
                    break;

                case 4:
                    valorFijo = 2.20;
                    porcentaje = 0.05;
                    descripcion = "Bus urbano";
                    break;

            }

            peaje = (avaluo * porcentaje) / 100 + valorFijo;
            total = peaje + recargo;
            System.out.printf("Peaje \"Buena Vía\"\n"
                    + "Propietario: %s\n"
                    + "Tipo: %s\n"
                    + "Avalúo: $%.2f\n"
                    + "Valor base del peaje: $%.2f\n"
                    + "Recargo: $%.2f\n\n"
                    + "Total a cancelar: $%.2f\n", nombre, descripcion,
                    avaluo, peaje, recargo, total);
                
        } else {
            System.out.println("El tipo de vehiculo no es válido, "
                    + "intente nuevamente");
        }
    }

}
