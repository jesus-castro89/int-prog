# La estructura de control `for`

En Java, la estructura de control `for` se utiliza para repetir un bloque de código un número específico de veces. Es
especialmente útil cuando se conoce de antemano cuántas veces se debe ejecutar el bucle.

## Sintaxis del bucle `for`

![for_1.png](for_1.png){style="block"}

¿Cómo funciona?:

- **Inicialización**: Se ejecuta una vez al comienzo del bucle. Aquí se suelen declarar e inicializar las variables de
  control, aunque también se pueden usar variables ya declaradas.
- **Condición**: Se evalúa antes de cada iteración. Si la condición es verdadera (`true`), el bloque de código dentro
  del bucle se ejecuta. Si es falsa (`false`), el bucle termina. No es usual, pero se puede omitir la condición, en cuyo
  caso el bucle se ejecutará indefinidamente a menos que se use una instrucción `break` para salir del mismo.
- **Actualización**: Se ejecuta al final de cada iteración. Aquí se suelen modificar las variables de control, como
  incrementar o decrementar un contador. También se puede omitir la actualización, pero en ese caso es importante
  asegurarse de que la condición eventualmente se vuelva falsa para evitar un bucle infinito.
- **Cuerpo del bucle**: Es el bloque de código que se ejecuta en cada iteración mientras la condición sea verdadera.
- **Nota**: Todos los componentes (inicialización, condición y actualización) son opcionales, pero los puntos y comas
  (`;`) deben mantenerse para indicar las separaciones.

## Ejemplo básico de un bucle `for`

![for_2.png](for_2.png){style="block"}

En este ejemplo, el bucle `for` inicializa la variable `i` en 1, verifica que `i` sea menor o igual a 5, e incrementa
`i` en 1 en cada iteración. El resultado será la impresión de los números del 1 al 5.

## Resumen

- La estructura de control `for` es ideal para repetir un bloque de código un número específico de veces.
- Se compone de tres partes principales: inicialización, condición y actualización.
- Es importante asegurarse de que la condición eventualmente se vuelva falsa para evitar bucles infinitos.
- El cuerpo del bucle contiene el código que se ejecuta en cada iteración mientras la condición sea verdadera.
- Todos los componentes son opcionales, pero los puntos y comas deben mantenerse.