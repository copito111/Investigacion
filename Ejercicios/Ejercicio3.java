package Ejercicios;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 3: Procesamiento Funcional de Datos
 * Demuestra: API Streams, Expresiones Lambda, Referencias a Métodos y forEach.
 */
public class Ejercicio3 {
    
    public record Empleado(String nombre, String departamento, double salario) {}

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 3: API Streams, Lambdas y Referencias a Métodos ===");
        
        var empleados = List.of(
            new Empleado("Ana", "Desarrollo", 3500.0),
            new Empleado("Carlos", "Desarrollo", 4200.0),
            new Empleado("Beatriz", "Diseño", 2800.0),
            new Empleado("David", "Marketing", 3000.0),
            new Empleado("Elena", "Desarrollo", 4800.0)
        );
        
        System.out.println("\n1. Filtrado y transformación de datos usando API Streams:");
        // Filtrar empleados de Desarrollo con salario > 4000, obtener sus nombres en mayúsculas
        var programadoresSenior = empleados.stream()
            .filter(e -> e.departamento().equals("Desarrollo")) // Lambda
            .filter(e -> e.salario() > 4000.0)                  // Lambda
            .map(Empleado::nombre)                              // Referencia a método
            .map(String::toUpperCase)                           // Referencia a método
            .collect(Collectors.joining(", "));
            
        System.out.println("Programadores Senior de Desarrollo: " + programadoresSenior);
        
        System.out.println("\n2. Reducción e impresión de datos:");
        // Calcular el salario promedio de la empresa usando Streams
        double salarioPromedio = empleados.stream()
            .mapToDouble(Empleado::salario)                     // Referencia a método
            .average()
            .orElse(0.0);
            
        System.out.printf("El salario promedio en la empresa es: $%.2f%n", salarioPromedio);
        
        System.out.println("\n3. Iteración usando el método forEach() de colecciones:");
        // Imprimir todos los empleados de Diseño
        empleados.stream()
            .filter(e -> e.departamento().equals("Diseño"))
            .forEach(e -> System.out.printf("- %s trabaja en %s ganando $%.2f%n", 
                e.nombre(), e.departamento(), e.salario()));
    }
}
