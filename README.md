# Taller de Sintaxis Moderna y Métodos Abreviados en Java

Este repositorio contiene los entregables del **Taller de Investigación y Ejercicios Prácticos** sobre sintaxis modernas, características avanzadas y métodos abreviados de Java (desde Java 8 hasta Java 21). El objetivo principal es reducir el código repetitivo (*boilerplate*), incrementar la legibilidad y mejorar la robustez de los desarrollos en Java.

---

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

*   **[investigacion.md](file:///home/Camilo/Descargas/trabajo/investigacion.md)**: Documento de investigación exhaustivo en formato Markdown. Contiene la descripción de 20 temas de sintaxis en Java (15 del listado propuesto y 5 adicionales investigados de manera autónoma). Cada tema incluye su explicación, ventajas, desventajas, cuándo utilizarlo y un bloque de código comparativo entre la forma tradicional y la forma moderna.
*   **[Ejercicios/](file:///home/Camilo/Descargas/trabajo/Ejercicios/)**: Carpeta que contiene 5 programas funcionales escritos en Java que aplican las características investigadas.
    *   `Ejercicio1.java`: Operador Ternario, Text Blocks y Switch Expressions.
    *   `Ejercicio2.java`: Records, Inferencia de Tipos con `var` y Colecciones Inmutables.
    *   `Ejercicio3.java`: API Streams, Lambdas y Referencias a Métodos (`::`).
    *   `Ejercicio4.java`: Clase `Optional` y Pattern Matching con `instanceof`.
    *   `Ejercicio5.java`: Try-with-resources, Sequenced Collections y `Map.getOrDefault()`.

---

## Resumen de la Investigación

En el archivo `investigacion.md` se analizan en detalle los siguientes conceptos clave de Java moderno:

1.  **Operador Ternario (`?:`)**: Simplifica asignaciones condicionales simples.
2.  **Inferencia de Tipos (`var`)**: Declara variables locales sin explicitar el tipo de dato.
3.  **Expresiones Lambda**: Habilita la programación funcional en Java.
4.  **Referencias a Métodos (`::`)**: Abreviación para invocar métodos existentes como lambdas.
5.  **API Streams**: Procesamiento de datos fluido, funcional y paralelizable.
6.  **Clase Optional**: Contenedor para evitar excepciones `NullPointerException`.
7.  **Switch Expression**: Switch mejorado que retorna valores y evita el uso de `break`.
8.  **Text Blocks (`"""`)**: Cadenas multilínea ideales para JSON, HTML y SQL.
9.  **Records**: Clases de datos inmutables autogeneradas por el compilador.
10. **Pattern Matching con `instanceof`**: Valida y extrae variables de tipos seguros en un solo paso.
11. **List.of()**: Creación de listas inmutables de manera ágil.
12. **Set.of()**: Creación de conjuntos inmutables sin duplicados.
13. **Map.of()**: Creación rápida de mapas clave-valor inmutables.
14. **Método `forEach()`**: Iteración simplificada de colecciones.
15. **Método `removeIf()`**: Eliminación condicional segura en colecciones mutables.
16. **Try-with-resources** *(Adicional)*: Cierre seguro automático de recursos `AutoCloseable`.
17. **Sealed Classes** *(Adicional)*: Control explícito sobre la jerarquía de herencia.
18. **Pattern Matching en switch** *(Adicional)*: Evaluación de tipos y extracción automática en bloques switch.
19. **Sequenced Collections** *(Adicional)*: Acceso consistente al primer y último elemento de una colección en Java 21.
20. **Método `getOrDefault()`** *(Adicional)*: Valor de respaldo inmediato para claves no encontradas en mapas.

---

## Descripción de los Ejercicios Implementados

### 📂 [Ejercicio 1: Sintaxis Expresivas](file:///home/Camilo/Descargas/trabajo/Ejercicios/Ejercicio1.java)
Combina el operador ternario, expresiones switch y bloques de texto para generar un reporte formateado sobre la calificación de un estudiante.

### 📂 [Ejercicio 2: Modelado Inmutable y Factory Methods](file:///home/Camilo/Descargas/trabajo/Ejercicios/Ejercicio2.java)
Define un record para representar un `Producto` inmutable. Crea una lista de estos usando `List.of()` con inferencia de tipos `var` y define un mapa inmutable de tasas de cambio con `Map.of()`.

### 📂 [Ejercicio 3: Procesamiento Funcional de Datos](file:///home/Camilo/Descargas/trabajo/Ejercicios/Ejercicio3.java)
Aplica la API Streams para filtrar un grupo de empleados, mapear sus nombres a mayúsculas usando referencias a métodos (`::`), calcular el salario promedio y realizar iteraciones rápidas con `.forEach()`.

### 📂 [Ejercicio 4: Robustez y Seguridad en Tipado](file:///home/Camilo/Descargas/trabajo/Ejercicios/Ejercicio4.java)
Ilustra el uso de `instanceof` con Pattern Matching para extraer y tratar diferentes tipos de datos dentro de una lista heterogénea. Adicionalmente, implementa una búsqueda segura que devuelve un `Optional` para mitigar valores nulos.

### 📂 [Ejercicio 5: Administración de Recursos y Colecciones Ordenadas](file:///home/Camilo/Descargas/trabajo/Ejercicios/Ejercicio5.java)
Utiliza *try-with-resources* para escribir y leer de forma segura archivos en el sistema sin fugas de memoria. Aplica la nueva API de *Sequenced Collections* (Java 21) para interactuar con los extremos de una lista y revertirla, y usa `getOrDefault()` para controlar permisos de acceso de usuarios ausentes en un mapa.

---

## Requisitos de Ejecución

*   **Java Development Kit (JDK) 21 o superior**: Es necesario debido al uso de características de Java 21 como *Sequenced Collections*.
*   Terminal de comandos o entorno de desarrollo preferido (como IntelliJ IDEA, VS Code o NetBeans).

## Cómo Ejecutar los Ejercicios

Para compilar y ejecutar los ejercicios desde la terminal, sitúate en el directorio raíz de este proyecto (`/home/Camilo/Descargas/trabajo/`) y ejecuta los siguientes comandos de forma directa (Java 11+ permite ejecutar archivos de código fuente directamente sin compilar previamente en un archivo `.class`):

```bash
# Ejecutar Ejercicio 1
java Ejercicios/Ejercicio1.java

# Ejecutar Ejercicio 2
java Ejercicios/Ejercicio2.java

# Ejecutar Ejercicio 3
java Ejercicios/Ejercicio3.java

# Ejecutar Ejercicio 4
java Ejercicios/Ejercicio4.java

# Ejecutar Ejercicio 5
java Ejercicios/Ejercicio5.java
```

---

## Licencia & Créditos

Trabajo realizado para el Taller de Investigación sobre Sintaxis Comprimidas en Java. Desarrollado por **Camilo**.
