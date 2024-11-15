package Relacion7;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] lista = new int[20];
        for (int i=0; i<lista.length; i++) {
            lista[i] = aleatorio.nextInt(400);
        }

        System.out.println("Los elementos del array son: ");
        for (int i=0; i<lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("Que quieres resaltar: ");
        System.out.println("1. Los múltiplos de 5");
        System.out.println("2. Los múltiplos de 7");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();

        System.err.println("El array resaltado: ");
        switch (opcion) {
            case 1:
                for (int i=0; i<lista.length; i++){
                    if (lista[i]%5 == 0) {
                        System.out.print(" [" + lista[i] + "] ");
                    } else {
                        System.out.print(lista[i] + " ");
                    }
                }
                break;
            case 2:
                for (int i=0; i<lista.length; i++){
                    if (lista[i]%7 == 0) {
                        System.out.print(" [" + lista[i] + "] ");
                    } else {
                        System.out.print(lista[i] + " ");
                }
            }
                break;
            default:
            System.out.println("Opción no valida");
                break;
        }
        entrada.close();
    }
}
