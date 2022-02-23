package Ejercicio5;

import java.util.Scanner;

public class Adivinar {


    /**
     * Postcondición: Requiere como entrada un array de tipo entero vacío
     * Este método rellena el array con número aleatorios entre 1 y 9
     * Salida: Devuelve el array cargado de números.
     * @param adivinar
     * @return
     */
    public static int[] llenarArray(int [] adivinar){

        for (int i=0; i<adivinar.length;i++){

            adivinar[i]=(int) Math.round(Math.random()*8+1);
        }

        return adivinar;
    }

    /**
     * Postcondición: Necesita un array de tipo entero, que ya fue rellenado anteriormente.
     * Acumula los valores del array en un String, que servirá para poder separar con facilidad
     * los dígitos.
     * Salida: Un String con los valores que tenía el array.
     * @param adivinar
     * @return
     */
    public static String convertir(int [] adivinar){
        String convertir = "";
        for(int i=0; i<adivinar.length;i++) {

            convertir+=String.valueOf(adivinar[i]);
        }
        return convertir;
    }

    /**
     * PostCondición: Un array tipo int que convertirá posteriormente a String con el método convertir,
     * y también necesita como entrada un String de 4 dígitos que introduce el usuario.
     * Este método recorre uno a uno los elementos que componen el String introducido por el usuario y
     * lo va comparando con los dígitos que componen el String que devuelve el método convertir.
     *
     * Si el elemento está en ambos Strings pero en diferentes posiciones devuelve un 0
     * Si está en ambos Strings y en la misma posición devuelve un 1
     * Si no está en ambos devuelve un "_" para facilitar la lectura
     *
     * Salida: Este método devuelve true cuando se cumple la condición de que está en ambos
     * Strings y en la misma posición, cuando esto ocurra 4 veces quiere decir que se ha
     * acertado todos los números, por lo que devuelve true cuando esto ocurre.
     *
     * @param adivinar
     * @param numero
     */
    public static boolean juego(int [] adivinar, String numero){

        int ganar=0;
        for (int i = 0; i < adivinar.length; i++) {
            int cont=0;

            for (int j = 0; j < 4; j++) {

                if ((convertir(adivinar).charAt(j) == numero.charAt(i))) {

                    if (convertir(adivinar).charAt(i) == numero.charAt(i)) {
                        System.out.print("1");
                        ganar++;
                        j = 4;
                    }else {
                        System.out.print("0");
                        j=4;
                    }

                    }else {
                    cont++;
                    if(cont==4){
                        System.out.print("_");
                    }
                }
            }
        }
        if (ganar==4){
            return true;
        }else {
            return false;
        }
    }


    /**
     * Postcondición: Requiere un array tipo int que será llamado por diferentes métodos para que
     * todo vaya funcionando
     * Este método mete en un bucle while los métodos anteriores, y termina cuando el usuario falla
     * 12 veces o cuando el método juego es true.
     *
     * Salida: Un mensaje cuando el usuario gana el juego.
     * @param adivinar
     */

    public static void jugar(int [] adivinar){
        Scanner sc = new Scanner(System.in);
        int contador=0;

        while (contador<12){
            System.out.println("Introduzca un número de 4 dígitos");
            String numero = sc.next();

            if(juego(adivinar, numero)) {
                System.out.println();
                System.out.println("Has ganado");
                contador=12;
            }
            System.out.println();
            contador++;
        }
    }

}

