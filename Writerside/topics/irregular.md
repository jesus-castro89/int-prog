# Matrices irregulares en Java

En Java, las matrices irregulares (también conocidos como arreglos jagged) son estructuras de datos que permiten
almacenar filas de diferentes longitudes. A diferencia de las matrices tradicionales, donde todas las filas tienen la
misma cantidad de columnas, en las matrices irregulares cada fila puede tener un número distinto de elementos.

## Declaración e inicialización de matrices irregulares

Para declarar una matriz irregular en Java, se utiliza la siguiente sintaxis:

![irregular_1.png](irregular_1.png){style="block"}

- `tipo`: El tipo de datos que almacenará la matriz (por ejemplo, `int`, `String`, `double`, etc.).
- `nombreMatriz`: El nombre que le damos a la matriz.
- `filas`: La cantidad de filas que tendrá la matriz. La cantidad de columnas se define individualmente para cada fila.

Después de declarar la matriz, es necesario inicializar cada fila con un arreglo de la longitud deseada. Aquí hay un
ejemplo:

![irregular_2.png](irregular_2.png){style="block"}

También es posible inicializar una matriz irregular directamente con valores:

![irregular_3.png](irregular_3.png){style="block"}

## Acceso a los elementos de la matriz irregular

Los elementos de una matriz irregular se acceden mediante dos índices: uno para la fila y otro para la columna. Por
ejemplo, para acceder al elemento en la primera fila y la segunda columna de una matriz llamada `miMatrizIrregular`,
usaríamos `miMatrizIrregular[0][1]`.

Por convención, el primer índice representa la fila y el segundo índice representa la columna. Ambos índices comienzan
en 0.

## Manipulación de matrices irregulares

Podemos recorrer una matriz irregular utilizando bucles `for` anidados para acceder y manipular cada uno de sus
elementos. Aquí hay un ejemplo:

![irregular_4.png](irregular_4.png){style="block"}

En este ejemplo, `matrizIrregular.length` devuelve la cantidad de filas en la matriz, y `matrizIrregular[i].length`
devuelve la cantidad de columnas en la fila `i`. Los bucles `for` anidados permiten recorrer cada elemento de la matriz
e imprimirlo en la consola.

## Resumen

- Una matriz irregular es una estructura de datos que almacena filas de diferentes longitudes.
- Se declara utilizando la sintaxis mencionada y se inicializa cada fila individualmente.
- Los elementos se acceden mediante dos índices: uno para la fila y otro para la columna.
- Podemos recorrer y manipular los elementos de una matriz irregular utilizando bucles `for` anidados.