package Ejercicio3;
import java.util.Locale;
import java.util.Scanner;

public class Asientos {

    private static int fumadores = 16;
    private static int noFumadores = 0;

    public Asientos() {

    }


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


