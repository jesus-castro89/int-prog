# Las funciones `equals()`  y `equalsIgnoreCase()`

En Java no es posible comparar cadenas de texto (Strings) utilizando los operadores relacionales como `==` o `!=`, ya
que estos operadores comparan las referencias de memoria y no el contenido real de las cadenas.

Para comparar el contenido de dos cadenas de texto, se utilizan los métodos `equals()` y `equalsIgnoreCase()` de la
clase `String`.

- `equals()`: Este método compara dos cadenas de texto teniendo en cuenta las mayúsculas y minúsculas. Devuelve `true`
  si las cadenas son exactamente iguales y `false` en caso contrario.

  ```java
      String str1 = "Hola";
      String str2 = "Hola";
      String str3 = "hola";
    
      boolean resultado1 = str1.equals(str2); // true
      boolean resultado2 = str1.equals(str3); // false
  ```

- `equalsIgnoreCase()`: Este método compara dos cadenas de texto sin tener en cuenta las mayúsculas y minúsculas.
  Devuelve `true` si las cadenas son iguales ignorando las diferencias de mayúsculas y minúsculas, y `false` en caso
  contrario.

  ```java
    String str1 = "Hola";
    String str2 = "hola";
    String str3 = "HOLA";
    boolean resultado1 = str1.equalsIgnoreCase(str2); // true
    boolean resultado2 = str1.equalsIgnoreCase(str3); // true
  ```

Estos métodos son fundamentales para realizar comparaciones de cadenas de texto en Java de manera correcta y segura.

## Ejemplo de uso

```java
public class ComparacionCadenas {
    void main() {
        String palabra1 = IO.readString("Ingrese la primera palabra: ");
        String palabra2 = IO.readString("Ingrese la segunda palabra: ");

        if (palabra1.equals(palabra2)) {
            IO.println("Las palabras son iguales (considerando mayúsculas y minúsculas).");
        } else {
            IO.println("Las palabras son diferentes (considerando mayúsculas y minúsculas).");
        }

        if (palabra1.equalsIgnoreCase(palabra2)) {
            IO.println("Las palabras son iguales (ignorando mayúsculas y minúsculas).");
        } else {
            IO.println("Las palabras son diferentes (ignorando mayúsculas y minúsculas).");
        }
    }
}
```

En este ejemplo, el programa solicita al usuario que ingrese dos palabras y luego utiliza los métodos `equals()` y
`equalsIgnoreCase()` para comparar las palabras, mostrando los resultados correspondientes.

## Conclusión

En resumen, para comparar cadenas de texto en Java, es esencial utilizar los métodos `equals()` y `equalsIgnoreCase()`
de la clase `String`, ya que los operadores relacionales no son adecuados para este propósito.