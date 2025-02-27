package practica5;

import java.io.*;

public class datosAleatorios {
    public static void main(String[] args) {
        String inputPath = "C:\\EjerciciosStreams\\datos.txt";
        String outputPath = "C:\\EjerciciosStreams\\datosAleatorio";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             RandomAccessFile randomFile = new RandomAccessFile(outputPath, "rw")) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                String paddedLine = String.format("%-100s", line);
                randomFile.writeBytes(paddedLine);
            }
            System.out.println("Acceso aleatorio creado correctamente");
            
        } catch (IOException e) {
            System.out.println("Error al crear el archivo de acceso aleatorio: " + e.getMessage());
        }
    }
} 