import java.util.Scanner;
import java.util.Arrays;

public class OrdenarNumeros {

    public static void main(String[] args) {
    	
        int[] numeros = solicitarNumeros(); 
        String orden = solicitarOrden();   
        ordenarNumeros(numeros, orden);
        mostrarNumeros(numeros);
    }

    public static int[] solicitarNumeros() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3]; /
        for (int i = 0; i < numeros.length; i++) {
            boolean entradaValida = false;
            do {
                System.out.print("Introduce el número " + (i + 1) + ": ");
                if (scanner.hasNextInt()) { 
                    numeros[i] = scanner.nextInt(); 
                    entradaValida = true; 
                } else {
                    System.out.println("No es un número válido. Inténtalo de nuevo.");
                    scanner.next();}
            } while (!entradaValida);
        }

        return numeros;

    public static String solicitarOrden() {
        Scanner scanner = new Scanner(System.in);
        String orden;
        do {
            System.out.print("Introduce el orden de ordenamiento (ascendente/descendente): ");
            orden = scanner.nextLine().toLowerCase();
            if (!orden.equals("ascendente") && !orden.equals("descendente")) {
                System.out.println("Entrada no válida. Por favor, escribe 'ascendente' o 'descendente'.");
            }
        } while (!orden.equals("ascendente") && !orden.equals("descendente"));

        return orden;
    }

    public static void ordenarNumeros(int[] numeros, String orden) {
        if (orden.equals("ascendente")) {
            Arrays.sort(numeros); 
        } else if (orden.equals("descendente")) {
            Arrays.sort(numeros); 
            for (int i = 0; i < numeros.length / 2; i++) {
                int temp = numeros[i];
                numeros[i] = numeros[numeros.length - 1 - i];
                numeros[numeros.length - 1 - i] = temp;
            }
        }
    }

    public static void mostrarNumeros(int[] numeros) {
        System.out.print("Números ordenados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}