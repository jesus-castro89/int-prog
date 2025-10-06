# Ejemplo 9: Mientras y Hasta que

## Descripción

Este ejemplo ilustra el uso de las estructuras de control `while` (mientras) y `do...while` (hasta que) en Java. Estas
estructuras permiten ejecutar un bloque de código repetidamente mientras se cumpla una condición específica.

## Problema

Queremos crear un programa que solicite al usuario ingresar números enteros hasta que ingrese un número negativo. El
programa debe sumar todos los números ingresados y mostrar el resultado final.

## Solución

### Usando `while`

![e9_while.png](e9_while.png){style="block"}

### Usando `do...while`

![e9_dowhile.png](e9_dowhile.png){style="block"}

## Explicación del código

1. **Declaración e inicialización de variables**: Se declaran las variables `suma` para almacenar la suma total y
   `numero` para almacenar el número ingresado por el usuario.
2. **Entrada del usuario**: Se utiliza `IO.readln` para leer la entrada del usuario y `Integer.parseInt` para convertir
   la cadena ingresada en un número entero.
3. **Bucle `while`**: En el primer ejemplo, el bucle `while` verifica la condición antes de ejecutar el bloque de
   código. Si el número es no negativo, se suma a la variable `suma` y se solicita otro número.
4. **Bucle `do...while`**: En el segundo ejemplo, el bucle `do...while` ejecuta el bloque de código al menos una vez
   antes de verificar la condición. Si el número es no negativo, se suma a la variable `suma` y se solicita otro número.
5. **Salida del resultado**: Al finalizar el bucle, se imprime la suma total de los números ingresados.

> Como podrás notar, en el caso del `do...while`, el bloque de código se ejecuta al menos una vez, lo que es útil cuando
> queremos asegurarnos de que el usuario ingrese al menos un número antes de verificar la condición. En cambio, el
`while` verifica la condición antes de ejecutar el bloque, por lo que si el primer número ingresado es negativo, el
> bloque no se ejecutará.
> {style="info"}

## Resumen

- La estructura de control `while` ejecuta un bloque de código mientras una condición sea verdadera, verificando la
  condición antes de cada iteración.
- La estructura de control `do...while` ejecuta un bloque de código al menos una vez y luego verifica la condición al
  final de cada iteración.
- Ambas estructuras son útiles para repetir acciones basadas en condiciones específicas, pero se utilizan en diferentes
  escenarios según la necesidad de ejecutar el bloque de código al menos una vez o no.