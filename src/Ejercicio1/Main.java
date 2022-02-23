package Ejercicio1;

import static Ejercicio1.miArray.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int [] array1 = new int[20];
        int [] array2 = new int[20];
        int [] noRepetido = new int[20];

        cargarArray(array1);


        System.out.println("Generar a partir de un array otro array que contenga los elementos pares que se encuentran en otro");
        arrayPar(array1);

        System.out.println("Array número primos");

        arraryPrimo(array1);


        System.out.println("Primer array");
        for (int e : array1){

            System.out.println(e);
        }
        System.out.println("Array al revés");
        alReves(array1);

        System.out.println("Posición en array");
        System.out.println(posicionArray(array2, 5));

        System.out.println("Array no repetido");
        noRepetido(noRepetido);
        for (int x:noRepetido){
            System.out.println(x);
        }




    }
}
