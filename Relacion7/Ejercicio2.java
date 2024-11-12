package Relacion7;

public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena[] = {"mola", "sol", "ordenador", "pastel"};
        String cadenaLarga = "";

        for (int i=0; i<cadena.length; i++) {
            if (cadena[i].length()>cadenaLarga.length()) {
                cadenaLarga = cadena[i];
            }
        }
        System.out.println(cadenaLarga);
    }
}
