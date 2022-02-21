package Ejercicio2;


import static Ejercicio2.Alumnos.*;


public class ejercicio2 {

    public static void main(String[] args) {





        Alumnos estudiante1 = new Alumnos("Laura", "Gonzalez Chacón");
        Alumnos estudiante2 = new Alumnos("Miryam", "Gonzalez Chacón");
        Alumnos estudiante3 = new Alumnos("Rubén", "Lindes");
        Alumnos estudiante4 = new Alumnos("Ángel", "Navarro");

        Alumnos[] estudiantes={estudiante1, estudiante2, estudiante3, estudiante4};





        menu(estudiantes);

    }
}
