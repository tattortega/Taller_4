package Aplication;

import java.util.ArrayList;
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
        Scanner console = new Scanner(System.in);
        int option;
        String transport;
        String color;
        String brand;
        double mileage;
        int passengers;
        int wheels;
        int registerVehicle;
        UUID sellVehicle;
        ArrayList<Vehicle> vehicles;

        System.out.println("""
                Bienvenido a este programa que le permite registrar los datos de 10 vehiculos
                y elegir los que desea vender.""");


        VehicleStore store = new VehicleStore();

        do {
            System.out.println("""
                   \n Registar lista de vehiculos
                    1.Si
                    2.No""");
            registerVehicle = console.nextInt();
            if (registerVehicle == 1) {
                for (int vehicle = 1; vehicle < 3; vehicle++) {
                    System.out.println("""
                            El vehiculo se desplaza por: 
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
                    System.out.println("Escriba la marca del vehiculo: ");
                    brand = console.next();
                    System.out.println("Digite cuantas ruedas tiene el vehiculo. Si no tiene ruedas digite 0");
                    wheels = console.nextInt();
                    System.out.println("Escriba el color del vehiculo: ");
                    color = console.next();
                    System.out.println("Escriba el kilometraje del vehiculo: ");
                    mileage = console.nextDouble();
                    System.out.println("Digite cuantos pasajeros caben en el vehiculo: ");
                    passengers = console.nextInt();

                    store.addVehicle(new Vehicle(transport, brand, color, mileage, passengers, wheels));
                    System.out.println("Vehiculo registrado \n");
                }
                store.dataArrayVehicle();
                System.out.println("""
                        ¿Desea vender algun vehiculo registrado?
                        1.Si
                        2.No""");
                option = console.nextInt();
                if (option == 1){
                    System.out.println("De la lista de vehiculos copie la placa del vehiculo que desea " +
                            "vender y agreguela a continuacion ");
                    sellVehicle = UUID.fromString(console.next());
                    for(int i = 0 ; i < store.getVehicles().size(); i++) {
                        if (store.getVehicles().get(i).getPlate().equals(sellVehicle)){
                            store.getVehicles().remove(i);
                            System.out.println("Vehiculo vendido");
                        }
                    }
                }else{
                    registerVehicle = 2;
                }
                store.dataArrayVehicle();
            }else if (registerVehicle == 2){
                System.out.println("Programa terminado");
            }
        }while (registerVehicle !=2);
    }
}
