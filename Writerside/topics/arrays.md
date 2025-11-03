# La clase `Arrays`

Dentro de Java, la clase `Arrays` es una utilidad proporcionada en el paquete `java.util` que ofrece métodos estáticos
para manipular arreglos (arrays) de manera eficiente. Esta clase facilita operaciones comunes como ordenar, buscar,
llenar, comparar y convertir arreglos a cadenas, entre otras funcionalidades.

## Importación de la clase `Arrays`

Para utilizar la clase `Arrays`, es necesario importarla al inicio de nuestro archivo Java:

```java
import java.util.Arrays;
```

## Métodos comunes de la clase `Arrays`

| Método                               | Descripción                                                                              |
|--------------------------------------|------------------------------------------------------------------------------------------|
| `Arrays.sort(array)`                 | Ordena el arreglo en orden ascendente.                                                   |
| `Arrays.binarySearch(array, key)`    | Realiza una búsqueda binaria en el arreglo ordenado para encontrar la posición de `key`. |
| `Arrays.fill(array, value)`          | Llena el arreglo con el valor especificado.                                              |
| `Arrays.equals(array1, array2)`      | Compara dos arreglos para verificar si son iguales.                                      |
| `Arrays.toString(array)`             | Convierte el arreglo en una representación de cadena legible.                            |
| `Arrays.copyOf(original, newLength)` | Crea una copia del arreglo original con una nueva longitud.                              |
| `Arrays.asList(array)`               | Convierte un arreglo en una lista.                                                       |
| `Arrays.stream(array)`               | Crea un flujo (stream) a partir del arreglo para operaciones funcionales.                |