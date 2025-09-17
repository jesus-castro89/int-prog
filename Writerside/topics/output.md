# Las funciones de salida en Java

En Java, las funciones de salida se utilizan para mostrar información al usuario a través de la consola o para escribir
datos en archivos. Las clases más comunes para realizar estas tareas son `System.out` para la consola.

## Salida en Consola

La forma más común de mostrar información en la consola es utilizando `System.out.print()` y `System.out.println()`. La
diferencia entre ambos es que `println()` añade un salto de línea al final de la salida, mientras que `print()` no lo
hace. Aquí hay algunos ejemplos:

```java
public class Main {
    public static void main(String[] args) {
        // Usando print()
        System.out.print("Hola, ");
        System.out.print("mundo!");
        System.out.print("\n"); // Salto de línea manual    
        // Usando println()
        System.out.println("Hola, mundo!");
        System.out.println("Esta es una nueva línea.");
    }
}
```

En este ejemplo, la primera parte utiliza `print()` para mostrar "Hola, mundo!", en la misma línea, mientras que la
segunda parte utiliza `println()` para mostrar cada mensaje en una nueva línea.

## Formateo de Salida

Java también proporciona la clase `System.out.printf()` para formatear la salida de manera más controlada. Esta función
permite especificar un formato para los datos que se van a imprimir. Aquí hay un ejemplo:

```java
public class Main {
    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 25;
        double altura = 1.75;

        System.out.printf("Nombre: %s, Edad: %d, Altura: %.2f metros%n", nombre, edad, altura);
    }
}
```

En este ejemplo, `%s` se utiliza para cadenas, `%d` para enteros y `%.2f` para números de punto flotante con dos
decimales.
El `%n` al final se utiliza para añadir un salto de línea de manera portátil.

Para mayor comodidad, aquí hay una tabla con algunos de los especificadores de formato más comunes:

| Especificador | Descripción                              |
|---------------|------------------------------------------|
| `%s`          | Cadena de texto                          |
| `%d`          | Entero decimal                           |
| `%f`          | Número de punto flotante                 |
| `%.nf`        | Número de punto flotante con n decimales |
| `%n`          | Nueva línea (salto de línea)             | 
| `%c`          | Carácter                                 |
| `%b`          | Booleano (true/false)                    |
| `%x`          | Entero en formato hexadecimal            |
| `%o`          | Entero en formato octal                  |