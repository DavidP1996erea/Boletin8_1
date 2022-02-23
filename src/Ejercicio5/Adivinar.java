package Ejercicio5;

import java.util.Scanner;

public class Adivinar {


    /**
     * Llena el array, requiere como entrada el array
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
     * Convertir el array en un string
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
     * Tine como entrada el array y un string que lo mete el usuario
     * @param adivinar
     * @param numero
     */
    public static void juego(int [] adivinar, String numero){

        for (int i = 0; i < adivinar.length; i++) {
            int cont=0;
            for (int j = 0; j < 4; j++) {

                if ((convertir(adivinar).charAt(j) == numero.charAt(i))) {

                    if (convertir(adivinar).charAt(i) == numero.charAt(i)) {
                        System.out.print("1");
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
    }


    public static void jugar(int [] adivinar){
        Scanner sc = new Scanner(System.in);

        int contador=0;
        while (contador<12){
            System.out.println("Introduzca un numero de 4 dígitos");
            String numero = sc.next();

            juego(adivinar, numero);
            System.out.println();

            contador++;
        }

    }






}

