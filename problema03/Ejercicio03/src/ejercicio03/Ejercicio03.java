/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int tipoEmple;
        int anios;
        int porcentaje = 0;
        double sueldoInicial;
        double incremento = 0;
        double bonificacion = 0;
        double sueldoFinal = 0;
        
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el número del tipo de empleado");
        tipoEmple = entrada.nextInt();
        
        System.out.println("Ingrese los años de servicio");
        anios = entrada.nextInt();
        
        System.out.println("Ingrese el sueldo inicial");
        sueldoInicial = entrada.nextDouble();
        
        if (tipoEmple > 0 && anios > 0){
            
            switch (tipoEmple){
                
                case 1:
                    porcentaje = 5;
                break;
                
                case 2:
                    porcentaje = 7;
                break;
                
                case 3:
                    porcentaje = 9;
                break;
                
                case 4:
                    porcentaje = 12;
                break;
                
                default:
                    porcentaje = 15;
                break;
                 
            }
            
            if (anios < 2){
                bonificacion = 0;
            }else{
                if (anios >= 2 && anios < 5){
                    bonificacion = 30;
                }else{
                    if (anios >= 5 && anios < 10){
                        bonificacion = 60;
                    }else{
                        bonificacion = 100;
                    }
                }
            }
            
            incremento = (sueldoInicial * porcentaje) / 100;
            sueldoFinal = sueldoInicial + incremento + bonificacion;
            
            System.out.printf("REPORTE DE INCREMENTO SALARIAL\n\n"
                    + "Empleado: %s\n"
                    + "Tipo de empleado: %d\n"
                    + "Años de servicio: %d\n\n"
                    + "Sueldo inicial: $%.2f\n"
                    + "Porcentaje de incremento: %d%%\n"
                    + "Incremento salarial: $%.2f\n"
                    + "Bonificación por antigüedad: $%.2f\n\n"
                    + "Nuevo sueldo: $%.2f\n", nombre, tipoEmple, anios,
                    sueldoInicial, porcentaje, incremento,
                    bonificacion, sueldoFinal);
            
                        
        } else{
            System.out.println("Los números deben ser positivos,"
                    + " intente nuevamente");
        }
        
    }
    
}
