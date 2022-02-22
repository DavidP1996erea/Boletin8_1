package Ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Criba {

    public static int [] crearArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca hasta que número quiere calcular los primos");
        int numero=sc.nextInt();

        int [] arrayCriba = new int[calcularTamano(numero)];

        llenarArray(arrayCriba, numero);


        return cargarArrayPrimos(llenarArray(arrayCriba, numero), numero);
    }


    public static int calcularTamano(int numero){
        int tamano=0;
        for (int o = 0; o <= numero; o++) {

            if (o % 2 != 0) {
                tamano++;
            }
        }

        return tamano;

    }

    public static int [] llenarArray(int [] arrayCriba, int numero){
        int puesto = 0;

        for(int j =0; j<=numero;j++) {

            if (j % 2 != 0) {
                arrayCriba[puesto]=j;
                puesto++;
            }
        }

        return arrayCriba;
    }


    public static int [] cargarArrayPrimos(int [] arrayCriba, int numero){

        int tamano=0;
        int puesto=0;
        for (int o = 0; o <= numero; o++) {

            for(int j=0; j <arrayCriba.length;j++)
            if (Arrays.asList(arrayCriba).contains(3 * o)==true) {
                tamano++;
            }
        }



        int [] array2 = new int[tamano];


        for(int i = 0; i<numero;i++){

                for(int j=0; j <arrayCriba.length;j++){

                    if (Arrays.asList(arrayCriba).contains(3 * i)==true) {
                        array2[puesto]=arrayCriba[j];
                        puesto++;
                    }
            }

        }

        return array2;




    }

}
