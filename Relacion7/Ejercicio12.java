package Relacion7;

import java.util.Random;

public class Ejercicio12 {
    /* Escribe un programa que pida 20 números enteros (o que los genere de forma aleatoria). Estos
números se deben introducir en un array bidimensional de 4 filas por 5 columnas. El programa
mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma
total debe aparecer en la esquina inferior derecha.
 */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int lista[][] = new int[4][5];
        int sumaTotal =0;;

        for (int fila = 0; fila<lista.length; fila++){
            for (int columna=0; columna<lista[fila].length; columna++){
                lista[fila][columna] = aleatorio.nextInt(100);
                System.out.print(lista[fila][columna] + " ");
            }   
            System.out.println();
        }


        //Cabezado
        System.out.println("Filas  Columna1  Columna2  Columna3  Columna4  Columna5  Suma");
        System.out.println( "--------------------------------------------------------------");

        //Sumar filas
        for(int i=0; i<lista.length; i++){
            int sumaF = 0;
            String valoresF = "";
            for (int j=0; j<lista[i].length; j++ ){
                int actual = lista[i][j];
                sumaF+=actual;
                sumaTotal+=actual;
                valoresF += lista[i][j] + "        ";
            }
            System.out.println("Fila " + i + "   " + valoresF + sumaF);
        }

        //Sumar columnas
        // Se pone lista[0].length  para acceder a la longitud de la primera fila (5). Tiene 5 columnas.
        System.out.print("Total   ");
        for (int i=0; i<lista[0].length; i++){
            int sumaC = 0;
            for (int j=0; j<lista.length; j++){ 
                sumaC += lista[j][i]; 
            }
            System.out.print(sumaC + "       " );
        }
        System.out.print( sumaTotal);
        System.out.println(); 
        }
    }
    
//aleatorio = Math.random();
//aleatorio = int (Math.floor(Math.random)()*20 + 5) numeros entre 5 y 25
//aleatorio = int (Math.floor(Math.random)()*20) numeros hasta 20
