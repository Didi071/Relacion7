package Relacion7;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores
        según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma
        de tabla como se muestra en la figura.*/ 
        int num[][] = new int[3][6];
        num[0][0] = 0;
        num[1][0] = 75;
        num[0][1] = 30;
        num[0][2] = 2;
        num[2][2] = -2;
        num[2][3] = 9;
        num[1][4] = 0;
        num[0][5] = 5;
        num[2][5] = 11;
        System.out.println("Array   Columana 0   Columna 1   Columna 2   Columna 3  Columna 4   Columna 5");
        System.out.println("-------------------------------------------------------------------------------");
        for (int fila=0; fila<num.length; fila++){
            System.out.print("Fila " + fila + "     ");
            for (int columna=0; columna<num[fila].length; columna++)
            {
                System.out.print(num[fila][columna] + "           ");
            }
            System.out.println();
        }
    }
}
