# La clase Scanner

La clase `Scanner` en Java es una herramienta muy útil para leer datos de entrada desde diferentes fuentes, como la
consola, archivos o cadenas de texto. Esta clase se encuentra en el paquete `java.util` y proporciona métodos para leer
diferentes tipos de datos, como enteros, cadenas, dobles, entre otros.

Para utilizar la clase `Scanner`, primero debemos importarla y crear una instancia de la misma. A continuación, se
muestra un ejemplo básico de cómo usar `Scanner` para leer datos desde la consola:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);

        // Leer una cadena de texto
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Leer un entero
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Mostrar los datos ingresados
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        // Cerrar el scanner
        scanner.close();
    }
}
```

En este ejemplo, se crea un objeto `Scanner` que lee desde la entrada estándar (la consola). Se utilizan los métodos
`nextLine()` para leer una línea de texto y `nextInt()` para leer un número entero. Finalmente, se muestra un mensaje
con los datos
ingresados por el usuario.

Es importante cerrar el objeto `Scanner` después de su uso para liberar los recursos asociados. Esto se hace llamando al
método `close()`.

Para mayor comodidad, veamos una tabla con algunos de los métodos más comunes de la clase `Scanner`:

| Método          | Descripción                                   |
|-----------------|-----------------------------------------------|
| `nextLine()`    | Lee una línea completa de texto.              |
| `next()`        | Lee la siguiente palabra (hasta un espacio).  |
| `nextInt()`     | Lee el siguiente entero.                      |
| `nextDouble()`  | Lee el siguiente número de punto flotante.    |
| `nextBoolean()` | Lee el siguiente valor booleano (true/false). |
