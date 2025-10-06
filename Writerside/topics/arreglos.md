# Arreglos unidimensionales

Dentro de Java, un arreglo (o array) es una estructura de datos que permite almacenar múltiples valores del mismo tipo
en una sola variable. Los arreglos son útiles cuando se necesita manejar una colección de datos relacionados, como una
lista de números, nombres o cualquier otro tipo de información.

## Declaración e inicialización de arreglos

Para declarar un arreglo en Java, podemos usar dos tipos de sintaxis:

![array.png](array.png){style="block"}

- `tipo`: El tipo de datos que almacenará el arreglo (por ejemplo, `int`, `String`, `double`, etc.).
- `nombreArreglo`: El nombre que le damos al arreglo.
- `tamaño`: La cantidad de elementos que el arreglo puede contener.
- `valor1, valor2, ...`: Los valores iniciales que queremos asignar al arreglo.

## Acceso a los elementos del arreglo

Los elementos de un arreglo se acceden mediante su índice, que comienza en 0. Por ejemplo, para acceder al primer
elemento de un arreglo llamado `miArreglo`, usaríamos `miArreglo[0]`.

Por convención, el último índice de un arreglo es `tamaño - 1`. Por ejemplo, si un arreglo tiene 5 elementos, los
índices serán del 0 al 4.

## Manipulación de arreglos

Podemos recorrer un arreglo utilizando un bucle `for` para acceder y manipular cada uno de sus elementos. Aquí hay un
ejemplo:

![array_2.png](array_2.png){style="block"}

En este ejemplo, `numeros.length` devuelve la cantidad de elementos en el arreglo `numeros`, y el bucle `for` itera
a través de cada elemento, imprimiéndolo en la consola.

## Resumen

- Un arreglo es una estructura de datos que almacena múltiples valores del mismo tipo.
- Se declara e inicializa utilizando una de las dos sintaxis mencionadas.
- Los elementos se acceden mediante índices que comienzan en 0.
- Podemos recorrer y manipular los elementos de un arreglo utilizando bucles como `for`.