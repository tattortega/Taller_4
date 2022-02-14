package Aplication;

/**
 * Clase carro con sus atributos
 * @version 1.0.0 2022/02/14
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Car extends Vehicle{
    private String typeFuel;
    private int numberDoors;

    /**
     * Constructor para crear un carro
     * @param brand Marca
     * @param model Modelo
     * @param color Color
     * @param maximumSpeed Velocidad maxima
     * @param seats Asientos
     * @param typeFuel Tipo de combustible
     * @param numberDoors Numero de puertas
     */
    public Car(String brand, String model, String color, double maximumSpeed, int seats, String typeFuel,
               int numberDoors) {
        super(brand, model, color, maximumSpeed, seats);
        this.typeFuel = typeFuel;
        this.numberDoors = numberDoors;
    }

    /**
     * Getter
     * @return Tipo de combustible
     */
    public String getTypeFuel() {
        return typeFuel;
    }

    /**
     * Setter
     * @param typeFuel String
     */
    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    /**
     * Getter
     * @return Número de puertas
     */
    public int getNumberDoors() {
        return numberDoors;
    }

    /**
     * Setter
     * @param numberDoors int
     */
    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    /**
     * Método para mostrar los datos del carro
     */
    public void dataVehicle() {
        System.out.println("\nTipo de vehículo: Carro"
                + "\n Tipo de combustibe: " + getTypeFuel()
                + "\n Número de puertas: " + getNumberDoors());
        super.dataVehicle();
    }
}
