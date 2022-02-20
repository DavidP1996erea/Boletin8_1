package Ejercicio1;

import static Ejercicio1.miArray.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int [] array1 = new int[20];
        int [] array2 = new int[20];

        cargarArray(array1);

/*
        for (int e : array2){

            System.out.println(e);
        }


        System.out.println("Primer array");
       for (int e : array1){

           System.out.println(e);
       }

        System.out.println("Array al revés");

       alReves(array1);

*/

        System.out.println(posicionArray(array2, 5));

    }
}
