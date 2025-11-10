# Funciones con y sin valor de retorno en Java

En Java, las funciones (o métodos) pueden clasificarse en dos categorías principales según si devuelven un valor o no:
funciones con valor de retorno y funciones sin valor de retorno. A continuación, se explica cada tipo con ejemplos.

## Funciones con valor de retorno

Las funciones con valor de retorno son aquellas que realizan una operación y devuelven un resultado al lugar donde
fueron llamadas. Estas funciones especifican un tipo de dato en su declaración que indica el tipo de valor que
devolverán.

![funcion_t_1.png](funcion_t_1.png){style="block"}

En este ejemplo, la función `potencia` calcula la potencia de un número y devuelve el resultado como un entero.

## Funciones sin valor de retorno

Las funciones sin valor de retorno, por otro lado, no devuelven ningún valor. Estas funciones se declaran con el tipo
`void`, lo que indica que no hay un valor de retorno. Estas funciones suelen utilizarse para realizar acciones como
imprimir mensajes en la consola o modificar el estado de un objeto.

![funcion_t_2.png](funcion_t_2.png){style="block"}

En este ejemplo, la función `imprimirMensaje` simplemente imprime un mensaje en la consola y no devuelve ningún valor.

## Resumen

- Las funciones con valor de retorno devuelven un resultado y especifican un tipo de dato en su declaración.
- Las funciones sin valor de retorno utilizan el tipo `void` y no devuelven ningún valor.
- Ambos tipos de funciones son esenciales para estructurar y organizar el código en Java, permitiendo una mayor
  modularidad y reutilización.