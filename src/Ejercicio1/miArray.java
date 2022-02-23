package Ejercicio1;

public class miArray {

    /**
     * Postcondición: Un array.
     *
     * Carga el array con números aleatorios entre 1 y 20.
     * @param array
     */

    public static void cargarArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int)Math.round(Math.random() * 19 + 1);
        }
    }

    /**
     * Postcondición: Un array.
     *
     * Recorre el array y cuenta cuantos números pares hay para guardarlos en una variable que servirá para
     * saber el tamaño que tendrá el segundo array.
     *
     * Luego de eso, se carga el segundo array con los números pares del primero.
     * @param array
     */
    public static void arrayPar(int[] array) {

        int puesto = 0;
        int tamano = 0;

        for (int o = 0; o < array.length; o++) {

            if (array[o] % 2 == 0) {
                tamano++;
            }
        }

        int[] array2 = new int[tamano];

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                array2[puesto] = array[i];
                puesto++;
            }
        }

        for (int j : array2) {

            System.out.println(j);

        }
    }

    /**
     * Postcondición: Un array.
     *
     * Genera un número aleatorio y la guarda en una variable.
     *
     * Al llamar a comprobarNumero, se mete el número aleatorio y el array. Ese método comprueba que el número esté o no
     * en el array inicial, en caso de que esté genera otro número hasta que sea diferente.
     *
     * @param array
     */

    public static void noRepetido(int[] array) {

        int aleatorio=(int)Math.round(Math.random()*19+1);

        for(int i=0; i<array.length ;i++){

            if(comprobarNumero(aleatorio, array)==true){

                array[i]=aleatorio;

            }else {
                i--;

            }

            aleatorio=(int)Math.round(Math.random()*19+1);

        }

    }

    /**
     * Este método devuelve un booleano, que como se dijo en el método anterior, comprueba que un número esté en el
     * array o no.
     * @param random
     * @param array
     * @return
     */
    public static boolean comprobarNumero(int random, int [] array){

        int count=0;

        for(int i=0; i<array.length; i++ ){

            if(random==array[i]){

                count++;
            }
        }
        if(count==0) {

            return true;

        }else{

            return false;
        }
    }


    /**
     * Este método funciona como el método de arrayPar pero en lugar de números pares, lo hace con números primos.
     * @param array
     */

    public static void arraryPrimo(int[] array) {

        int puesto = 0;
        int tamano = 0;
        int contador=0;

        for (int o = 0; o < array.length; o++) {

           for(int k=1; k<=array[o];k++){

               if(array[o]%k==0){
                   contador++;
               }

           }
           if(contador==2){
               tamano++;

           }
            contador=0;
        }

        int[] array2 = new int[tamano];

        for (int i = 0; i < array.length; i++) {

            for(int j=1; j<=array[i];j++){

                if(array[i]%j==0){
                    contador++;
                }

            }
            if(contador==2){
                array2[puesto] = array[i];
                puesto++;
            }
            contador=0;

        }

        for (int l : array2) {

            System.out.println(l);

        }

    }


    /**
     * Este método recorre el array desde el final al principio, y va guardando dichos valores en otro array.
     * @param array
     */


    public static void alReves(int [] array){

       int [] array2 = new int[array.length];
       int puesto=0;

        for(int i=19; i>-1; i--){

            array2[puesto]=array[i];

            puesto++;

        }

        for(int k:array2){
            System.out.println(k);
        }


    }


    /**
     * Se usa el método anterior que comprueba que un número esté o no en el array, en caso de que esté, devuelve
     * i, que sería la posición en la que se encuentra. En caso contrario, devuelve -1.
     * @param array
     * @param numero
     * @return
     */
    public static int posicionArray(int [] array, int numero) {

        int aleatorio = (int) Math.round(Math.random() * 19 + 1);
        int i = 0;

        for (int j = 0; j < array.length; j++) {

            if (comprobarNumero(aleatorio, array) == true) {

                array[j] = aleatorio;
            } else {
                j--;
            }
            aleatorio = (int) Math.round(Math.random() * 19 + 1);

        }

        while (i < array.length) {

            if (array[i] == numero) {

                return i;

            }
            i++;

        }
        return -1;


    }
}// fin