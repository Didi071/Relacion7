package Relacion7;

import java.util.Random;

public class Ejercicio7 {
public static void main(String[] args) {
        //Definir los array de 20 elementos 
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];
        
        //Llenar array numero con numeros aleatorios
        Random aleatorio = new Random();

        for(int i = 0; i < numero.length; i++) {
            numero[i] = aleatorio.nextInt(100);
        }

        for(int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
        
        //Llenar array cuadrado con los cuadrados de numeros
        for (int i = 0; i<cuadrado.length; i++){
            cuadrado[i] = numero[i] * numero[i];
        }
        for(int i = 0; i < cuadrado.length; i++) {
            System.out.println(cuadrado[i]);
        }
        
        //Llenar array cubo con los cubos de numeros
        for (int i = 0; i<cubo.length; i++){
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
        for(int i = 0; i < cubo.length; i++) {
            System.out.println(cubo[i]);
        }
    }
}
//Duda: Numeros aleatorios