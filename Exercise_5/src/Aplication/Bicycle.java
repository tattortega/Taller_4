package Aplication;

/**
 * Clase bibicleta con sus atributos
 * @version 1.0.0 2022/02/14
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Bicycle extends  Vehicle{
    private int numberSpeeds;
    private String typeBicycle;

    /**
     * Constructor para crear una bicicleta con sus atributos
     * @param brand Marca
     * @param model Modelo
     * @param color Color
     * @param maximumSpeed Velocidad maxima
     * @param seats Asientos
     * @param numberSpeeds Número de velocidades
     * @param typeBicycle Tipo de bicicleta
     */
    public Bicycle(String brand, String model, String color, double maximumSpeed, int seats, String typeBicycle,
                   int numberSpeeds) {
        super(brand, model, color, maximumSpeed, seats);
        this.numberSpeeds = numberSpeeds;
        this.typeBicycle = typeBicycle;
    }

    /**
     * Getter
     * @return Número de velocidades
     */
    public int getNumberSpeeds() {
        return numberSpeeds;
    }

    /**
     * Setter
     * @param numberSpeeds int
     */
    public void setNumberSpeeds(int numberSpeeds) {
        this.numberSpeeds = numberSpeeds;
    }

    /**
     * Getter
     * @return Tipo de bicicleta
     */
    public String getTypeBicycle() {
        return typeBicycle;
    }

    /**
     * Setter
     * @param typeBicycle String
     */
    public void setTypeBicycle(String typeBicycle) {
        this.typeBicycle = typeBicycle;
    }

    /**
     * Método para mostrar los datos de la bicicleta
     */
    public void dataVehicle(){
        System.out.println("\nTipo de vehículo: Bicicleta"
                + "\n Tipo de bicicleta: " + getTypeBicycle()
                + "\n Número de velocidades: " + getMaximumSpeed());
        super.dataVehicle();
    }
}
