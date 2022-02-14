package Aplication;

/**
 * Clase avión
 * @version 1.0.0 2022/02/14
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Airplane extends Vehicle{
    private String typeAirplane;
    private int numberOfEngines;

    /**
     * Constructor para crear un avión
     * @param brand Marca
     * @param model Modelo
     * @param color Color
     * @param maximumSpeed Velocidad maxima
     * @param seats Asientos
     * @param typeAirplane Tipo de avion
     * @param numberOfEngines Numero de motores
     */
    public Airplane(String brand, String model, String color, double maximumSpeed, int seats, String typeAirplane,
                    int numberOfEngines) {
        super(brand, model, color, maximumSpeed, seats);
        this.typeAirplane = typeAirplane;
        this.numberOfEngines = numberOfEngines;
    }

    /**
     * Getter
     * @return Tipo de avión
     */
    public String getTypeAirplane() {
        return typeAirplane;
    }

    /**
     * Setter
     * @param typeAirplane double
     */
    public void setTypeAirplane(String typeAirplane) {
        this.typeAirplane = typeAirplane;
    }

    /**
     * Getter
     * @return Número de motores
     */
    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    /**
     * Setter
     * @param numberOfEngines int
     */
    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    /**
     * Método para mostrar los datos del avion
     */
    public void dataVehicle(){
        System.out.println("\nTipo de vehículo: Avión"
                + "\n Tipo de avión: " + getTypeAirplane()
                + "\n Número de motores: " + getNumberOfEngines());
        super.dataVehicle();
    }
}
