package Ejercicio4;

import java.util.Scanner;

public class Criba {

    public static int [] crearArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca hasta que número quiere calcular los primos");
        int numero=sc.nextInt();

        int [] arrayCriba = new int[calcularTamano(numero)];

        llenarArray(arrayCriba, numero);

        return arrayCriba;
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

    public static void llenarArray(int [] arrayCriba, int numero){
        int puesto = 0;

        for(int j =0; j<=numero;j++) {

            if (j % 2 != 0) {
                arrayCriba[puesto]=j;
                puesto++;
            }
        }
    }


    
}
