package Aplication;

import java.util.UUID;

/**
 * Clase vehículo con sus atributos
 * @version 1.0.0 2022/02/14
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Vehicle {
    private final UUID plate;
    private String brand;
    private String model;
    private String color;
    private double maximumSpeed;
    private int seats;

    /**
     * Constructor para crear un vehículo
     * @param brand Marca
     * @param model Modelo
     * @param color Color
     * @param maximumSpeed Velocidad maxima
     * @param seats Asientos
     */
    public Vehicle(String brand, String model, String color, double maximumSpeed, int seats) {
        this.model = model;
        this.plate = UUID.randomUUID();
        this.brand = brand;
        this.color = color;
        this.maximumSpeed = maximumSpeed;
        this.seats = seats;
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
     * @return Maxima velocidad
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
     * @return Modelo del vehículo
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter
     * @param model String
     */
    public void setModel(String model) {
        this.model = model;
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
        System.out.println(" Placa: " + getPlate()
                + "\n Marca: " + getBrand()
                + "\n Modelo: " + getModel()
                + "\n Kilometraje: " + getMaximumSpeed() + " km/h"
                + "\n Color: " + getColor()
                + "\n Asientos: " + getSeats());
    }
}
