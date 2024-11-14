package Relacion7;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Definir variables usadas
        Scanner entrada = new Scanner(System.in);
        int[] listaNum = new int[10];
        int contadorN = 0;
        int contadorP = 0;

        //Pedir los elementos del array
        System.out.println("Escribe 10 números para crear la media de estos: ");
        for (int i = 0; i<listaNum.length; i++) {
            listaNum[i] = entrada.nextInt();
        }
        //Contar positivos y negativos
        for(int i = 0; i<listaNum.length; i++) {
            if (listaNum[i]<0) {
                contadorN ++;
            } else {
                contadorP ++;
            }
        } 

        //Definir las nuevas 2 listas
        double[] numPos = new double[contadorP];
        double[] numNeg = new double[contadorN];
        int posIndex = 0, negIndex = 0;

        //Nuevos array
        for (int i=0; i<listaNum.length-1; i++) {
            if (listaNum[i]<0){
                numNeg[negIndex++]=listaNum[i];
            } else {
                numPos[posIndex++]=listaNum[i];
            }
        }

        //Ver los numeros negativos y positivos de cada array
        System.out.print("Números negativos: ");
        for (int i = 0; i < numNeg.length; i++) {
            System.out.print(numNeg[i] + " ");
        }
        System.out.print("Números positivos: ");
        for (int i = 0; i < numPos.length; i++) {
                System.out.print(numPos[i] + " ");
            }

        //Calcular la media de la nueva array de numeros negativos
        double sumaNeg = 0;
        for(int i = 0; i<numNeg.length; i++){
            sumaNeg += numNeg[i];
        }
        //Lo mismo pero de numeros positivos
        double sumaPos = 0;
        for(int i  = 0; i<numPos.length; i++){
            sumaPos += numPos[i];
        }

        //Calcular la media
        double mediaPos =  sumaPos/numPos.length;
        System.out.println("Media de números positivos: " + mediaPos);

        double mediaN = sumaNeg / numNeg.length;
        System.out.println("Media de números negativos: " + mediaN);
        entrada.close();
        
        //double mediaPos = (numPos.length > 0) ? (double) sumaPos / numPos.length : 0;

    }
}
