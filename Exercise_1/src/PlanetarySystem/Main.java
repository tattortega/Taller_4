package PlanetarySystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Clase main
 * El programa se ejecuta desde aqui.
 * Calcular la atraccion gravitatoria entre dos planetas seleccionados por el usuario
 * @version 1.0.0 2022/02/12
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Main {

    /**
     * Instruciones del programa para el usuario
     * Crea los planetas con sus atributos definidos
     * @param args Consola
     */
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int option;
        double distanceToSunOfPlanet1;
        double distanceToSunOfPlanet2;
        double distanceBetweenPlanets;
        double massOfPlanet1;
        double massOfPlanet2;
        double gravitationalAttraction;
        ArrayList<String> planetSelection = new ArrayList<>();
        ArrayList<Double> planetMassSelection = new ArrayList<>();
        ArrayList<Double> planetDistanceToSunSelection = new ArrayList<>();


        System.out.println("""
                Bienvenido al Sistema Planetario \n              
                Aqui podrás calcular la atraccion gravitatoria entre dos planetas del sistema solar.
                Eliga los dos planetas que deseas calcular:
                1.Mercurio
                2.Venus
                3.Tierra
                4.Marte
                5.Jupiter
                6.Saturno
                7.Urano
                8.Neptuno""");

        PlanetarySystem solarSystem = new PlanetarySystem();
        solarSystem.addPlanet(
                new Planet("Mercurio", 3.285E23, 5.43, 4.879, 57.91E6));
        solarSystem.addPlanet(
                new Planet("Venus", 4.867E24, 5.24, 12.104, 108.2E6));
        solarSystem.addPlanet(
                new Planet("Tierra", 5.972E24, 5.51, 12.742, 149.6E6));
        solarSystem.addPlanet(
                new Planet("Marte", 6.39E23, 3.93, 6.779, 227.94E6));
        solarSystem.addPlanet(
                new Planet("Jupiter", 1.898E27, 1.33, 139.820, 778.33E6));
        solarSystem.addPlanet(
                new Planet("Saturno", 5.683E26, 687, 116.460, 1.429E9));
        solarSystem.addPlanet(
                new Planet("Urano", 8.681E25, 1.27, 50.724, 2.870E9));
        solarSystem.addPlanet(
                new Planet("Neptuno", 1.024E26, 1.64, 49.244, 4.504E9));


        for (int options = 1; options < 3; options ++){
            option = inputUser.nextInt();
            switch (option){
                case 1: {
                    planetSelection.add("Mercurio");
                    solarSystem.getPlanets().get(0).dataPlanet();
                    planetMassSelection.add(solarSystem.getPlanets().get(0).getMass());
                    planetDistanceToSunSelection.add(solarSystem.getPlanets().get(0).getDistanceToSun());
                    break;
                }
                case 2: {
                    planetSelection.add("Venus");
                    solarSystem.getPlanets().get(1).dataPlanet();
                    planetMassSelection.add(solarSystem.getPlanets().get(1).getMass());
                    planetDistanceToSunSelection.add(solarSystem.getPlanets().get(1).getDistanceToSun());
                    break;
                }
                case 3: {
                    planetSelection.add("Tierra");
                    solarSystem.getPlanets().get(2).dataPlanet();
                    planetMassSelection.add(solarSystem.getPlanets().get(2).getMass());
                    planetDistanceToSunSelection.add(solarSystem.getPlanets().get(2).getDistanceToSun());
                    break;
                }
                case 4: {
                    planetSelection.add("Marte");
                    solarSystem.getPlanets().get(3).dataPlanet();
                    planetMassSelection.add(solarSystem.getPlanets().get(3).getMass());
                    planetDistanceToSunSelection.add(solarSystem.getPlanets().get(3).getDistanceToSun());
                    break;
                }
                case 5: {
                    planetSelection.add("Jupiter");
                    solarSystem.getPlanets().get(4).dataPlanet();
                    planetMassSelection.add(solarSystem.getPlanets().get(4).getMass());
                    planetDistanceToSunSelection.add(solarSystem.getPlanets().get(4).getDistanceToSun());
                    break;
                }
                case 6: {
                    planetSelection.add("Saturno");
                    solarSystem.getPlanets().get(5).dataPlanet();
                    planetMassSelection.add(solarSystem.getPlanets().get(5).getMass());
                    planetDistanceToSunSelection.add(solarSystem.getPlanets().get(5).getDistanceToSun());
                    break;
                }
                case 7: {
                    planetSelection.add("Urano");
                    solarSystem.getPlanets().get(6).dataPlanet();
                    planetMassSelection.add(solarSystem.getPlanets().get(6).getMass());
                    planetDistanceToSunSelection.add(solarSystem.getPlanets().get(6).getDistanceToSun());
                    break;
                }
                case 8: {
                    planetSelection.add("Neptuno");
                    solarSystem.getPlanets().get(7).dataPlanet();
                    planetMassSelection.add(solarSystem.getPlanets().get(7).getMass());
                    planetDistanceToSunSelection.add(solarSystem.getPlanets().get(7).getDistanceToSun());
                    break;
                }
            }
        }

        distanceToSunOfPlanet1 = planetDistanceToSunSelection.get(0);
        distanceToSunOfPlanet2 = planetDistanceToSunSelection.get(1);
        distanceBetweenPlanets = solarSystem.calculateDistancePlanets(distanceToSunOfPlanet1, distanceToSunOfPlanet2);

        massOfPlanet1 = planetMassSelection.get(0);
        massOfPlanet2 = planetMassSelection.get(1);
        gravitationalAttraction = solarSystem.calculateGravitationalAttraction(distanceBetweenPlanets, massOfPlanet1,
                massOfPlanet2);

        System.out.println("\n La atraccion gravitatoria entre " + planetSelection.get(0) + " y " + planetSelection.get(1)
                + " es de " + gravitationalAttraction + " Newtons");
    }
}
