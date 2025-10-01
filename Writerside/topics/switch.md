# La estructura `switch`

La estructura `switch` en Java es una forma de controlar el flujo del programa basándose en el valor de una variable o
expresión. Es especialmente útil cuando se tiene que comparar una variable con múltiples valores posibles y ejecutar
diferentes bloques de código según el valor coincidente.

## Sintaxis

![switch_1.png](switch_1.png)

Sin embargo, a partir de Java 14, se introdujo una nueva sintaxis para `switch` que permite usar expresiones y
simplifica el código:

![switch_2.png](switch_2.png)

## Componentes

- `switch (expresión)`: Aquí se especifica la variable o expresión que se va a evaluar.
- `case valor1:`: Cada `case` representa un valor posible que la expresión puede tomar. Si la expresión coincide con
  `valor1`, se ejecuta el bloque de código asociado.
- `break;`: La instrucción `break` se utiliza para salir del `switch` una vez que se ha ejecutado un bloque de código.
  Si no se incluye, el programa continuará ejecutando los siguientes casos (esto se llama "fall through").
- `default:`: Esta sección es opcional y se ejecuta si ninguno de los casos anteriores coincide con el valor de la
  expresión.
- `->`: En la nueva sintaxis, el operador `->` se utiliza para separar el caso del bloque de código que se ejecutará.
- `{...}`: En la nueva sintaxis, los bloques de código pueden estar entre llaves si contienen múltiples instrucciones.
- `case valor1, valor2 -> {...}`: En la nueva sintaxis, se pueden agrupar múltiples valores en un solo caso.

## Ejemplo

Supongamos que queremos evaluar el día de la semana y mostrar un mensaje correspondiente:

![switch_3.png](switch_3.png)

En este ejemplo, dependiendo del número ingresado por el usuario (del 1 al 7), se imprimirá el día correspondiente de la
semana. Si el número no está en ese rango, se imprimirá "Día inválido".