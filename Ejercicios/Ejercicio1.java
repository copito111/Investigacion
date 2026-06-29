package Ejercicios;

/**
 * Ejercicio 1: Sintaxis Expresivas
 * Demuestra: Operador Ternario, Text Blocks y Switch Expressions.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1: Sintaxis Expresivas ===");
        
        int puntuacion = 85;
        
        // 1. Operador Ternario
        String estado = (puntuacion >= 60) ? "Aprobado" : "Reprobado";
        
        // 2. Switch Expression
        char clasificacion = switch (puntuacion / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
        
        // 3. Text Blocks
        String informe = """
            --------------------------------------
            Reporte de Calificación del Estudiante
            --------------------------------------
            Puntuación Numérica: %d
            Estado del Alumno:   %s
            Clasificación Letra: %c
            --------------------------------------
            """.formatted(puntuacion, estado, clasificacion);
            
        System.out.println(informe);
    }
}
