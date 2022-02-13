package PlanetarySystem;

import java.util.ArrayList;

/**
 * Clase para crear el sistema planetario
 * @version 1.0.0 2022/02/12
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class PlanetarySystem{
    private final double GRAVITY = 6.673E-11;
    private double distance;
    private final String namePlanetarySystem;
    private final ArrayList<Planet> planets;

    /**
     * Constructor para crear el sistema solar
     */
    public PlanetarySystem() {
        this.namePlanetarySystem = "Sistema Solar";
        this.planets = new ArrayList<>();
    }

    /**
     * Metodo para agregar planetas al sistema solar
     * @param planet Lista de planetas
     */
    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    /**
     * Getter
     * @return Devuelve la lista de planetas
     */
    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    /**
     * Getter
     * @return Nombre del sistema planetario
     */
    public String getNamePlanetarySystem() {
        return namePlanetarySystem;
    }

    /**
     * Metodo para calcular la distancia entre dos planetas
     * @param distanceToSun1 Distancia del sol del primer planeta
     * @param distanceToSun2 Distancia del sol del primer planeta
     * @return Double
     */
    public double calculateDistancePlanets(double distanceToSun1, double distanceToSun2){
        distance = Math.abs(distanceToSun1 - distanceToSun2);
        return distance;
    }

    /**
     * Metodo para calcular la atraccion gravitatoria entre dos planetas
     * @return Atraccion gravitatoria
     */
    public double calculateGravitationalAttraction(double distance, double mass1, double mass2) {
        distance = Math.pow(distance, 2);
        return GRAVITY * ((mass1 * mass2) / distance);
    }
}
