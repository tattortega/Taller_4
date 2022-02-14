package Aplication;

/**
 * Clase motocicleta con sus atributos
 * @version 1.0.0 2022/02/14
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Motorcycle extends Vehicle{
    private double cylinderCapacity;
    private String yearManufacture;

    /**
     * Constructor para crear una motocicleta
     * @param brand Marca
     * @param model Modelo
     * @param color Color
     * @param maximumSpeed Velocidad maxima
     * @param seats Asientos
     * @param cylinderCapacity Capacidad de cilindraje
     * @param yearManufacture Año de fabricacion
     */
    public Motorcycle(String brand, String model, String color, double maximumSpeed, int seats,
                      double cylinderCapacity, String yearManufacture) {
        super(brand, model, color, maximumSpeed, seats);
        this.cylinderCapacity = cylinderCapacity;
        this.yearManufacture = yearManufacture;
    }

    /**
     * Getter
     * @return Capacidad de cilindraje
     */
    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * Setter
     * @param cylinderCapacity double
     */
    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * Getter
     * @return Año de fabricacion
     */
    public String getYearManufacture() {
        return yearManufacture;
    }

    /**
     * Setter
     * @param yearManufacture String
     */
    public void setYearManufacture(String yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    /**
     * Método para mostrar los datos de la motocicleta
     */
    public void dataVehicle() {
        System.out.println("\nTipo de vehículo: Motocicleta"
                + "\n Cilindraje: " + getCylinderCapacity() + " cm3"
                + "\n Año de fabricación: " + getYearManufacture());
        super.dataVehicle();
    }
}
