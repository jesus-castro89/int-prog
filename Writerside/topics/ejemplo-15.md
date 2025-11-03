# Ejemplo 15: Funciones de texto y elementos aleatorios en Java

En este ejemplo, exploraremos algunas funciones comunes para manipular y analizar cadenas de texto en Java. Estas
funciones incluyen la conversión de mayúsculas y minúsculas, la búsqueda de subcadenas, la extracción de partes de una
cadena y la eliminación de espacios en blanco. También veremos cómo generar números aleatorios utilizando la clase
`Random` de Java.

## Funciones de texto en Java

Java proporciona varias funciones integradas para trabajar con cadenas de texto. Aquí hay algunas de las más comunes:

| Función                                                  | Descripción                                                                                                       |
|----------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| `toUpperCase()`                                          | Convierte todos los caracteres de una cadena a mayúsculas.                                                        |
| `toLowerCase()`                                          | Convierte todos los caracteres de una cadena a minúsculas.                                                        |
| `indexOf(String str)`                                    | Devuelve la posición de la primera aparición de la subcadena `str` en la cadena. Si no se encuentra, devuelve -1. |
| `substring(int beginIndex, int endIndex)`                | Extrae una parte de la cadena desde `beginIndex` hasta `endIndex - 1`.                                            |
| `trim()`                                                 | Elimina los espacios en blanco al principio y al final de la cadena.                                              |
| `length()`                                               | Devuelve la longitud de la cadena.                                                                                |
| `charAt(int index)`                                      | Devuelve el carácter en la posición especificada por `index`.                                                     |
| `replace(CharSequence target, CharSequence replacement)` | Reemplaza todas las apariciones de `target` con `replacement` en la cadena.                                       |

## Generación de números aleatorios

Java proporciona la clase `Random` en el paquete `java.util` para generar números aleatorios. Aquí hay algunos métodos
comunes:

| Método               | Descripción                                                                             |
|----------------------|-----------------------------------------------------------------------------------------|
| `nextInt(int bound)` | Devuelve un número entero aleatorio entre 0 (inclusive) y `bound` (exclusivo).          |
| `nextDouble()`       | Devuelve un número de punto flotante aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo). |
| `nextBoolean()`      | Devuelve un valor booleano aleatorio (true o false).                                    |

## Ejemplos de uso

### Ejemplo básico

![e15.png](e15.png){style="block"}

### Ejemplo Avanzado

![e15_2.png](e15_2.png){style="block"}

## Explicación del código

1. **Conversión de mayúsculas y minúsculas**: Utilizamos los métodos `toUpperCase()` y `toLowerCase()` para convertir
   la cadena original a mayúsculas y minúsculas, respectivamente.
2. **Búsqueda de subcadenas**: Usamos `indexOf()` para buscar la posición de la subcadena "Java" en la cadena
   original.
3. **Extracción de subcadenas**: Utilizamos `substring()` para extraer una parte específica de la cadena.
4. **Eliminación de espacios en blanco**: Aplicamos `trim()` para eliminar los espacios en blanco al inicio y al final
   de la cadena.
5. **Reemplazo de caracteres**: Usamos `replace()` para sustituir todas las apariciones de la letra "a" por "@".
6. **Generación de números aleatorios**: Creamos un objeto `Random` y utilizamos `nextInt(100)` para generar un número
   aleatorio entre 0 y 99. También generamos un carácter aleatorio entre 'A' y 'Z'.