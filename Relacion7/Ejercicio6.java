package Relacion7;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Pedir el numero de elmetos del array
        System.out.println("Cuántos alumnos hay: ");
        int NumAlumnos = entrada.nextInt();

        //Definir variables
        int notas[] = new int[NumAlumnos];
        //media del grupo
        //almunos con notas superiores a la media

        //Pedir las notas de los alumnos
        System.out.println("Introduce la nota de cada alumno: ");
        for(int i=0; i<NumAlumnos; i++){
            notas[i] = entrada.nextInt();
            //System.out.println(notas[i]);
        }

        //calcular la media
        double suma = 0;
        for (int i = 0; i<NumAlumnos; i++){
            suma += notas[i];
        }
        double media = suma/NumAlumnos;
        
        System.out.println("La media de la clase es: " + media);
        
        for(int i = 0; i<NumAlumnos; i++){
            if (notas[i] > media) {
                System.out.println("El alumno " + (i+1) + " tiene una nota superior a la media");
            }
        }
        entrada.close();
    }
}
//Duda porque es (i + 1)