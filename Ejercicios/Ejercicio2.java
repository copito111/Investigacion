package Ejercicios;

import java.util.List;
import java.util.Map;

/**
 * Ejercicio 2: Modelado Inmutable y Factory Methods
 * Demuestra: Records, Inferencia de Tipos (var) y Colecciones Inmutables (List.of, Map.of).
 */
public class Ejercicio2 {
    
    // 1. Definición de un Record para almacenar información de productos (inmutable)
    public record Producto(String id, String nombre, double precio, String categoria) {}

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 2: Records, Inferencia de Tipos y Colecciones Inmutables ===");
        
        // 2. Uso de List.of() e inferencia con var
        var productos = List.of(
            new Producto("P001", "Laptop Gamer", 1200.50, "Electrónica"),
            new Producto("P002", "Teclado Mecánico", 85.00, "Accesorios"),
            new Producto("P003", "Mouse Inalámbrico", 45.00, "Accesorios"),
            new Producto("P004", "Monitor 4K", 350.00, "Electrónica")
        );
        
        // 3. Uso de Map.of() para equivalencias de divisas inmutables
        var tasasCambio = Map.of(
            "USD", 1.0,
            "EUR", 0.92,
            "COP", 4100.0
        );
        
        System.out.println("\n--- Lista de Productos (Records y List.of) ---");
        for (var p : productos) {
            System.out.printf("- ID: %s | %-18s | Categoría: %-12s | Precio: $%.2f USD%n", 
                p.id(), p.nombre(), p.categoria(), p.precio());
        }
        
        System.out.println("\n--- Tasas de Cambio Cargadas (Map.of) ---");
        tasasCambio.forEach((divisa, tasa) -> 
            System.out.printf("1 USD equivale a: %.2f %s%n", tasa, divisa)
        );
    }
}
