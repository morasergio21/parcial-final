/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import Vehiculo.Vehículo;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vehículo miVehículo = new Vehículo();
        Scanner miScan = new Scanner(System.in);
        
        int entrada = 0;
        System.out.println("SELECCIONE");
        System.out.println("1. Ingresar vehículo");
        System.out.println("2. Retirar vehículo");
        System.out.println("3. Consultar cupos");
        entrada = miScan.nextInt();

        if (1 <= entrada && entrada <= 3) {
            switch (entrada) {
                case 1:
                    System.out.println("LOS DATOS DE SU VEHICULO");
                    System.out.println("placa");
                case 2:
                    System.out.println("El valor a pagar es");
                    System.out.println("placa");
                case 3:
                    System.out.println("INGRESE LOS SIGUIENTES DATOS");
                    System.out.println("placa");    
                default:
                    System.out.println("INGRESE LOS SIGUIENTES DATOS");
                    System.out.println("placa");
            }
        }

    }

}
