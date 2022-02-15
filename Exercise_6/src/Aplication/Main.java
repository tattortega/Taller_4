package Aplication;

import java.util.Scanner;
import java.util.Vector;

/**
 * Clase main
 * El programa se ejecuta desde aqui.
 * Registrar una lista de numeros hasta que se introduce dos veces seguida el mismo numero
 * @version 1.0.0 2022/02/14
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Main {

    /**
     * Instruciones del programa para el usuario
     * Lee los numeros ingresados desde el teclado
     * @param args Consola
     */
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        Integer number;
        boolean repeatedNumber = false;
        Vector<Integer> listNumbers = new Vector<>();

        System.out.println("""
                Bienvenido
                En este programa podrá ingresar números que se guardaran en un vector.
                Si ingresas dos veces seguidas el mismo número, el programa se detendrá
                y le mostrará todos los números que ingresó
                
                Ingresa un número""");

        number = inputNumber.nextInt();
        listNumbers.add(number);

        do {
            System.out.println("Ingresa un número");
            number = inputNumber.nextInt();
            if (number.equals(listNumbers.lastElement())){
                listNumbers.add(number);
                System.out.println(listNumbers);
                repeatedNumber = true;
            }else {
                listNumbers.add(number);
            }
        }while (!repeatedNumber);
    }
}
