package Relacion7;

//import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
      //  Scanner entrada = new Scanner(System.in);
        int [] enteros = {8,7,8,9,10,8};
        int entero = 8;
        int contador=0;
        for (int i=0; i<enteros.length; i++) {
            if (enteros[i] == entero) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
