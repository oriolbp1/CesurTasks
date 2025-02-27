package practica5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Indica la base del triangulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Indica la altura del triangulo: ");
        double height = scanner.nextDouble();
        
        double area = (base * height) / 2;
        
        try (FileWriter writer = new FileWriter("C:\\EjerciciosStreams\\dos.java")) {
            writer.write("Indica el area de un triangulo\n");
            writer.write("Base: " + base + "\n");
            writer.write("Altura: " + height + "\n");
            writer.write("Area: " + area);
            
            System.out.println("El area del triangulo es: " + area);
            
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        
        scanner.close();
    }
} 