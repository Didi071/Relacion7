package Apuntes;

public class ListasBidemensioneles {
    public static void main(String[] args) {
        String paises[] = {"España", "Rusia", "Japón", "Australia"};
        int estaturas[][] = new int[4][10];

        // Generar estaturas aleatorias y mostrarlas
        System.out.println("Estaturas por país:");
        for (int i = 0; i < estaturas.length; i++) {
            System.out.print(paises[i] + ": ");
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = (int) (Math.random() * 71 + 140); // Entre 140 y 210
                System.out.print(estaturas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Calcular y mostrar media, mínima y máxima para cada país
        for (int i = 0; i < estaturas.length; i++) {
            int suma = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < estaturas[i].length; j++) {
                int estatura = estaturas[i][j];
                suma += estatura;
                if (estatura < min) {
                    min = estatura;
                }
                if (estatura > max) {
                    max = estatura;
                }
            }

            int media = suma / estaturas[i].length; // Despreciar decimales
            System.out.println(paises[i] + ":");
            System.out.println("  Media: " + media + " cm");
            System.out.println("  Mínima: " + min + " cm");
            System.out.println("  Máxima: " + max + " cm");
        }
    }
}
