package Relacion7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numeros[] = new int[100];
        
        Random aleatorio = new Random();

        //Llenar array
        for (int i = 0; i<numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(20);
        }
        for (int i= 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        //Pedir dos valores
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int val1 = entrada.nextInt();
        System.out.println("Dame el segundo valor: ");
        int val2 = entrada.nextInt();
        entrada.close();

        //Cambiar primer valor por el segundo
        for (int i = 0; i<numeros.length; i++){
            if (numeros[i] == val1) {
                numeros[i] = val2;
            }
        }
        for (int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
