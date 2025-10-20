# Los arreglos en pseudocódigo

Dentro de la programación, los arreglos (o vectores) son estructuras de datos que permiten almacenar múltiples valores
bajo un mismo nombre, facilitando la gestión y manipulación de conjuntos de datos relacionados. En pseudocódigo, los
arreglos se representan de manera sencilla y clara, permitiendo a los programadores conceptualizar y planificar sus
algoritmos antes de implementarlos en un lenguaje de programación específico.

## Definición de un Arreglo

Para definir un arreglo en pseudocódigo, se utiliza la palabra clave `ARREGLO` seguida del nombre del arreglo, el tipo
de datos que almacenará y la cantidad de elementos que contendrá. Por ejemplo:

```
ARREGLO: notas[5] DE ENTERO
```

Este ejemplo define un arreglo llamado `notas` que puede almacenar 5 valores enteros.

## Acceso a Elementos del Arreglo

Los elementos de un arreglo se acceden utilizando índices, que comienzan en 0. Por ejemplo, para asignar un valor al
primer elemento del arreglo `notas`, se haría de la siguiente manera:

```
notas[0] = 85
```

Para acceder al valor del segundo elemento, se utilizaría:

```
valor = notas[1]
```

## Recorrido de un Arreglo

Para recorrer un arreglo y realizar operaciones con sus elementos, se puede utilizar un bucle `PARA`. Por ejemplo, para
imprimir todos los valores almacenados en el arreglo `notas`, se podría hacer lo siguiente:

```
PARA i DESDE 0 HASTA 4 HACER
    ESCRIBIR notas[i]
```

## Ejemplo Completo

A continuación, se presenta un ejemplo completo que muestra cómo utilizar un arreglo para almacenar y calcular el
promedio de calificaciones de estudiantes:

```
PromedioCalificaciones

Definición de Variables:
    ARREGLO: calificaciones[5] DE ENTERO
    ENTERO: suma, promedio, i

1. INICIO
2. HACER suma = 0
3. PARA i DESDE 0 HASTA 4 HACER
    ESCRIBIR "Ingrese la calificación del estudiante ", i + 1
    LEER calificaciones[i]
    suma = suma + calificaciones[i]
4. HACER promedio = suma / 5
5. ESCRIBIR "El promedio de las calificaciones es: ", promedio
6. FIN
```

En este ejemplo, se define un arreglo `calificaciones` para almacenar las notas de 5 estudiantes. Se utiliza un bucle
`PARA` para solicitar al usuario que ingrese cada calificación, sumarlas y finalmente calcular y mostrar el promedio.

## Conclusión

Los arreglos son herramientas fundamentales en la programación que permiten manejar conjuntos de datos de manera
eficiente. El uso de arreglos en pseudocódigo facilita la planificación y el diseño de algoritmos, proporcionando una
base sólida para la implementación en lenguajes de programación más complejos.