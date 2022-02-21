package Ejercicio3;

import static Ejercicio3.Asientos.*;

public class ejercicio3 {
    public static void main(String[] args) {


        int [] asientos= new int [20];


        introducirPasajeros(asientos);

        for(int x: asientos){

            System.out.println(x);

        }
    }

}
