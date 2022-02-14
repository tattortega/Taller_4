package Aplication;

import java.util.UUID;

/**
 * Clase vehículo con sus atributos
 * @version 1.0.0 2022/02/13
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Vehicle {
    private String meanOfTransport;
    private final UUID plate;
    private String brand;
    private String color;
    private double mileage;
    private int passengers;
    private int wheels;

    /**
     * Constructor para crear un vehículo
     * @param meanOfTransport Medio de transporte
     * @param brand Marca
     * @param color Color
     * @param mileage Kilometraje
     * @param passengers Pasajeros
     * @param wheels Ruedas
     */
    public Vehicle(String meanOfTransport, String brand, String color, double mileage, int passengers, int wheels) {
        this.plate = UUID.randomUUID();
        this.meanOfTransport = meanOfTransport;
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
        this.wheels = wheels;
        this.passengers = passengers;
    }

    /**
     * Getter
     * @return Tipo de desplazamiento del vehículo
     */
    public String getMeanOfTransport() {
        return meanOfTransport;
    }

    /**
     * Setter
     * @param meanOfTransport Transport
     */
    public void setMeanOfTransport(String meanOfTransport) {
        this.meanOfTransport = meanOfTransport;
    }

    /**
     * Getter
     * @return Placa del vehículo
     */
    public UUID getPlate() {
        return plate;
    }

    /**
     * Getter
     * @return Kilometraje
     */
    public double getMileage() {
        return mileage;
    }

    /**
     * Setter
     * @param mileage Double
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    /**
     * Getter
     * @return Número de pasajeros
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * Setter
     * @param passengers Int
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /**
     * Getter
     * @return Número de ruedas
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * Setter
     * @param wheels int
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * Getter
     * @return Marca del vehículo
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Setter
     * @param brand String
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter
     * @return Color del vehículo
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter
     * @param color Color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método para mostrar los datos del vehículo
     */
    public void dataVehicle(){
        System.out.println("\nVehículo "
                + "\n Placa: " + getPlate()
                + "\n Se desplaza por: " + getMeanOfTransport()
                + "\n Marca: " + getBrand()
                + "\n Kilometraje: " + getMileage() + " km/h"
                + "\n Color: " + getColor()
                + "\n Pasajeros: " + getPassengers()
                + "\n Ruedas: " + getWheels());
    }
}
