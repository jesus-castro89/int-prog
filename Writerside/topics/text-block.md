# Los bloques de texto en Java

En Java, los bloques de texto son una característica que permite definir cadenas de texto multilínea de manera más
sencilla y legible. Fueron introducidos en Java 13 como una característica preliminar y se estabilizaron en Java 15.

## Sintaxis de los bloques de texto

Un bloque de texto se define utilizando tres comillas dobles (`"""`) al inicio y al final del bloque. Aquí tienes un
ejemplo básico:

```
String texto = """
    Este es un bloque de texto
    que puede abarcar múltiples líneas
    sin necesidad de caracteres de escape.
    """;
```

En este ejemplo, el bloque de texto contiene varias líneas y se asigna a la variable `texto`.

## Características de los bloques de texto

1. **Multilínea**: Puedes escribir texto en varias líneas sin necesidad de usar caracteres de escape como `\n`.
2. **Indentación automática**: La indentación del bloque de texto se ajusta automáticamente según la posición del
   delimitador de cierre (`"""`). Esto facilita la lectura y el mantenimiento del código.
3. **Soporte para comillas dobles**: Puedes incluir comillas dobles dentro del bloque de texto sin necesidad de
   escaparlas.
4. **Espacios en blanco**: Los espacios en blanco al inicio de cada línea dentro del bloque de texto se conservan, lo
   que permite mantener la estructura del texto.
5. **Texto con formato**: Puedes incluir texto con formato, mediante el uso de los comodines `%` para formatear cadenas,
   similar a `String.format()`.

## Ejemplo avanzado

Aquí tienes un ejemplo más avanzado que muestra algunas de estas características:

```java
public class BloqueDeTexto {
    void main() {
        
        String usuario = "Juan";
        String salida = """
                Hola %s, bienvenido a los bloques de texto en Java.
                Este bloque de texto puede incluir "comillas dobles" sin problemas.
                También puedes escribir en múltiples líneas
                y mantener la indentación adecuada.
                """.formatted(usuario);
        IO.println(salida);
    }
}
```