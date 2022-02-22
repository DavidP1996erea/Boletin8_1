package Ejercicio5;

import static Ejercicio5.Adivinar.*;

public class ejercicio5 {

    public static void main(String[] args) {


        int[] adivinar = new int[4];


        llenarArray(adivinar);

        for( int x : adivinar) {
            System.out.print(x);
        }

        System.out.println();
        comprobarNumero(adivinar);


    }
}
