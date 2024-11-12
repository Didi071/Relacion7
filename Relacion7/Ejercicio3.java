package Relacion7;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe cuantos arrays quieres:");
        int tamaño = entrada.nextInt();
        entrada.nextLine();
        String lista[] = new String[tamaño];

        System.out.println("Escribe la array:");
        for (int i=0; i<tamaño; i++) {
            //lista[i] = entrada.next();
            lista[i] = entrada.nextLine();
            //Si no vale con quitar el salto de linea nextlinte -> next
            //Es porque el intro es un valor que se guarda automaticamente.
            //Si ponemos otra entrada next line vacia esta memoria se limpia y no da error.
        }

        System.out.println("Escribe un caracer: ");
        char caracter = entrada.next().charAt(0);
        
        for (int i=0; i<tamaño; i++){
            char letra = lista[i].charAt(0);
            if (letra == caracter) {
                System.out.println(lista[i]);
            }
        }
        entrada.close();
    }
}
