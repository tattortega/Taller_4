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
    private double maximumSpeed;
    private int seats;
    private int wheels;

    /**
     * Constructor para crear un vehículo
     * @param meanOfTransport Medio de transporte
     * @param brand Marca
     * @param color Color
     * @param maximumSpeed Velocidad maxima
     * @param seats Asientos
     * @param wheels Ruedas
     */
    public Vehicle(String meanOfTransport, String brand, String color, double maximumSpeed, int seats, int wheels) {
        this.plate = UUID.randomUUID();
        this.meanOfTransport = meanOfTransport;
        this.brand = brand;
        this.color = color;
        this.maximumSpeed = maximumSpeed;
        this.wheels = wheels;
        this.seats = seats;
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
    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Setter
     * @param maximumSpeed Double
     */
    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    /**
     * Getter
     * @return Número de asientos
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Setter
     * @param seats Int
     */
    public void setSeats(int seats) {
        this.seats = seats;
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
                + "\n Kilometraje: " + getMaximumSpeed() + " km/h"
                + "\n Color: " + getColor()
                + "\n Asientos: " + getSeats()
                + "\n Ruedas: " + getWheels());
    }
}
