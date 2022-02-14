package Aplication;

/**
 * Clase barco
 * @version 1.0.0 2022/02/14
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Boat extends Vehicle{
    private double turbinePower;
    private double length;

    /**
     * Constructor para crear un barco
     * @param brand Marca
     * @param model Modelo
     * @param color Color
     * @param maximumSpeed Velocidad maxima
     * @param seats Asientos
     * @param turbinePower Potencia de turbinas
     * @param length Longitud
     */
    public Boat(String brand, String model, String color, double maximumSpeed, int seats, double turbinePower,
                double length) {
        super(brand, model, color, maximumSpeed, seats);
        this.turbinePower = turbinePower;
        this.length = length;
    }

    /**
     * Getter
     * @return Potencia de las turbinas
     */
    public double getTurbinePower() {
        return turbinePower;
    }

    /**
     * Setter
     * @param turbinePower double
     */
    public void setTurbinePower(double turbinePower) {
        this.turbinePower = turbinePower;
    }

    /**
     * Getter
     * @return Longitud del barco
     */
    public double getLength() {
        return length;
    }

    /**
     * Setter
     * @param length double
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Método para mostrar los datos del barco
     */
    public void dataVehicle(){
        System.out.println("\nTipo de vehículo: Barco"
                + "\n Longitud: " + getLength() + " metros"
                + "\n Potencia de turbinas: " + getTurbinePower() + " Kilowatios");
        super.dataVehicle();
    }
}
