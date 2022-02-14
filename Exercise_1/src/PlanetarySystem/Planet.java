package PlanetarySystem;

import java.util.UUID;

/**
 * Clase para crear un planeta con atributos
 * @version 1.0.0 2022/02/12
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Planet {
    private final UUID id;
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double distanceToSun;

    /**
     * Constructor para instanciar un planeta del sistema planetario
     * @param name Nombre del planeta
     * @param mass Masa del planeta
     * @param density Densidad del planeta
     * @param diameter Diametro del planeta
     * @param distanceToSun Distancia al sol del planeta
     */
    public Planet(String name, double mass, double density, double diameter, double distanceToSun) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
    }

    /**
     * Getter
     * @return Devuelve el identificador unico
     */
    public UUID getId() {
        return id;
    }

    /**
     * Getter
     * @return Nombre del planeta
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * @return Masa del planeta
     */
    public double getMass() {
        return mass;
    }

    /**
     * Setter
     * @param mass Double
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Getter
     * @return Densidad del planeta
     */
    public double getDensity() {
        return density;
    }

    /**
     * Setter
     * @param density Double
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * Getter
     * @return Diametro del planeta
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Setter
     * @param diameter Double
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Getter
     * @return Distancia al sol del planeta
     */
    public double getDistanceToSun() {
        return distanceToSun;
    }

    /**
     * Setter
     * @param distanceToSun Double
     */
    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    /**
     * Metodo para mostrar la informacion del planeta
     */
    public void dataPlanet(){
        System.out.println(" Planeta: " + getName()
        + "\n Id: "+  getId()
        + "\n Masa: " + getMass() + " kg"
        + "\n Densidad: " + getDensity() + " g/cm3"
        + "\n Diametro: " + getDiameter() + " km"
        + "\n Distancia al sol: " + getDistanceToSun() + " millones de km");
    }

}
