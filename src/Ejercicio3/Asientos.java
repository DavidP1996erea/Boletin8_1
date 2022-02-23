package Ejercicio3;
import java.util.Locale;
import java.util.Scanner;

public class Asientos {

    /**
     * Se crean dos variables estáticas, de esta forma pertenecen a la clase y no a los objetos.
     */
    private static int fumadores = 16;
    private static int noFumadores = 0;

    public Asientos() {

    }

    /**
     * Postcondición: Un array de tipo entero
     *
     * Este método comprueba llamando al método esFumador si la persona introducida por el usuario
     * es fumador o no.
     *
     * Salida: La salida depende de que método es llamado, asientoFumador o asientoNoFumador.
     * @param pasajeros
     */

    public static void introducirPasajeros(int[] pasajeros) {
        Scanner sc = new Scanner(System.in);
        char respuesta;

        do {

            if (esFumador() == true) {

                asientoFumador(pasajeros);

            } else {
                asientoNoFumador(pasajeros);
            }


            System.out.println("¿Desea introducir más personas?");
            respuesta = sc.next().toUpperCase(Locale.ROOT).charAt(0);

        } while (respuesta == 'S');
    }


    /**
     * Postcondición: Un array de enteros.
     *
     * En caso de que sea fumador y haya sitios disponibles, la posición 15 se pondrá a 1
     * En caso de que la zona de fumadores esté completa, y haya espacio en la zona de no fumadores,
     * preguntará al usuario si quiere pasar a dicha zona.
     *
     * Salida: Nada
     * @param pasajeros
     */


    public static void asientoFumador(int[] pasajeros) {
        Scanner sc = new Scanner(System.in);
        char respuesta;

        if (fumadores <= 19) {
            pasajeros[fumadores] = 1;
            fumadores++;
        } else {

            System.out.println("¿Desea pasar a la zona de no fumadores?");
            respuesta = sc.next().toUpperCase(Locale.ROOT).charAt(0);

            if (respuesta == 'S') {
                if (noFumadores < 16) {

                    asientoNoFumador(pasajeros);

                }
                }else {
                System.out.println("El próximo vuelo es mañana");
            }
        }
    }


    /**
     * Este método hace lo mismo que el método asientoFumador pero comprobando los asientos hasta el 16
     * @param pasajeros
     */

    private static void asientoNoFumador(int[] pasajeros) {

        Scanner sc = new Scanner(System.in);
        char respuesta;

        if (noFumadores < 16) {

            pasajeros[noFumadores] = 1;
            noFumadores++;

        } else {

            System.out.println("¿Desea pasar a la zona de fumadores?");
            respuesta = sc.next().toUpperCase(Locale.ROOT).charAt(0);

            if (respuesta == 'S') {
                asientoFumador(pasajeros);
            } else {
                System.out.println("El próximo vuelo es mañana");
            }
        }


    }


    /**
     * Postcondición: Nada
     *
     * Este método comprueba si el pasajero es fumador o no.
     *
     * Salida: Devuelve un booleano.
     * @return
     */

    public static boolean esFumador(){
        Scanner sc = new Scanner(System.in);
        boolean fumador=false;

        System.out.println("Introduzca 'S' si el pasajaero es fumador o 'N' si no lo es");
        char respuesta=sc.next().toUpperCase(Locale.ROOT).charAt(0);

        if(respuesta=='S'){
            fumador=true;
        }

        return fumador;

    }


    } //fin


