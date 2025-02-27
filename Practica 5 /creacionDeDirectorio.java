package practica5;

import java.io.File;
import java.io.IOException;

public class creacionDeDirectorio {
    public static void main(String[] args) {
        // Create directory if it doesn't exist
        File directory = new File("C:\\EjerciciosStreams");
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directorio creado correctamente");
            } else {
                System.out.println("No se ha podido crear el directorio");
                return;
            }
        }

        // Create files
        try {
            File fileOne = new File(directory, "uno.java");
            File fileTwo = new File(directory, "dos.java");
            
            fileOne.createNewFile();
            fileTwo.createNewFile();
            
            System.out.println("Archivos creados correctamente");
            
        } catch (IOException e) {
            System.out.println("Ha ocurrido creando archivos: " + e.getMessage());
        }
    }
} 