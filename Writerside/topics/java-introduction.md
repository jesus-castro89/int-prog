# Introducción en Java

Java es un lenguaje de programación de propósito general, concurrente, orientado a objetos y basado en clases. Fue
desarrollado por James Gosling en 1995 en Sun Microsystems (ahora propiedad de Oracle Corporation). Java está diseñado
para tener la menor cantidad de dependencias de implementación posibles, lo que permite que las aplicaciones Java se
ejecuten en cualquier plataforma que tenga una Máquina Virtual de Java (JVM). Esto se conoce como el principio de "
escribir una vez, ejecutar en cualquier lugar" (WORA, por sus siglas en inglés).

Java es ampliamente utilizado para desarrollar aplicaciones empresariales, aplicaciones móviles (especialmente en
Android), aplicaciones web, juegos y sistemas embebidos. Algunas de las características clave de Java incluyen:

* Sintaxis similar a C/C++: Java tiene una sintaxis que es familiar para los programadores de C y C++, lo que facilita
  la transición a Java.
* Orientación a objetos: Java es un lenguaje completamente orientado a objetos, lo que permite a los desarrolladores
  crear aplicaciones modulares y reutilizables.
* Gestión automática de memoria: Java utiliza un recolector de basura para gestionar la memoria automáticamente,
  liberando a los desarrolladores de la necesidad de gestionar manualmente la memoria.
* Seguridad: Java tiene varias características de seguridad integradas, como el modelo de seguridad de lasandbox,
  que ayuda a proteger las aplicaciones de amenazas externas.
* Biblioteca estándar extensa: Java viene con una amplia biblioteca estándar que proporciona una gran cantidad de
  funcionalidades listas para usar, desde estructuras de datos hasta herramientas de red y gráficos.

## Compilación e Interpretación

Java utiliza un enfoque híbrido de compilación e interpretación. El código fuente de Java se escribe en archivos con
la extensión `.java`. Este código fuente se compila utilizando el compilador de Java (`javac`), que convierte el código
fuente en código bytecode, almacenado en archivos con la extensión `.class`. El bytecode es un conjunto de instrucciones
intermedio que no está vinculado a ninguna plataforma específica.

El bytecode se ejecuta en la Máquina Virtual de Java (JVM), que interpreta el bytecode y lo convierte en instrucciones
nativas de la plataforma en tiempo de ejecución. La JVM es responsable de gestionar la memoria, la seguridad y la
optimización del rendimiento durante la ejecución del programa.

## Estructura de un Programa Java

Un programa Java típico consta de una o más clases. Cada clase contiene métodos y atributos que definen el
comportamiento y el estado de los objetos creados a partir de esa clase. La clase principal del programa debe contener
el método `main`, que es el punto de entrada del programa.

Aquí hay un ejemplo simple de un programa Java:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

En este ejemplo, la clase `HolaMundo` contiene el método `main`, que imprime "¡Hola, Mundo!" en la consola cuando se
ejecuta el programa.

Es importante mencionar que el bloque de ejecución del programa comienza en el método `main`, y cualquier otro
método o clase debe ser llamado desde este punto de entrada para que el programa funcione correctamente.