package Aplication;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Clase main
 * El programa se ejecuta desde aqui.
 * Registrar una lista de diferentes vehiculos para su posterior venta
 * @version 1.0.0 2022/02/14
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Main {

    /**
     * Instruciones del programa para el usuario
     * Crea los diferentes vehiculos con sus atributos definidos
     * @param args Consola
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in).useDelimiter("\\n");
        int option;
        String color;
        String brand;
        String model;
        double maximumSpeed;
        int seats;
        int optionRegister;
        int numberVehicle;
        int typeVehicle;
        UUID sellVehicle;
        int soldVehicle;

        System.out.println("""
                Bienvenido a este programa que le permite registrar los datos de diferentes vehículos
                y elegir los que desea vender.""");
        System.out.println("""
                   \n Registrar vehículos
                    1.Si
                    2.No""");
        optionRegister = console.nextInt();
        VehicleStore store = new VehicleStore();
        if (optionRegister == 1) {
            System.out.println("¿Cuantos vehiculos quiere registrar?");
            numberVehicle = console.nextInt();
            for (int vehicle = 0; vehicle < numberVehicle; vehicle++) {
                System.out.println("""
                        \n Eliga el tipo vehículo que desea registar
                        1.Carro
                        2.Motocicleta
                        3.Bicicleta
                        4.Barco
                        5.Avión""");
                typeVehicle = console.nextInt();
                System.out.println("Digite la marca del vehículo: ");
                brand = console.next();
                System.out.println("Digite el model del vehículo: ");
                model = console.next();
                System.out.println("Digite el color del vehículo: ");
                color = console.next();
                System.out.println("Digite la velocidad máxima del vehículo (km): ");
                maximumSpeed = console.nextDouble();
                System.out.println("Digite cuantos asientos tiene el vehículo: ");
                seats = console.nextInt();
                switch (typeVehicle){
                    case 1:{
                        String typeFuel;
                        int numberDoors;
                        System.out.println("Digite el tipo de combustible del carro: ");
                        typeFuel = console.next();
                        System.out.println("Digite cuantas puertas tiene el carro: ");
                        numberDoors = console.nextInt();
                        Car car = new Car(brand, model, color, maximumSpeed, seats, typeFuel, numberDoors);
                        store.addVehicle(car);
                        System.out.println("Carro registrado");
                        break;
                    }
                    case 2:{
                        double cylinderCapacity;
                        String yearManufacture;
                        System.out.println("Digite el cilindraje de la motocicleta: ");
                        cylinderCapacity = console.nextDouble();
                        System.out.println("Digite el año de fabricacion de la motocicleta: ");
                        yearManufacture = console.next();
                        Motorcycle motorcycle = new Motorcycle(brand, model, color, maximumSpeed, seats, cylinderCapacity,
                                yearManufacture);
                        store.addVehicle(motorcycle);
                        System.out.println("Motocicleta registrado");
                        break;
                    }
                    case 3:{
                        int numberSpeeds;
                        String typeBicycle;
                        System.out.println("Digite el tipo de bicicleta: ");
                        typeBicycle = console.next();
                        System.out.println("Digite la cantidad de velocidades de la bicicleta: ");
                        numberSpeeds = console.nextInt();
                        Bicycle bicycle = new Bicycle(brand, model, color, maximumSpeed, seats, typeBicycle, numberSpeeds);
                        store.addVehicle(bicycle);
                        System.out.println("Bicicleta registrado");
                        break;
                    }
                    case 4:{
                        double turbinePower;
                        double length;
                        System.out.println("Digite la cantidad de potencia del barco: ");
                        turbinePower = console.nextDouble();
                        System.out.println("Digite la longitud del barco: ");
                        length = console.nextDouble();
                        Boat boat = new Boat(brand, model, color, maximumSpeed, seats, turbinePower, length);
                        store.addVehicle(boat);
                        System.out.println("Barco registrado");
                        break;
                    }
                    case 5:{
                        String typeAirplane;
                        int numberOfEngines;
                        System.out.println("Digite el tipo de avión: ");
                        typeAirplane = console.next();
                        System.out.println("Digite la cantidad de motores del avión: ");
                        numberOfEngines = console.nextInt();
                        Airplane airplane = new Airplane(brand, model, color, maximumSpeed, seats, typeAirplane,
                                numberOfEngines);
                        store.addVehicle(airplane);
                        System.out.println("Avión registrado");
                        break;
                    }
                }
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
        }else if (optionRegister == 2){
            System.out.println("Programa terminado");
        }
    }
}
