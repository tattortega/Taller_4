package Aplication;

import java.util.UUID;

/**
 * Clase vehiculo con sus atributos
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
     * Constructor para crear un vehiculo
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
     * @return Tipo de desplazamiento del vehiculo
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
     * @return Placa del vehiculo
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
     * @return Numero de pasajeros
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
     * @return Numero de ruedas
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
     * @return Marca del vehiculo
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
     * @return Color del vehiculo
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
     * Metodo para mostrar los datos del vehiculo
     */
    public void dataVehicle(){
        System.out.println("Vehiculo "
                + "\n Placa: " + getPlate()
                + "\n Se desplaza por: " + getMeanOfTransport()
                + "\n Marca: " + getBrand()
                + "\n Kilometraje: " + getMileage() + " km/h"
                + "\n Color: " + getColor()
                + "\n Pasajeros: " + getPassengers()
                + "\n Ruedas: " + getWheels());
    }
}
