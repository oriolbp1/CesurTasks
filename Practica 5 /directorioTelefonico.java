package practica5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class directorioTelefonico {
    public static void main(String[] args) {
        String filePath = "C:\\EjerciciosStreams\\datos.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
} 