package Relacion7;
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        //Definir array
        int[] lista = new int[20];
        for (int i = 0; i<lista.length; i++) {
            lista[i] = aleatorio.nextInt(100);
        }
        System.out.println("Los elementos de la listas son: ");
        for (int i=0; i<lista.length; i++) {
            System.out.print(lista[i] + " " );
        }
        System.out.println();
        
        //Definir cuantos elementos son pares y cuantos son impares
        int contadorPar = 0;
        int contadorImpar = 0;
        for(int i=0; i<lista.length; i++){
            if (lista[i]%2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }

        //Definir listas auxiliares
        int[] numPar = new int[contadorPar];
        int[] numImpar = new int[contadorImpar];
        int indicePar = 0;
        int indiceImpar = 0;

        //Pasar los numeros pares e impares a dos listas auxiliares
        for (int i =0; i<lista.length; i++) {
            if (lista[i]%2 == 0) {
                numPar[indicePar] = lista[i];
                indicePar++;
            } else {
                numImpar[indiceImpar] = lista[i];
                indiceImpar++;
            }
        }
        //Poner los elementos en la lista principal ordenados primero los pares y luego los impares
        int index=0;
        for (int i =0; i<numPar.length; i++) {
            lista[index] = numPar[i];
            index++;
        }
        for (int i =0; i<numImpar.length; i++) {
            lista[index] = numImpar[i];
            index++;
        }

        //Mostrar la nueva lista
        System.out.println("El nuevo array reorganizado por pares e impares es: ");
        for(int i=0; i<lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}


//No sé como funciona el indice. 