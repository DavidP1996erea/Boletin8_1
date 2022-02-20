package Ejercicio2;

import java.util.Scanner;

public class Alumnos {

    private String nombre;
    private String apellidos;
    private int nota;

    public Alumnos(String nombre, String apellidos){

        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nota=(int)Math.round(Math.random()*9+1);

    }




    public static void menu(Alumnos [] estudiantes){
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        while (opcion!=6){

           mostrarNotas(estudiantes);

            System.out.println("1. Calcular nota media");
            System.out.println("2. Nota más alta");
            System.out.println("3. Nota más baja");
            System.out.println("4. Alumnos con nota superior a la media");
            System.out.println("5. Alumnos con nota inferior a la media");
            System.out.println("6. Salir");
            opcion=sc.nextInt();


        switch (opcion){

            case 1:

                System.out.println("La nota media es: " + notaMedia(estudiantes));

                break;

            case 2:

                notaMasAlta(estudiantes);

                break;

            case 3:

                notaMasBaja(estudiantes);

                break;

            case 4:

                superiorMedia(estudiantes);

                break;

            case 5:

                menorMedia(estudiantes);

                break;

            default:


                if(opcion!=6) {
                    System.out.println("Opción equivocada");
                }

        }





        }
    }

    public static void superiorMedia(Alumnos [] estudiantes){


        System.out.println("Los alumnos que superan la media son: ");

        for (int i=0; i<estudiantes.length; i++){

            if(estudiantes[i].getNota() > notaMedia(estudiantes)) {

                System.out.println(estudiantes[i].getNombre() + " con un " + estudiantes[i].getNota());

            }
        }
    }


    public static void menorMedia(Alumnos [] estudiantes){


        System.out.println("Los alumnos que no superan la media son: ");

        for (int i=0; i<estudiantes.length;i++){

            if(estudiantes[i].getNota()<notaMedia(estudiantes)){

                System.out.println(estudiantes[i].getNombre() + " con un " + estudiantes[i].getNota());
            }
        }
    }


    public static void notaMasBaja(Alumnos [] estudiantes){

        int menorNota=10;


        for (int i=0; i <estudiantes.length; i++){


            if (estudiantes[i].getNota()<menorNota){

                menorNota=estudiantes[i].getNota();

            }

        }

        System.out.println("La nota más baja es: " + menorNota);


    }

    public static void notaMasAlta(Alumnos [] estudiantes){

        int maximaNota=1;


        for (int i=0; i <estudiantes.length; i++){


            if (estudiantes[i].getNota()>maximaNota){

                maximaNota=estudiantes[i].getNota();

            }

        }

        System.out.println("La máxima nota es: " + maximaNota);

    }


    public static int notaMedia(Alumnos [] estudiantes){
        int notaMedia=0;

        for (Alumnos i:estudiantes){

            notaMedia=notaMedia+i.getNota();

        }

        notaMedia=notaMedia/estudiantes.length;


        return notaMedia;


    }

    public static void mostrarNotas(Alumnos [] estudiantes){

        System.out.println("Las nota son:");

        for (Alumnos d : estudiantes){

            System.out.println("El/la alumno/a " + d.getNombre() + " tiene una calificación de un : " + d.getNota());
        }
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
