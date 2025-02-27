package practica5;

import java.io.FileWriter;
import java.io.IOException;

public class comprobaryescribir {
    public static void main(String[] args) {
        String filePath = "C:\\EjerciciosStreams\\uno.java";
        
        try (FileWriter writer = new FileWriter(filePath)) {
            for (int i = 0; i <= 10; i++) {
                writer.write(i + "\n");
            }
            System.out.println("Se han escrito los números correctamente!");
            
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
} 