package Ejercicio5;

public class Adivinar {



    public static int[] llenarArray(int [] adivinar){

        for (int i=0; i<adivinar.length;i++){

            adivinar[i]=(int) Math.round(Math.random()*8+1);
        }

        return adivinar;
    }


    public static void comprobarNumero(int [] adivinar, String numero){


      for (int i=0; i<adivinar.length;i++){


          for (int j=0; j<4;j++){

              if((convertir(adivinar).charAt(i)==numero.charAt(j)) ){

                  System.out.print("0");
              }


          }
      }

    }





    public static String convertir(int [] adivinar){
        String convertir = "";
        for(int i=0; i<adivinar.length;i++) {

           convertir+=String.valueOf(adivinar[i]);
        }
        return convertir;
    }

}

