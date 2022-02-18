package principal;

public class miArray {


    public static void cargarArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 19 + 1);
        }


    }

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




    public static void arraryPrimo(int[] array) {

        int puesto = 0;
        int tamano = 0;

        for (int o = 0; o < array.length; o++) {

            if (comprobarPrimo(array)==true) {
                tamano++;
            }
        }

        int[] array2 = new int[tamano];

        for (int i = 0; i < array.length; i++) {

            if (comprobarPrimo(array)==true) {

                array2[puesto] = array[i];
                puesto++;
            }
        }

        for (int j : array2) {

            System.out.println(j);

        }

    }

    public static boolean comprobarPrimo(int [] array) {

        int contador=0;

        for(int i=0; i<array.length ;i++) {

            while (contador <= array[i]) {


                if (array[i] % i == 0) {

                    contador++;

                }

            }

            if (contador < 2) {
                return false;
            } else {
                return true;
            }


        }






}// fin



