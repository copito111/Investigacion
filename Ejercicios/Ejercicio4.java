package Ejercicios;

import java.util.List;
import java.util.Optional;

/**
 * Ejercicio 4: Robustez y Seguridad en Tipado
 * Demuestra: Clase Optional y Pattern Matching con instanceof.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 4: Clase Optional y Pattern Matching con instanceof ===");

        var elementos = List.of("Texto de ejemplo", 12345, 99.9, "Otro texto");

        System.out.println("\n1. Demostración de Pattern Matching con instanceof:");
        for (var obj : elementos) {
            // Pattern Matching con instanceof (Evita casteos manuales redundantes)
            if (obj instanceof String s) {
                System.out.println("[String Detectado] Texto en mayúsculas: " + s.toUpperCase());
            } else if (obj instanceof Integer i) {
                System.out.println("[Integer Detectado] Entero multiplicado por 2: " + (i * 2));
            } else {
                System.out.println("[Tipo No Soportado] Clase simple: " + obj.getClass().getSimpleName());
            }
        }

        System.out.println("\n2. Demostración de Clase Optional (Evitar NullPointerException):");
        var resultadoExistente = buscarPorIndice(elementos, 0);
        var resultadoAusente = buscarPorIndice(elementos, 10);

        // Procesar Optional si el valor está presente
        resultadoExistente.ifPresent(val -> System.out.println("Búsqueda en índice 0 encontró: " + val));
        
        // Mapear y proveer valor por defecto en caso de ausencia
        String valorPorDefecto = resultadoAusente
            .map(Object::toString)
            .orElse("Índice fuera de rango (Acción controlada sin excepción)");
            
        System.out.println("Búsqueda en índice 10 retornó: " + valorPorDefecto);
    }

    /**
     * Busca un elemento en una lista dado un índice de forma segura.
     * Retorna un Optional para indicar que la respuesta puede estar vacía.
     */
    public static Optional<Object> buscarPorIndice(List<?> lista, int indice) {
        if (indice >= 0 && indice < lista.size()) {
            return Optional.of(lista.get(indice));
        }
        return Optional.empty();
    }
}
