# La clase `IO` en Java 25

La clase `IO` en Java 25 es una parte fundamental del proceso de entrada y salida (I/O) en el lenguaje de programación
Java. Esta clase proporciona una serie de métodos y funcionalidades que permiten a los desarrolladores manejar
operaciones de lectura y escritura de datos de manera eficiente y sencilla.

Desde esta versión de Java, la clase `IO` ha sido mejorada para ofrecer un rendimiento superior y una mayor facilidad de
uso. A continuación, se describen algunas de las características y funcionalidades clave de la clase `IO` en Java 25:

## Características principales de la clase IO

1. **Flujos de datos**: La clase `IO` proporciona una variedad de flujos de datos (streams) que permiten la lectura y
   escritura de datos en diferentes formatos, como bytes, caracteres y objetos. Esto incluye flujos de entrada y salida
   para archivos, memoria y redes.
2. **Manejo de excepciones**: La clase `IO` incluye mecanismos robustos para el manejo de excepciones, lo que facilita
   la
   gestión de errores durante las operaciones de I/O. Esto ayuda a garantizar que las aplicaciones sean más
   confiables y resistentes a fallos.
3. **Operaciones asíncronas**: Java 25 introduce soporte para operaciones de I/O asíncronas, lo que permite a los
   desarrolladores realizar tareas de entrada y salida sin bloquear el hilo principal de ejecución. Esto es
   especialmente
   útil en aplicaciones que requieren alta concurrencia y rendimiento.
4. **Compatibilidad con NIO**: La clase `IO` en Java 25 es compatible con la API de NIO (New Input/Output), que ofrece
   funcionalidades avanzadas para el manejo de canales, buffers y selectores. Esto permite a los desarrolladores crear
   aplicaciones más eficientes y escalables.
5. **Facilidad de uso**: La clase `IO` ha sido diseñada para ser fácil de usar, con una sintaxis clara y concisa. Esto
   facilita a los desarrolladores la implementación de operaciones de I/O en sus aplicaciones sin necesidad de lidiar
   con complejidades innecesarias.
6. **Autoimportación**: En Java 25, la clase `IO` puede ser utilizada sin necesidad de importar explícitamente paquetes,
   lo que simplifica el código y mejora la legibilidad.

## Ejemplo de uso de la clase IO

```java
public class MiClase {
    void main() {
        IO.println("Hola, Mundo!");
    }
}
```

En este ejemplo, se utiliza el método `println` de la clase `IO` para imprimir un mensaje en la consola. La clase `IO`
facilita la realización de esta operación de salida de manera sencilla y directa.

## Lectura de teclado

La clase IO también permite la lectura de datos desde el teclado de manera sencilla. A continuación, se muestra un
ejemplo de cómo leer una cadena de texto ingresada por el usuario:

```java
public class LeerTeclado {
    void main() {
        IO.println("Por favor, ingresa tu nombre:");
        String nombre = IO.readln();
        IO.println("Hola, " + nombre + "!");
        int edad = Integer.parseInt(IO.readln("Por favor, ingresa tu edad: "));
    }
}
```

En este ejemplo, se utiliza el método `readln` de la clase `IO` para leer una línea de texto desde el teclado. El
programa solicita al usuario que ingrese su nombre y edad, y luego imprime un saludo personalizado.

## Entendiendo la lectura de datos

Para que el método `readln` funcione correctamente, es importante entender cómo se maneja la entrada de datos en Java.
El método `readln` espera hasta que el usuario presione la tecla "Enter" para finalizar la entrada. Esto significa que
el usuario puede ingresar una cadena de texto completa, incluyendo espacios, y luego presionar "Enter" para que el
método capture toda la línea. Si el usuario simplemente presiona "Enter" sin ingresar ningún texto, el método
`readln` devolverá una cadena vacía.

Además, el método `readln` puede aceptar un mensaje opcional como argumento, que se mostrará al usuario antes de la
entrada. Esto es útil para proporcionar instrucciones claras sobre qué tipo de datos se espera.

Entonces para leer los 8 tipos de datos primitivos en Java, puedes usar la clase IO de la siguiente manera:

```java
public class LeerDatosPrimitivos {
    void main() {
        // Leer un entero
        int entero = Integer.parseInt(IO.readln("Ingresa un número entero: "));
        IO.println("Número entero ingresado: " + entero);

        // Leer un número de punto flotante
        float flotante = Float.parseFloat(IO.readln("Ingresa un número de punto flotante: "));
        IO.println("Número de punto flotante ingresado: " + flotante);

        // Leer un número de punto doble
        double doble = Double.parseDouble(IO.readln("Ingresa un número de punto doble: "));
        IO.println("Número de punto doble ingresado: " + doble);

        // Leer un carácter
        char caracter = IO.readln("Ingresa un carácter: ").charAt(0);
        IO.println("Carácter ingresado: " + caracter);

        // Leer un valor booleano
        boolean booleano = Boolean.parseBoolean(IO.readln("Ingresa un valor booleano (true/false): "));
        IO.println("Valor booleano ingresado: " + booleano);

        // Leer un byte
        byte byteValor = Byte.parseByte(IO.readln("Ingresa un valor byte: "));
        IO.println("Valor byte ingresado: " + byteValor);

        // Leer un short
        short shortValor = Short.parseShort(IO.readln("Ingresa un valor short: "));
        IO.println("Valor short ingresado: " + shortValor);

        // Leer un long
        long longValor = Long.parseLong(IO.readln("Ingresa un valor long: "));
        IO.println("Valor long ingresado: " + longValor);
    }
}
```

## Cadenas con formato y la clase IO

La clase `IO` en Java 25 también facilita la impresión de cadenas con formato utilizando el método la función
`formated`, de la clase `String`. Esto permite a los desarrolladores crear salidas más legibles y estructuradas. A
continuación, se muestra un ejemplo de cómo utilizar esta funcionalidad:

```java
public class FormatearSalida {
    void main() {
        String nombre = "Juan";
        int edad = 30;
        double salario = 2500.50;
        // Usando String.formatted para crear una cadena con formato
        String mensaje = "Nombre: %s, Edad: %d, Salario: %.2f".formatted(nombre, edad, salario);
        IO.println(mensaje);
    }
}
```

En este ejemplo, se utiliza el método `formatted` de la clase `String` para crear una cadena que incluye el nombre,
la edad y el salario de una persona, con un formato específico. El resultado se imprime en la consola utilizando el
método `println` de la clase `IO`.

## Conclusión

La clase `IO` en Java 25 es una herramienta poderosa y versátil para manejar operaciones de entrada y salida. Con sus
mejoras en el rendimiento, la facilidad de uso y el soporte para operaciones asíncronas, la clase `IO` facilita a los
desarrolladores la creación de aplicaciones robustas y eficientes. Ya sea que estés leyendo datos desde el teclado o
escribiendo salidas formateadas, la clase `IO` en Java 25 es una opción confiable y efectiva para tus necesidades de
I/O.