package Relacion7;

public class Ejercicio13 {
    /*Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
diferentes países. El array que contiene los nombres de los países es el siguiente: país = {“España”,
“Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular mediante un array de 4
filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales de la
media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array de países
(no se pueden escribir directamente). */

    public static void main(String[] args) {
        String país[] = {"Esp. ", "Rus. ", "Jap. ", "Aus. "};
        int estatura[][] = new int[4][10];

        //Llenar el array
        for (int fila=0; fila<estatura.length; fila++){
            for (int columna=0; columna<estatura[fila].length; columna++) {
                estatura[fila][columna] = (int) (Math.random()*70+140);
            }        
        }
        System.out.println("País          Estaturas                           Media   Mínima   Máxima");
        System.out.println("----------------------------------------------------------------------------");


        //Calcular la media, min y max
        for (int i=0; i<estatura.length; i++) {
            int suma = 0;
            int min = 210;
            int max = 140;
            String valores = "";
            for (int j=0; j<estatura[i].length; j++){
                int actual = estatura[i][j];
                suma += actual;
                if (actual<min) {
                    min=actual;
                }
                if (actual>max) {
                    max=actual;
                }
                valores += estatura[i][j] + " ";
            }
            int media=suma/estatura[i].length;
            System.out.println(país[i] + "   " + valores + "   " + media + "      " + min + "      " + max);
        }
    }   
}
//pais 10 medidas med m M