package Aplication;

import java.util.Scanner;
import java.util.UUID;

/**
 * Clase main
 * El programa se ejecuta desde aqui.
 * Registrar una lista de vehiculos para su posterior venta
 * @version 1.0.0 2022/02/13
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Main {

    /**
     * Instruciones del programa para el usuario
     * Crea los vehiculos con sus atributos definidos
     * @param args Consola
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in).useDelimiter("\\n");
        int option;
        String transport;
        String color;
        String brand;
        double mileage;
        int passengers;
        int wheels;
        int registerVehicle;
        UUID sellVehicle;
        int soldVehicle;

        System.out.println("""
                Bienvenido a este programa que le permite registrar los datos de 10 vehículos
                y elegir los que desea vender.""");


        VehicleStore store = new VehicleStore();

        System.out.println("""
                   \n Registrar lista de vehículos
                    1.Si
                    2.No""");
        registerVehicle = console.nextInt();
        if (registerVehicle == 1) {
            for (int vehicle = 0; vehicle < 10; vehicle++) {
                System.out.println("""
                            \n El vehículo se desplaza por: 
                            1.Tierra
                            2.Aire
                            3.Agua""");
                option = console.nextInt();
                if (option == 1) {
                    transport = "Tierra";
                } else if (option == 2) {
                    transport = "Aire";
                } else {
                    transport = "Agua";
                }
                System.out.println("Digite la marca del vehículo: ");
                brand = console.next();
                System.out.println("Digite cuantas ruedas tiene el vehículo. Si no tiene ruedas digite 0");
                wheels = console.nextInt();
                System.out.println("Digite el color del vehículo: ");
                color = console.next();
                System.out.println("Digite el kilometraje del vehículo: ");
                mileage = console.nextDouble();
                System.out.println("Digite cuantos pasajeros caben en el vehículo: ");
                passengers = console.nextInt();

                store.addVehicle(new Vehicle(transport, brand, color, mileage, passengers, wheels));
                System.out.println("Vehículo registrado");
            }
            store.dataArrayVehicle();
            System.out.println("""
                       \n¿Desea vender algun vehículo registrado?
                       1.Si
                       2.No""");
            option = console.nextInt();
            if (option == 1){
                System.out.println("¿Cuantos vehículos desea vender?");
                soldVehicle = console.nextInt();
                System.out.println("""
                        De la lista de vehículos copie la placa del vehículo que desea
                        vender y agreguela a continuación.""");
                for (int i = 0; i < soldVehicle; i++) {
                    System.out.println("Digite la placa del vehículo:");
                    sellVehicle = UUID.fromString(console.next());
                    store.sellVehicles(sellVehicle);
                }
            }
            store.dataArrayVehicle();
        }else if (registerVehicle == 2){
            System.out.println("Programa terminado");
        }
    }
}
