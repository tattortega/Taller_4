package Aplication;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Clase tienda de vehiculos
 * @version 1.0.0 2022/02/12
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class VehicleStore {
    ArrayList<Vehicle> vehicles;

    /**
     * Constructor para crear la lista de vehículos en la tienda
     */
    public VehicleStore() {
        this.vehicles = new ArrayList<>();
    }

    /**
     * Getter
     * @return Lista de vehículos
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
     * Método para agregar un vehículo en la lista
     * @param vehicle vehicle
     */
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    /**
     * Método para mostrar la lista de vehículos
     */
    public void dataArrayVehicle(){
        System.out.println("\n Lista de vehículos:");
        for (Vehicle vehicle: vehicles) {
            vehicle.dataVehicle();
        }
        if (vehicles.isEmpty()){
            System.out.println("No hay existencia de vehículos");
        }
    }

    /**
     * Método para vender vehículos de la lista
     * @param sellVehicle Placa del vehículo a vender
     * @return Lista de vehículos
     */
    public void sellVehicles(UUID sellVehicle){
        for (int j = 0; j < getVehicles().size(); j++) {
            if (getVehicles().get(j).getPlate().equals(sellVehicle)) {
                getVehicles().remove(j);
                System.out.println("Vehículo vendido");
            }
        }
    }
}
