# Ejemplo 5: De Pseudocódigo a Java

## Descripción

Dado el siguiente pseudocódigo, implementa su equivalente en Java. Asegúrate de que el programa funcione correctamente y
maneje diferentes casos de entrada.

```
AreaPerimetroHexagono

Declaración de Variables
    Real: lado, area, perimetro

Declaración de Constantes
    Real: apotema = 6.0

1. INICIO
2. ESCRIBIR "Ingrese la longitud del lado del hexágono:"
3. LEER lado
4. HACER perimetro = 6 * lado
5. HACER area = (perimetro * apotema) / 2
6. ESCRIBIR "El perímetro del hexágono es: ", perimetro
7. ESCRIBIR "El área del hexágono es: ", area   
8. FIN
```

## Pasos para la Implementación

1. **Configuración del Entorno**: Asegúrate de tener instalado un entorno de desarrollo para Java (como IntelliJ IDEA,
   Eclipse o NetBeans) y el JDK (Java Development Kit).
2. **Crear un Nuevo Proyecto o una nueva Clase**: Crea un nuevo proyecto Java o una nueva clase dentro de un proyecto
   existente.
3. **Implementar el Código**: Traduce el pseudocódigo proporcionado a Java, siguiendo la estructura y lógica del
   pseudocódigo.
4. **Manejo de Entrada y Salida**: Utiliza la clase `Scanner` para manejar la entrada del usuario desde la consola y
   `System.out.println` o `System.out.printf` para mostrar los resultados.
5. **Pruebas**: Ejecuta el programa con diferentes valores de entrada para asegurarte de que los cálculos de área y
   perímetro son correctos.

## Ejemplo de Implementación en Java

El siguiente código pertenece al archivo `AreaPerimetroHexagono.java`:

```java
// Importamos la clase Scanner para leer la entrada del usuario

import java.util.Scanner;

// Definimos la clase principal
public class AreaPerimetroHexagono {
    
    // Definimos el método principal
    public static void main(String[] args) {
        // Declaración de variables
        double lado, area, perimetro;
        
        // Declaración de la constante
        final double apotema = 6.0;
        // Crear un objeto Scanner para leer la entrada del usuario
        // Equivalente a: 1. INICIO
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario la longitud del lado del hexágono
        // Equivalente a: 2. ESCRIBIR "Ingrese la longitud del lado del hexágono:"
        System.out.print("Ingrese la longitud del lado del hexágono: ");
        
        // Leer la longitud del lado ingresada por el usuario
        // Equivalente a: 3. LEER lado
        lado = scanner.nextDouble();
        
        // Calcular el perímetro del hexágono
        // Equivalente a: 4. HACER perimetro = 6 * lado
        perimetro = 6 * lado;
        
        // Calcular el área del hexágono
        // Equivalente a: 5. HACER area = (perimetro * apotema) / 2
        area = (perimetro * apotema) / 2;
        
        // Mostrar el perímetro del hexágono
        // Equivalente a: 6. ESCRIBIR "El perímetro del hexágono es: ", perimetro
        System.out.printf("El perímetro del hexágono es: %.2f%n", perimetro);
        
        // Mostrar el área del hexágono
        // Equivalente a: 7. ESCRIBIR "El área del hexágono es: ", area
        System.out.printf("El área del hexágono es: %.2f%n", area);
        
        // Cerrar el objeto Scanner
        // Equivalente a: 8. FIN
        scanner.close();
    }// Recuerda cerrar la función main
}// Recuerda cerrar la clase
```

## Notas

- En nuestro caso debemos recordar que la importación y uso de la clase `Scanner` es necesaria para manejar la entrada
  del usuario.
- La constante `apotema` se define utilizando la palabra clave `final` para indicar que su valor no cambiará.
- Utilizamos `System.out.printf` para formatear la salida con dos decimales.
- Asegúrate de probar el programa con diferentes valores de entrada para verificar que los cálculos son correctos.