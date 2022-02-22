package Ejercicio4;

import java.util.Scanner;
import java.util.Arrays;
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

        for(int j =3; j<=numero;j++) {

            if (j % 2 != 0) {
                arrayCriba[puesto]=j;
                puesto++;
            }
        }

        return arrayCriba;
    }


    public static int [] cargarArrayPrimos(int [] arrayCriba, int numero) {

        int contador=0;
        int puesto=0;

        for(int i=0; i<arrayCriba.length;i++){

            for (int j=2; j<numero;j++){

                if(3*j == arrayCriba[i]|| 5*j == arrayCriba[i] || 7*j == arrayCriba[i]){

                    arrayCriba[i]=0;
                    contador++;
                }
            }
        }

        int [] arrayPrimos = new int[arrayCriba.length-contador-1];

        for(int k=0; k<arrayCriba.length;k++){

            if(arrayCriba[k]!=0) {

                arrayPrimos[puesto]=arrayCriba[k];
                puesto++;

            }
        }

        return arrayPrimos;

        }




    }




