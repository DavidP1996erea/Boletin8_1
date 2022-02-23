package Ejercicio4;
import java.util.Scanner;

public class Criba {

    /**
     * Postcondición: Ninguna
     *
     * Este método pregunta al usuario hasta que número quiere calcular los números primos, cuando se
     * recoje ese dato se crea un array que usa ese número para llamar a otro método que crea el tamaño
     * necesario para el array de primos hasta ese número.
     *
     * Salida:Llama a un método que llena el array con número impares a partir de 3 hasta el número que
     * mete el usuario. Ese array es llamado a su vez por otro método que realiza las diferentes
     * operaciones para retornar el array cargado con los números primos.
     *
     * @return
     */

    public static int [] crearArray(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca hasta que número quiere calcular los primos");
        int numero=sc.nextInt();

        int [] arrayCriba = new int[calcularTamano(numero)];


        return cargarArrayPrimos(llenarArray(arrayCriba, numero), numero);
    }

    /**
     * Postcondición: El número que introduce el usuario en el anterior método.
     *
     * Comrpueba cuantos números impares hay hasta el número que introduce el usuario,
     * de esa forma se puede calcular el tamaño necesario para el array.
     *
     * Salida: Un entero.
     * @param numero
     * @return
     */
    public static int calcularTamano(int numero){
        int tamano=0;
        for (int o = 0; o <= numero; o++) {

            if (o % 2 != 0) {
                tamano++;
            }
        }

        return tamano;

    }


    /**
     * Postcondición: Un array tipo int y el número introducido por el usuario
     *
     * Estos datos se introducen en el primer método, y una vez que tenemos el tamaño y el array,
     * carga dicho array con número impares a partir del número 3.
     *
     * Salida: Un array cargado con números impares.
     *
     * @param arrayCriba
     * @param numero
     * @return
     */
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


    /**
     * Postcondición: Un array cargado de impares y el número introducido por el usuario
     *
     * Este método recorre el array de impares y va comprobando que los multiplos de 3, 5 y 7 empezando
     * multiplicando por 2, estén en el array. Si los encuentra los cambia a 0 y contador se aumenta en 1,
     * para luego poder calcular el tamaño del array de primos.
     *
     * Una vez que esto se hace, se crea un array de tamaño como el array de impares menos el contador menos 1,
     * ya que cada vez que entra en contador++ significa un número que hay que eliminar.
     *
     * Cuando este array se crea, se llena con todos los valores del primer array excepto los 0, quedando
     * únicamente los números primos.
     *
     * Salida: El array cargado con los números primos.
     * @param arrayCriba
     * @param numero
     * @return
     */

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




