package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ejercicio 5: Administración de Recursos y Colecciones Ordenadas
 * Demuestra: Try-with-resources, Sequenced Collections (Java 21) y Map.getOrDefault().
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 5: Recursos y Nuevas Interfaces en Java 21 ===");

        String rutaArchivo = "temporal_log.txt";

        // 1. Try-with-resources para escribir en un archivo (Estructura AutoCloseable)
        try (var escritor = new BufferedWriter(new FileWriter(rutaArchivo))) {
            escritor.write("Evento: Inicio de sistema\n");
            escritor.write("Evento: Error de login\n");
            escritor.write("Evento: Acceso denegado\n");
            escritor.write("Evento: Intento de recuperación\n");
            System.out.println("\n[Try-with-resources] Log temporal escrito exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }

        // 2. Try-with-resources para leer del archivo
        List<String> eventos = new ArrayList<>();
        try (var lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                eventos.add(linea);
            }
            System.out.println("[Try-with-resources] Archivo de log leído y cargado en memoria.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        // 3. Sequenced Collections (Novedad de Java 21)
        if (!eventos.isEmpty()) {
            System.out.println("\n--- Demostración de Sequenced Collections ---");
            // Acceso simple al primer y último elemento de manera uniforme
            System.out.println("Primer evento registrado: " + eventos.getFirst());
            System.out.println("Último evento registrado: " + eventos.getLast());
            
            // Revertir la colección fácilmente con el método reversed()
            var eventosReversos = eventos.reversed();
            System.out.println("Historial invertido (del más reciente al más antiguo):");
            eventosReversos.forEach(ev -> System.out.println("  - " + ev));
        }

        // 4. Map.getOrDefault()
        System.out.println("\n--- Demostración de Map.getOrDefault ---");
        Map<String, Integer> nivelesDeAcceso = new HashMap<>();
        nivelesDeAcceso.put("admin", 3);
        nivelesDeAcceso.put("editor", 2);
        nivelesDeAcceso.put("visor", 1);

        // Consultar niveles de acceso con control de nulos en línea
        String[] usuariosAProbar = {"admin", "editor", "usuario_comun", "invitado"};
        for (String usr : usuariosAProbar) {
            // Si el usuario no existe en el mapa, devuelve el nivel por defecto 0
            int nivel = nivelesDeAcceso.getOrDefault(usr, 0);
            System.out.printf("Usuario: %-15s | Nivel de Acceso Otorgado: %d%n", usr, nivel);
        }

        // Limpieza de archivo temporal
        java.io.File archivo = new java.io.File(rutaArchivo);
        if (archivo.exists()) {
            archivo.delete();
        }
    }
}
