# Tipos de datos & Instrucciones básicas de un algoritmo

## Los tipos de datos

En programación y en pseudocódigo, los tipos de datos son categorías que definen el tipo de valor que una variable puede
almacenar y las operaciones que se pueden realizar con esos valores. Los tipos de datos son fundamentales para la
correcta manipulación y procesamiento de la información en un programa.

### Tipos de datos comunes

1. **Entero (Integer)**: Representa números enteros, tanto positivos como negativos, sin decimales. Ejemplos: -5, 0, 42.
2. **Real (Float o Double)**: Representa números con decimales. Ejemplos: 3.14, -0.001, 2.0.
3. **Carácter (Char)**: Representa un solo carácter, como una letra, un dígito o un símbolo. Ejemplos: 'A', 'b', '
   3', '#'.
4. **Cadena (String)**: Representa una secuencia de caracteres, como palabras o frases. Ejemplos: "Hola", "1234",
   "Writerside".
5. **Booleano (Boolean)**: Representa valores lógicos que pueden ser verdaderos (true) o falsos (false). Ejemplos: true,
   false.
6. **Lista (List o Array)**: Representa una colección ordenada de elementos del mismo tipo.
   Ejemplos: [1, 2, 3], ["manzana", "banana", "cereza"].

## Instrucciones básicas de un algoritmo

Cómo hemos visto, un algoritmo es una secuencia de pasos o instrucciones que se siguen para resolver un problema o
realizar una tarea específica. A continuación, se presentan algunas instrucciones básicas que suelen formar parte de un
algoritmo:

1. **INICIO**: Marca el comienzo del algoritmo.
2. **FIN**: Marca el final del algoritmo.
3. **Leer**: Indica que se debe recibir un valor de entrada, ya sea desde el usuario o desde otra fuente de datos.
4. **Escribir**: Indica que se debe mostrar un valor de salida, ya sea en pantalla, en un archivo o en otro medio.
5. **Hacer**: Indica la asignación de un valor a una variable. Por ejemplo: `Hacer x = 5`.

## Ejemplos de instrucciones básicas

```
Algoritmo AreaCuadrado

Declaración de variables:
    Real: lado, area
1. INICIO
2. Escribir "Ingrese la longitud del lado del cuadrado:"
3. Leer lado
4. Hacer area = lado * lado
5. Escribir "El área del cuadrado es:", area
6. FIN
```