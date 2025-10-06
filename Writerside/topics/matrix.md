# Arreglos multidimensionales o matrices

En Java, una matriz (o arreglo multidimensional) es una estructura de datos que permite almacenar datos en una forma
tabular, es decir, en filas y columnas. Las matrices son útiles cuando se necesita representar datos que tienen una
relación bidimensional, como una tabla de calificaciones, un tablero de juego, o cualquier otra estructura que requiera
dos dimensiones.

## Declaración e inicialización de matrices

Para declarar una matriz en Java, se utiliza la siguiente sintaxis:

![matrix_1.png](matrix_1.png){style="block"}

- `tipo`: El tipo de datos que almacenará la matriz (por ejemplo, `int`, `String`, `double`, etc.).
- `nombreMatriz`: El nombre que le damos a la matriz.
- `filas`: La cantidad de filas que tendrá la matriz.
- `columnas`: La cantidad de columnas que tendrá la matriz.
- `valor1, valor2, ...`: Los valores iniciales que queremos asignar a la matriz.

## Acceso a los elementos de la matriz

Los elementos de una matriz se acceden mediante dos índices: uno para la fila y otro para la columna. Por ejemplo, para
acceder al elemento en la primera fila y la segunda columna de una matriz llamada `miMatriz`, usaríamos
`miMatriz[0][1]`.

Por convención, el primer índice representa la fila y el segundo índice representa la columna. Ambos índices comienzan
en 0.

## Manipulación de matrices

Podemos recorrer una matriz utilizando bucles `for` anidados para acceder y manipular cada uno de sus elementos. Aquí
hay un ejemplo:

![matrix_2.png](matrix_2.png){style="block"}

En este ejemplo, `matriz.length` devuelve la cantidad de filas en la matriz, y `matriz[i].length` devuelve la cantidad
de columnas en la fila `i`. Los bucles `for` anidados permiten recorrer cada elemento de la matriz e imprimirlo en la
consola.

## Resumen

- Una matriz es una estructura de datos que almacena datos en una forma bidimensional (filas y columnas).
- Se declara e inicializa utilizando la sintaxis mencionada.
- Los elementos se acceden mediante dos índices: uno para la fila y otro para la columna.
- Podemos recorrer y manipular los elementos de una matriz utilizando bucles `for` anidados.