package Aplication;

import java.util.ArrayList;

/**
 * Clase tienda con la lista de vehiculos
 * @version 1.0.0 2022/02/12
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class VehicleStore {
    ArrayList<Vehicle> vehicles;

    /**
     * Constructor para crear la lista de vehiculos en la tienda
     */
    public VehicleStore() {
        this.vehicles = new ArrayList<>();
    }

    /**
     * Getter
     * @return Lista de vehiculos
     */
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     * Setter
     * @param vehicles Vehicle
     */
    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * Metodo para agregar un vehiculo en la lista
     * @param vehicle vehicle
     */
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    /**
     * Metodo para mostrar la lista de vehiculos
     */
    public void dataArrayVehicle(){
        System.out.println("Lista de vehiculos: \n");
        for (Vehicle vehicle: vehicles) {
            vehicle.dataVehicle();
        }
    }
}
