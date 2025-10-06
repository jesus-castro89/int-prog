# Las estructuras de control while y do-while en Java

En Java, las estructuras de control `while` y `do-while` se utilizan para ejecutar un bloque de código repetidamente
mientras se cumpla una condición específica. A continuación, se explica cada una de estas estructuras con ejemplos.

## Estructura `while`

La estructura `while` evalúa una condición antes de ejecutar el bloque de código. Si la condición es verdadera, el
bloque de código se ejecuta. Este proceso se repite hasta que la condición sea falsa.

![while_1.png](while_1.png){style="block"}

Cómo funciona:

1. Se evalúa la condición.
2. Si la condición es verdadera, se ejecuta el bloque de código dentro del `while`.
3. Después de ejecutar el bloque, se vuelve a evaluar la condición.
4. Si la condición sigue siendo verdadera, se repite el proceso. Si es falsa, se sale del bucle.
5. El flujo del programa continúa con la siguiente instrucción después del bucle.

### Estructura básica del `while`

![while_2.png](while_2.png){style="block"}

> Hay que tener cuidado con los bucles infinitos, que ocurren cuando la condición nunca se vuelve falsa.
> Para evitar esto, asegúrate de que la condición se modifique dentro del bucle, por ejemplo, incrementando un contador
> o cambiando una variable de control.
> {style="warning"}

### Ejemplo de `while`

![while_3.png](while_3.png){style="block"}

## Estructura `do-while`

La estructura `do-while` es similar a `while`, pero la diferencia principal es que el bloque de código se ejecuta
al menos una vez antes de evaluar la condición. Después de la primera ejecución, la condición se evalúa y, si es
verdadera, el bloque de código se ejecuta nuevamente. Este proceso se repite hasta que la condición sea falsa.

![do_while_1.png](do_while_1.png){style="block"}

Cómo funciona:

1. Se ejecuta el bloque de código dentro del `do`.
2. Después de ejecutar el bloque, se evalúa la condición.
3. Si la condición es verdadera, se repite el proceso desde el paso 1. Si es falsa, se sale del bucle.
4. El flujo del programa continúa con la siguiente instrucción después del bucle.
5. El bloque de código se ejecuta al menos una vez, independientemente de la condición.

### Estructura básica del `do-while`

![do_while_2.png](do_while_2.png){style="block"}

### Ejemplo de `do-while`

![do_while_3.png](do_while_3.png){style="block"}

## Resumen

* La estructura `while` evalúa la condición antes de ejecutar el bloque de código, por lo que puede que el bloque
  no se ejecute si la condición es falsa desde el principio.
* La estructura `do-while` ejecuta el bloque de código al menos una vez antes de evaluar la condición, garantizando que
  el bloque se ejecute al menos una vez.
* Ambas estructuras son útiles para repetir acciones mientras se cumplan ciertas condiciones, pero la elección entre
  ellas depende de si necesitas que el bloque se ejecute al menos una vez o no.