package Relacion7;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe la longitud de los arrays");
        int tamaño =entrada.nextInt();

        int[] numeros1 = new int[tamaño];
        int[] numeros2 = new int[tamaño];
        int[] nuevaLista= new int[tamaño];

        System.out.println("Escribe los números del 1er array:");
        for (int i =0; i<tamaño; i++){
            numeros1[i]=entrada.nextInt();
        }

        System.out.println("Escribe los números del 2º array:");
        for (int i =0; i<tamaño; i++){
            numeros2[i]=entrada.nextInt();
        } 
        for (int i=0; i<tamaño; i++) {
            if (numeros1[i]>numeros2[i]) {
                nuevaLista[i] = numeros1[i];
            }else if(numeros1[i]==numeros2[i]){
                nuevaLista[i] = numeros1[i];
            }else {
                nuevaLista[i] = numeros2[i];
            }
        }
        System.out.println("La nueva array es: ");
        for(int i=0; i<nuevaLista.length; i++) {
            System.out.println(nuevaLista[i]);
        }
        entrada.close();
    }
}
